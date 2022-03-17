var webapp = angular.module('webApp');
webapp.controller('SimuladorIncluirController', function($scope, $rootScope) {

	$rootScope.menuHeader = [ {
		"item" : "Simulador",
		"link" : "simulador",
		"active" : ""
	}, {
		"item" : "Incluir",
		"link" : "",
		"class" : "active"
	} ]

	$scope.pessoaJuridica=""
	
	$scope.today = moment();
	moment.lang('pt');
	
	$scope.dataFull = [];
	$scope.myMonth = moment().month(0).year(2020);
	$scope.dateMultiple = [];
 
	 
	$scope.listar = function() {
		for (var i = 0; i < 25; i++) {

			var rowData = {
				"compromisso" : "0001 - Pagamento A fornecedor",
				"tipopacote" : "00005010 - Pacote Simulado",
				"pacote" : "PACOTE SIMULACAO " + i,
				"dataInclusao" : "02/01/2001"
			};

			$scope.dataFull.push(rowData);

		}

	}
	 

});


 
