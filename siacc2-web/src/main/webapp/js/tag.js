(function() {
	var indexFile = (location.pathname.match(/\/(index[^\.]*\.html)/) || ['', ''])[1],
		rUrl = /(#!\/|api|guide|misc|tutorial|error|index[^\.]*\.html).*$/,
		baseUrl = location.href.replace(rUrl, indexFile),
		production = location.hostname === 'docs.angularjs.org',
		headEl = document.getElementsByTagName('head')[0],
		sync = true;

	addTag('base', { href: baseUrl });
 	
 

	addTag('script', { src: './js/directives/numberUltil.js' }, sync); 
	addTag('script', { src: './js/directives/tipoPessoaDirective.js' }, sync); 
	
	addTag('script', { src: './js/app.js' }, sync);
	addTag('script', { src: './js/whttp.js' }, sync); 
	addTag('script', { src: './js/modalService.js' }, sync);
	addTag('script', { src: './js/config.js' }, sync); 
	
	addTag('script', { src: './js/services/pacoteService.js' }, sync);
	addTag('script', { src: './js/services/convenioService.js' }, sync);


	addTag('script', { src: './js/controllers.js' }, sync);
	addTag('script', { src: './js/indexController.js' }, sync);
	addTag('script', { src: './js/menuController.js' }, sync);
	
	addTag('script', { src: './js/controllers/pacote/PacoteManutencaoController.js' }, sync);
	addTag('script', { src: './js/controllers/pacote/PacoteListController.js' }, sync);
	

	addTag('script', { src: './js/controllers/convenio/ConvenioIncluirController.js' }, sync);
	addTag('script', { src: './js/controllers/convenio/ConvenioListController.js' }, sync);
	
	 
	addTag('script', { src: './js/controllers/parametro/ConvenioConsultarController.js' }, sync);
	addTag('script', { src: './js/controllers/parametro/GeralIncluirController.js' }, sync);

	addTag('script', { src: './js/controllers/servico/ServicoIncluirController.js' }, sync);
	addTag('script', { src: './js/controllers/servico/ServicoListController.js' }, sync);

	addTag('script', { src: './js/controllers/simulador/SimuladorAprovarController.js' }, sync);
	addTag('script', { src: './js/controllers/simulador/SimuladorIncluirController.js' }, sync);
	addTag('script', { src: './js/controllers/simulador/SimuladorListController.js' }, sync);
	 

	 
	
	
	function addTag(name, attributes, sync) {
		var el = document.createElement(name),
			attrName;

		for (attrName in attributes) {
			el.setAttribute(attrName, attributes[attrName]);
		}

		sync ? document.write(outerHTML(el)) : headEl.appendChild(el);
	}

	function outerHTML(node) {
		// if IE, Chrome take the internal method otherwise build one
		return node.outerHTML || (
			function(n) {
				var div = document.createElement('div'), h;
				div.appendChild(n);
				h = div.innerHTML;
				div = null;
				return h;
			})(node);
	}
})();