var webapp = angular.module('webApp');
webapp .controller( 'ConvenioListController',function($scope, $rootScope, $stateParams, $q, convenioService, whttp) {
	var vm = this;
 

	vm.init = function() { 
		//vm.listaConvenio();
		vm.dataConenioFull = [
			{
				nuConvenio: 600500,
				noConvenio: "CONVENIO XPTO",
				noUf: "DF",
				nuCgcBasico: 489828,
				nuCgcOrdem: 10,
				nuCgcDv: 46,
				nuCpf: 0, 
				nuCpfDv: 0,
				nuTelefone: 33692525,
				dtInclusao: "01/01/2000"
			},
			{
				nuConvenio: 988988,
				noConvenio: "CONVENIO CASAS BAHIA",
				noUf: "DF",
				nuCgcBasico: 123456,
				nuCgcOrdem: 1,
				nuCgcDv: 7,
				nuCpf: 0, 
				nuCpfDv: 0,
				nuTelefone: 33692525,
				dtInclusao: "01/01/2001"
			},
			
		];
	}

	vm.listaConvenio = function() {
		convenioService.listConvenio().then(function(res) {
			if (res != null && res != undefined) {
				vm.dataConenioFull = res.data.data[0];
				console.log('LISTA DE CONVENIOS:');
				console.log(res.data.data[0]);
			} else {
				console.log('LISTA DE CONVENIOS - NENHUM RESULTADO');
			}
		})
	}
 

});
