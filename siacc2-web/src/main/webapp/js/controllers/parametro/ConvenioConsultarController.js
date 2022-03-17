var webapp = angular.module('webApp');
webapp.controller('ConvenioConsultarController', function($scope, $rootScope) {

	$rootScope.menuHeader = [ {
		"item" : "Parâmetros",
		"link" : "",
		"active" : ""
	}, {
		"item" : "Consultar a Convênio",
		"link" : "consultarconvenio",
		"class" : "active"
	}  ]
	$scope.checkTipopessoaFisica = true; 
	$scope.checkTipopessoaJuridica = false; 
	
	 
	 
	$scope.iniciar = function() {	
	
	}
	 
	

});