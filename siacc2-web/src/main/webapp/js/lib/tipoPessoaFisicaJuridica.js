 
    var tipoPessoaFisicaJuridica = function () {
            return {
                restrict: 'E',
                scope: { 
                    month: '@',
                    
                },
                template:  ' <div class=""> ' + 
				        	  ' 	<div class="">' + 
				        	  ' 		<label>Tipo de pessoa</label> ' + 
				        	  ' 		<div class="form-group row"> ' + 
				        	  ' 			<div class="checkbox-inline col-sm-2"> ' + 
				        	  ' 				<label class="el-switch"> <input type="checkbox" ' + 
				        	  ' 					ng-model="tipoPessoaFisica" ' + 
				        	  ' 					mdp-Tipo-Pessoa="checkTipoPessoa(tipoPessoaFisica,\'f\')" ' + 
				        	  ' 					ng-checked="checkTipopessoaFisica" ng-true-value="true" ' + 
				        	  ' 					ng-false-value="false"> <span ' + 
				        	  ' 					class="el-switch-style"></span> ' + 
				        	  ' 				</label> <span class="margin-r">Física </span> ' + 
				        	  ' 			</div> ' +   
				        	  ' 			<div class="checkbox-inline col-sm-2"> ' + 
				        	  ' 				<label class="el-switch"> <input type="checkbox" ' + 
				        	  ' 					ng-model="tipoPessoaFisicaJuridica" ' + 
				        	  ' 					mdp-Tipo-Pessoa="checkTipoPessoa(tipoPessoaFisicaJuridica,\'j\')" ' + 
				        	  ' 					ng-checked="checkTipopessoaJuridica" ng-true-value="true" ' + 
				        	  ' 					ng-false-value="false"> <span ' + 
				        	  ' 					class="el-switch-style"></span> ' + 
				        	  ' 				</label> <span class="margin-r">Jurídica </span>' + 
				        	  ' 			</div>' +  
				        	  ' 		</div>' + 
				        	  ' 	</div>' + 
				        	  ' </div>',
                
                
                link: function (scope) {
                	scope.checkTipopessoaFisica = true; 
                	scope.checkTipopessoaJuridica = false; 
                	
                   
                }
            };
        }
        ;

         var webapp = angular.module('tipoPessoaFisicaJuridica', [])
       // webapp.directive('tipoPessoaFisicaJuridica', tipoPessoaFisicaJuridica)
         
        webapp.directive('tipoPessoaFisicaJuridica', ['$compile', function($compile) {        
		        return {
		            restrict: 'E',
		            replace: true,
		            transclude: true,
		            scope: {
		                texto: '@',
		                modelo: '@',
		                nome: '@',
		                tipo: '@',
		                obrigarorio: '=',
		                xs: '@',
		                sm: '@',
		                md: '@',
		                lg: '@'
		            },
		           template:  '<div> </div>',
		
		
		            link: function(scope, element, attr) {
		                var s = scope;
		                scope.checkTipopessoaFisica = true; 
	                	scope.checkTipopessoaJuridica = false; 
	                	
	                	
	                	 var input =  '' + 
			        	  ' 	' + 
			        	  ' 		<label>Tipo de pessoa</label> ' + 
			        	  ' 		<div class="form-group row"> ' + 
			        	  ' 			<div class="checkbox-inline col-sm-2"> ' + 
			        	  ' 				<label class="el-switch"> <input type="checkbox" ' + 
			        	  ' 					ng-model="tipoPessoaFisica" ' + 
			        	  ' 					mdp-Tipo-Pessoa="checkTipoPessoa(tipoPessoaFisica,\'f\')" ' + 
			        	  ' 					ng-checked="checkTipopessoaFisica" ng-true-value="true" ' + 
			        	  ' 					ng-false-value="false"> <span ' + 
			        	  ' 					class="el-switch-style"></span> ' + 
			        	  ' 				</label> <span class="margin-r">Física </span> ' + 
			        	  ' 			</div> ' +   
			        	  ' 			<div class="checkbox-inline col-sm-2"> ' + 
			        	  ' 				<label class="el-switch"> <input type="checkbox" ' + 
			        	  ' 					ng-model="tipoPessoaFisicaJuridica" ' + 
			        	  ' 					mdp-Tipo-Pessoa="checkTipoPessoa(tipoPessoaFisicaJuridica,\'j\')" ' + 
			        	  ' 					ng-checked="checkTipopessoaJuridica" ng-true-value="true" ' + 
			        	  ' 					ng-false-value="false"> <span ' + 
			        	  ' 					class="el-switch-style"></span> ' + 
			        	  ' 				</label> <span class="margin-r">Jurídica </span>' + 
			        	  ' 			</div>' +  
			        	  ' 		</div>'  ;
	                	 
	                	  var result = element.append(input);
	                      $compile(result)(scope.$parent); 
		                
		            }
		        }
		        
        }])
        
        
        
        
        webapp.directive('mdpTipoPessoa', ['$parse', function ($parse) {
            return    function (scope, element, attrs) {
		            	console.log(attrs.mdpTipoPessoa)
		                var fn = $parse(attrs.mdpTipoPessoa);
		                element.bind('click', function (event) {
		                    scope.$apply(function () {
		                        fn(scope, {$event: event});
		                       
		                    });
		                });
		                scope.tipoPessoa = "f"  ; 
		                scope.checkTipopessoaJuridica = false;
        				scope.checkTipopessoaFisica = true;	
        				
		                scope.checkTipoPessoa= function(tipo,origem) {	
	                		if(origem=="f"){
	                			if (tipo){
	                				scope.checkTipopessoaJuridica = false;
	                				scope.checkTipopessoaFisica = true;	
	                				origem ="j"
	                			}else{
	                				scope.checkTipopessoaJuridica = true;
	                				scope.checkTipopessoaFisica = false ;	
	                				origem ="f"
	                			}
	                		}else{
	                			if (tipo){
	                				scope.checkTipopessoaJuridica = true;
	                				scope.checkTipopessoaFisica = false;	
	                				origem ="j"
	                			}else{
	                				scope.checkTipopessoaJuridica = false;
	                				scope.checkTipopessoaFisica = true ;	
	                				origem ="f"
	                			} 
	                		} 
	                		 scope.tipoPessoa = origem  ; 
	                	} 
		              
            }
        }]);
 
