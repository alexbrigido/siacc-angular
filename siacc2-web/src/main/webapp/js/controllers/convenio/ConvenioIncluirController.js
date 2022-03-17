var webapp = angular.module('webApp');
webapp.controller('ConvenioIncluirController', function($scope, $rootScope, convenioService) {
	var vm = this;
   
	
	vm.consultaConvenio = function() {
		
		convenioService.consultaConvenio(vm.pessoaJuridica)
			.then(function(res) {
			if (res != null && res != undefined) {
				vm.dataConenio = res.data[0];
				console.log(vm.dataConenio)
			} else {
			}
		}) 
	}
	
	
		vm.fiterTipoEsfera = function(item) {    
		    if ($rootScope.tipoEsfera.length == 0) return true;		    
		    var retorno = item.idTipoEmpresa.filter(function(e) {return e.id==vm.dataConenio.icTipoEmpresa});
		    if (retorno.length>0){
		    	return true;
		    }else{
				return false;
		    }  
		};
		
		vm.fiterCategoriaPote = function(item) {    
		    if ($rootScope.categoriaPote.length == 0) return true;		    
		    var retorno = item.idTipoEmpresa.filter(function(e) {return e.id==vm.dataConenio.icTipoEmpresa});
		    if (retorno.length>0){
		    	return true;
		    }else{
				return false;
		    }  
		};
	
});