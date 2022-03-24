var webapp = angular.module('webApp');
webapp.controller('PacoteListController', function($scope,$q, $rootScope, whttp, modalService) {
 
	$scope.dataFull=[]; 
	
	$scope.listar = function() {	
		// modalService.showAlert("Aten\u00E7\u00E3o", "Usuário sem acesso ao sistema") 
			
			/*
		whttp.get( "ws/pacote/listar")		
		.then(function(res) { 									
			if (res != null &&  res != undefined) {				 
				$scope.listaPacoteFull = res.data[0]; 
				
				console.log($scope.listaPacoteFull );
				
			}else{ 
			}
	    }, function(request, status, err) {
	    	 
	    });  
		 
			*/
			$scope.listaPacoteFull = [
				{
					nuPacote: 1,
					nomePacote: 'Pacote 01',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
					
				},
				{
					nuPacote: 2,
					nomePacote: 'Pacote 02',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
				},
				{
					nuPacote: 3,
					nomePacote: 'Pacote Tres',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '23/03/2022'
				},
				{
					nuPacote: 4,
					nomePacote: 'Pacote Teste',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '24/03/2022'
				}
			]
		
	}
	
	
	
	
});