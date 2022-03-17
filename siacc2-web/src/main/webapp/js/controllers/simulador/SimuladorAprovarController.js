var webapp = angular.module('webApp');
webapp.controller('SimuladorAprovarController', function($scope, $rootScope) {

	$rootScope.menuHeader = [ {
		"item" : "Simulador",
		"link" : "simulador/aprovar",
		"active" : ""
	}, {
		"item" : "Aprovar",
		"link" : "",
		"active" : "active"
	} ]
	
	
	$scope.dataFull = [];

	
	$scope.listar = function() {
		for (var i = 0; i < 25; i++) {

			var rowData = {
				"simulador" : "0001" + i,
				"compromisso" : "0001 - Pagamento A fornecedor",
				"tipopacote" : "00005010 - Pacote Simulado",
				"pacote" : "PACOTE SIMULACAO " + i,
				"dataInclusao" : "02/01/2001"
			};

			$scope.dataFull.push(rowData);

		}
	}
});