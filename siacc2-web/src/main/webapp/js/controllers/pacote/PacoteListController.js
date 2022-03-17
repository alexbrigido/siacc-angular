var webapp = angular.module('webApp');
webapp.controller('PacoteListController', function($scope,$q, $rootScope, whttp, modalService) {
 
	$scope.dataFull=[]; 
	
	$scope.listar = function() {	
		// modalService.showAlert("Aten\u00E7\u00E3o", "Usuário sem acesso ao sistema") 
			
		whttp.get( "ws/pacote/listar")		
		.then(function(res) { 									
			if (res != null &&  res != undefined) {				 
				$scope.listaPacoteFull = res.data[0]; 
				
				console.log($scope.listaPacoteFull );
				
			}else{ 
			}
	    }, function(request, status, err) {
	    	 
	    });  
		 
			
		
	}
	
	
	
	
});