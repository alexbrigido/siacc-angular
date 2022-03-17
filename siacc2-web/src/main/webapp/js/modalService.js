﻿﻿webApp = angular.module("webApp");

﻿﻿﻿webApp.service('modalService', ['$modal', function( $modal) {
 
	var MODAL_CONFIRM = {
		backdrop : true,
		keyboard : true,
		modalFade : true,
		templateUrl : "./resources/modalconfirm.html"
	};
	
	var MODAL_ALERT = {
			backdrop : true,
			keyboard : true,
			modalFade : true,
			templateUrl : "./resources/modalalert.html"
	};


	var modalOptions = {
		closeButtonText : '',
		actionButtonText : '',
		headerText : '',
		bodyText : ''
	};
	
	var tempModalDefaults = {};
	var tempModalOptions = {};
	

	function show (customModalDefaults, customModalOptions, closeButton) {		
		angular.extend(tempModalOptions, modalOptions, customModalOptions);		
		if (!tempModalDefaults.controller) {
			tempModalDefaults.controller = function($scope, $modalInstance) {
				$scope.modalOptions = tempModalOptions;
				$scope.closeButton = closeButton;
			 
				$scope.modalOptions.ok = function(result) {
					$modalInstance.close(result);
				};
				
				if(closeButton){
					$scope.modalOptions.close = function(result) {
						$modalInstance.dismiss('cancel');
					};
				}
				
			}
		}

		return $modal.open(tempModalDefaults).result;
	};
	
	this.showError = function(error,Error) {
		var customModalDefaults = {};
		customModalDefaults.backdrop = 'static';
			
		var modalOptions = {
			closeButtonText : '',
			actionButtonText : '',
			headerText : "Atenção",
			bodyText : error.message
		};

		angular.extend(tempModalDefaults, MODAL_ALERT, customModalDefaults);
		return  show(customModalDefaults, modalOptions,1);
	};
	
	this.showConfirm = function(title, message) {
		var customModalDefaults = {};
		customModalDefaults.backdrop = 'static';
			
		var modalOptions = {
			closeButtonText : '',
			actionButtonText : '',
			headerText : title,
			bodyText : message
		};

		angular.extend(tempModalDefaults, MODAL_CONFIRM, customModalDefaults);
		return  show(customModalDefaults, modalOptions,1);
	};
	
	this.showAlert = function(title, message) {
		var customModalDefaults = {};
		customModalDefaults.backdrop = 'static';
			
		var modalOptions = {
			closeButtonText : '',
			actionButtonText : '',
			headerText : title,
			bodyText : message
		};

		angular.extend(tempModalDefaults, MODAL_ALERT, customModalDefaults);
		return  show(customModalDefaults, modalOptions,1);
	};
 
} ]);