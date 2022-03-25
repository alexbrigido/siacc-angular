var webApp = angular.module('webApp');
webApp.factory('convenioService', ['$http','$rootScope','whttp','$q',	function($http, $rootScope, whttp, $q) {

	var factory = {};

	factory.listConvenio = function() {
		var deferred = $q.defer();
		var paramenter = "ws/convenio/findAll";

		$http.get(paramenter).then(function(res) {
			if (!res.temErro) {
				console.log(res);
				deferred.resolve(res);
			} else {
				console.log('erro');
				deferred.reject(null);
			}
		}, function(request, status, err) {
			console.log('erro: ' + status);
		});

		return deferred.promise;
	}
	
	factory.consultaConvenio = function(tipoPessoa) {
		var deferred = $q.defer();
		var paramenter = "ws/convenio/consulta";

		whttp.post(paramenter,angular.toJson(tipoPessoa))
		.then(function(res) {
			if (!res.temErro) {
				deferred.resolve(res);
			} else {
				deferred.reject(null);
			}
		}, function(request, status, err) {

		});

		return deferred.promise;
	}
 
	return factory;
	
} ]);