var webapp = angular.module('webApp');
webapp.controller('ServicoListController', function($scope, $rootScope) {

	$rootScope.menuHeader = [ {
		"item" : "Parametrização",
		"link" : "",
		"active":""
	}, {
		"item" : "Servico",
		"link" : "",
		"class":"active"
	} ]
	$scope.dataFull=[]; 
	
	$scope.listar = function() {	
		for (var i = 0; i < 25; i++) {
			
			
			var rowData = {
					"compromisso" :  "0001 - Pagamento A fornecedor",
					"tipopacote" :  "00005010 - Pacote Simulado",
					"pacote" :  "PACOTE SIMULACAO "+i,
					"dataInclusao" :  "02/01/2001"  
				};
			
			$scope.dataFull.push(rowData);	 
			
		}
			
		
	}
	
	
	
});