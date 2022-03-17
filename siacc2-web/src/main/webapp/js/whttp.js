/*---*/
var webApp = angular.module('webApp')
/**/
webApp.run(function ($rootScope, $state, $location, $filter) {	  
})
/**/
webApp.factory('whttp',	['$http','$q','$rootScope' ,function($http, $q, $rootScope) {       
		var retornoErro = false;
		var msgErro = null;
		var data = null; 
	 
		var usuarioSgr = angular.toJson($rootScope.usuarioSgr);
		var	constErro = "Houve um erro na Execução da Aplicação";
		
		var factory = {};

		factory.get = function (url) {
			return getHttp(url, "GET",null);
		};
		 
		factory.post = function(url,data) {
			return getHttp(url, "POST", data);
		};
		 
		  
		factory.notHeader= function() {
			notHeader = true;
		}
		const ws = function (method, url, data) {
			return $http({
				cache: false,
				method : method,
				async :false, 
				url : url,
				data : data,
				params : data,
				contentType: 'application/json',
	            dataType: 'json',
				headers :  getHeader()
			})
		}
		 
		const getHttp = function (url, method,data) {
			var deferred = $q.defer(); 
			
			  
			if (url.length > 0) { 
				var retorno = ws(method, url, data);
					retorno.then(function(response) {
									var res = response.data; 
									var msg = res.msgsErro===undefined?"":res.msgsErro;
									
									if (!res.temErro && !   msg.length > 0) {
										deferred.resolve(res);
									}   
								},
								function(xhr, status, err) {
									$('#carregando').hide(); 
									console.log("Erro ws err ",err);
									console.log("Erro ws status",status);
									console.log("Erro ws xhr",xhr);
								 
									deferred.reject(xhr,status, err); 
								});  
				return deferred.promise;
			} else {
				Alert.showError("Aten\u00E7\u00E3o","Url não registrado para consulta",true);
				return null;
			}
		}
		 
		function getHeader(){ 
			 
				return { 'projeto' : 'siacc',
						 'Empresa':'Caixa', 
						 'Sistema':'Sistema de Beneficios ao Cidadao',
						 'Equipe':'Equipe JAVA', 
					     'mode': 'PREVIEW',
						 'usuarioSGR' :  getUsuario()
						 };
				
			 
		} 
		 
		function getUsuario() {
			return (usuarioSgr == undefined || usuarioSgr == "") ? {}	: usuarioSgr;
		}
		 
		return factory;
} 
]);
