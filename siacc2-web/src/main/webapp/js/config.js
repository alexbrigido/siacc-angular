﻿﻿(function(angular) {
	  'use strict';
	  
webApp = angular.module("webApp"); 
﻿﻿﻿webApp.factory('httpInterceptor', function ($q, $rootScope, $log) {

    var numLoadings = 0;

    return {
        request: function (config) {

            numLoadings++;

            $('#carregando').show();
            return config || $q.when(config)

        },
        response: function (response) {

            if ((--numLoadings) === 0) {
            	$('#carregando').hide();
            }

            return response || $q.when(response);

        },
        responseError: function (response) {
        	$('#carregando').hide(); 
            return $q.reject(response);
        }
    };
})
﻿﻿﻿webApp.factory('httpRequestInterceptor',  function ($q, $location , $injector  ) {
    return {
        'responseError': function(rejection) {
        	var modal = $injector.get("modalService");
        	
        	modal.showAlert("Aten\u00E7\u00E3o", "Ouve um Erro na execuçao do Apliactivo") 
        	console.log("httpRequestInterceptor: ", rejection); 
        	
        	$('#carregando').hide(); 
            return $q.reject(rejection);
         }
     };
});

angular.module('webApp').config(function ($httpProvider) {
    $httpProvider.interceptors.push('httpInterceptor');
    $httpProvider.interceptors.push('httpRequestInterceptor');
    
});

webApp.factory('headerMenu',['$rootScope',
	 function($rootScope) {
	
	var headerMenu = function(item) {	 
		$rootScope.menuHeader = item;
	} 
	 
	return {
		add: function(item) {
 			return new headerMenu(item);
 			} 
		}
}])


})(window.angular);


