var webapp = angular.module('webApp');
webapp.controller('GeralIncluirController', function($scope, $rootScope) {

	$rootScope.menuHeader = [ {
		"item" : "Parâmetros",
		"link" : "",
		"active" : ""
	}, {
		"item" : "Geral",
		"link" : "geral",
		"class" : "active"
	}  ]

	

});