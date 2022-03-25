var webapp = angular.module('webApp');
webapp .controller( 'ConvenioListController',function($scope, $rootScope, $stateParams, $q, convenioService, whttp) {
	var vm = this;
 

	vm.init = function() { 
		vm.listaConvenio();
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
