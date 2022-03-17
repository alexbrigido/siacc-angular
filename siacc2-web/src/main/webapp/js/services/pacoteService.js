var webApp = angular.module('webApp');
webApp.factory('pacoteservice', ['$http','$rootScope','whttp','$q',	function($http, $rootScope, whttp, $q) {

	var factory = {};

	factory.cboTipoCompromisso = function() {
		var deferred = $q.defer();
		var paramenter = "ws/tipoCompromisso/findAll";

		whttp.get(paramenter).then(function(res) {
			if (!res.temErro) {
				deferred.resolve(res);
			} else {
				deferred.reject(null);
			}
		}, function(request, status, err) {

		});

		return deferred.promise;
	}

	factory.cboPacote = function(nuTipoCompromisso) {
		var deferred = $q.defer();
		var ulr = "ws/pacote/pacoteTipoCompromisso/";
		if (nuTipoCompromisso != null) {

			var paramenter = ulr + nuTipoCompromisso;

			whttp.get(paramenter).then(function(res) {
				if (!res.temErro) {
					deferred.resolve(res);
				} else {
					deferred.reject(null);
				}
			}, function(request, status, err) {

			});

		}
		return deferred.promise;
	}

	factory.consultarCategoria = function(nuTipoCompromisso, nuPacote) {
		var deferred = $q.defer();
		var ulr = "ws/pacote/"
		if (nuTipoCompromisso != null && nuPacote != null) {
			var paramenter = ulr + nuTipoCompromisso + "/" + nuPacote;
			whttp.get(paramenter).then(function(res) {
				if (!res.temErro) {
					deferred.resolve(res);
				} else {
					deferred.reject(null);
				}
			}, function(request, status, err) {

			});
		}
		return deferred.promise;
	}

	factory.consultarTarifaContratada = function(nuTipoCompromisso,
			nuPacote) {
		var deferred = $q.defer();
		var ulr = "ws/pacote/pacoteservicotarifa/"
		if (nuTipoCompromisso != null && nuPacote != null) {
			var paramenter = ulr + nuTipoCompromisso + "/" + nuPacote;
			whttp.get(paramenter).then(function(res) {
				if (!res.temErro) {
					deferred.resolve(res);
				} else {
					deferred.reject(null);
				}
			}, function(request, status, err) {

			});
		}
		return deferred.promise;
	}

	return factory;
	
} ]);