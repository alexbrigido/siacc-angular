
window.onbeforeunload = function (e) {
	/*  e = e || window.event;
	  // For IE and Firefox prior to version 4
	  if (e) {
	    e.returnValue = 'Any string';
	  }
	  pageIndex();
	  // For Safari
	  return 'Any string';
	 */
};
	
function pageStatus(xhr){
	var status = xhr.status;
	var statusText = xhr.statusText;	
	console.log("pageStatus> ", xhr );

	$(".modal").modal('hide');
	$(".modal-backdrop").remove();
	$(".modal-backdrop").css("display", "none");
 	 	
	switch (status) {
		case 400: 
			//pageIndex();
			break;
		case 401: 
			pageIndex();
			break;
		case 409: 			 
			break;	
		case 500:  
		//	pageIndex();
			break;	
		case 999: 
			//pageIndex();
			break;	   			
		case 1000: 
			//pageIndex();
			break;	   	
		default:
			console.log("##################################### responseError default ", status ,statusText);
	}
	
}

function pageIndex(){
	console.log("onErro Page Index");
	/*
	$.ajax({
	     url : "ws/sso/logout",
	     type : 'POST',
	     data : {}, 
         contentType: 'application/json',
         dataType: 'json',
	     beforeSend : function(){}
	}).done(function(msg){
		location.href = location.protocol + '//' + location.host + location.pathname;
	})
	.fail(function(jqXHR, textStatus, msg){
		location.href = location.protocol + '//' + location.host + location.pathname;
	});
	*/
	
}

$(document).ajaxError(function(event,xhr,options,exc) {
	pageStatus(xhr);
	
});


// navegadores antigos
window.onerror = function (errorMsg, url, lineNumber, column, errorObj) {
	$(".modal").modal('hide');
	$(".modal-backdrop").remove();
	$(".modal-backdrop").css("display", "none");
 	
    console.log('window.onerror: ' + errorMsg + ' Script: ' + url + ' Line: ' + lineNumber
    + ' Column: ' + column + ' StackTrace: ' +  errorObj);
	 
}
 
/**/
var webApp = angular.module('webApp',[]); 
/**/
webApp.config(function($httpProvider) {
   $httpProvider.interceptors.push('httpInterceptor');  
}) 

/**/ 
webApp.factory('httpInterceptor',['$q','$location','$rootScope',function($q,$location,$rootScope) {
	return {
	    request: function(config) {	    	  
	      return config;
	    },
	    requestError: function(config) {
	      return config;
	    },
	    response: function(res) { 	   
	      return res || $q.when(res);
	    },
	    responseError: function(res) {
	    	pageStatus(xhr);
    
	    	return $q.reject(res);
	    }
	  }
}])


$(document).ajaxSend(function(event, request, settings) {
  $('#carregando').show();
});

$(document).ajaxComplete(function(event, request, settings) {
  //  $('#carregando').hide();
});

 

 