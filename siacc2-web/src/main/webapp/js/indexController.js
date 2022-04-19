var webapp = angular.module('webApp');
webapp.controller('IndexController', function($scope,$state, $rootScope,$filter) {
	
	$rootScope.openViewPagina = function(page) { 
		$rootScope.menuHeader = null;
		$state.go(page);
	}
	$rootScope.openViewPaginaParam = function(page, param) { 
		$rootScope.menuHeader = null;
		$state.go(page, param);
	}
	
	$rootScope.nomeUsuarioLogado = "Fulano de Tal da Silva";
	$rootScope.matricula = "C000001";
	 
})
