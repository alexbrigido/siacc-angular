 (function(angular) {
     'use strict';
     var tipoPessoacheck = function() {
         return {
             restrict: 'AE', 
             scope: { 
                 ngModel: '=?',
                 ngClick: '=?',
             }, 
             template: 
            	 	'	<div class="col-md-12 "> ' +
            	 		'	<label>Tipo de pessoa</label>' +
						'  		<div   ng-repeat="lst in tipoPessoa | orderBy:\'idTipoPessoa\' " >' +
						'			<div class="checkbox-inline col-sm-2">' +
						'				<label class="el-switch"> ' +
						'				<input type="checkbox"' +
						'					ng-model="tipoPessoa[$index].icSelecionado"' +
						'					ng-change="validarTipoPessoa(lst);"' +
						'					ng-checked="lst.icSelecionado"   > ' +
						'					<span class="el-switch-style"></span>' +
						'				</label> <span class="margin-r">{{lst.noTipoPessoa}} </span>' +
						'			</div>  ' +
						'		</div>'  +
						'	</div> '  	+
						'	<div class="col-md-3"> ' +
						'			<label>CPF / CNPJ</label> ' +
						'		<input type="text" ng-model="tpnucpfcnpj" id="nucpfnpj" ng-blur="validarCPFCNPJ()" class="md-input format_date " maxlength="68" /> ' +
						'	</div> '  	,
             
             	  
             link: function(scope) {
            	 scope.ngModel = scope.ngModel || [];
            	 scope.tpnucpfcnpj = "";
            	 $(".format_date").inputmask("999.999.999-99");
            	 
            	 scope.tipoPessoa = [{"noTipoPessoa" : "Física",
						"idTipoPessoa" : 0,
						"icSelecionado" : true,
						"siglaTipoPessoa" : "F",
						"nuCpfCnpj" : "",
						"nuCpfCnpjBasico" : "",
						"nuCpfCnpjOrden" : "",
						"nuCpfCnpjDv" : ""
						}, {
						"noTipoPessoa" : "Jurídica",
						"idTipoPessoa" : 1,
						"icSelecionado" : false,
						"siglaTipoPessoa" : "J", 
						"nuCpfCnpj" : "",
						"nuCpfCnpjBasico" : "",
						"nuCpfCnpjOrden" : "",
						"nuCpfCnpjDv" : ""
					}] 
            	 
            	 	scope.validarTipoPessoa= function(tp) {
            		 	var itemSelecionado=  true;
            		 	
            		 	scope.tipoPessoa.forEach(function(item, indice) { 

         					scope.tpnucpfcnpj=  ""; 
         					$("#nucpfnpj").val("");
         					item.nuCpfCnpj =  ""; 
            		 		
	         				if (item.idTipoPessoa != tp.idTipoPessoa) { 
	         						item.icSelecionado = false; 
	         				}else{
	         					scope.ngModel = item;
	         					 if (item.idTipoPessoa==0){
	         						$(".format_date").inputmask("999.999.999-99");
	         					 }else{
	         						$(".format_date").inputmask("99.999.999/9999-99");
	         					 }
	         				}
	         				if ((item.idTipoPessoa == tp.idTipoPessoa) && (item.icSelecionado === false  && tp.icSelecionado ==false)) { 
	         					itemSelecionado = false;
	         				}
            		 	})
            		 	
            		 	if (!itemSelecionado){
	            		 	scope.tipoPessoa.forEach(function(item, indice) { 
		         				if (item.idTipoPessoa != tp.idTipoPessoa) { 
		         						item.icSelecionado = true; 
		         					 	scope.validarTipoPessoa(item) ;
		         				}  
	            		 	})
            		 	} 	
         			}
            	 
            	 	scope.validarCPFCNPJ= function() {
	         	 		var n = $("#nucpfnpj").val();
	         	 		scope.tipoPessoa.forEach(function(item, indice) { 
		         				if (item.icSelecionado === true) { 
		         					var cp = n.split(".").join("");
		         						cp = cp.split("-").join("");
		         						cp = cp.split("/").join("");

			         				item.nuCpfCnpj = cp; 	
		         					if (item.idTipoPessoa == 0) { 
		         						item.nuCpfCnpjBasico= cp.substring(0, 9);
			         					item.nuCpfCnpjOrden= ""
			         					item.nuCpfCnpjDv= cp.substring(9, 11);
		         					}else{
		         						item.nuCpfCnpjBasico= cp.substring(0, 8);
			         					item.nuCpfCnpjOrden= cp.substring(8, 12);
			         					item.nuCpfCnpjDv= cp.substring(12, 14);
		         					}
		         					
		         					
		         					
		         				}  
	         		 	})
	            	 }
         	 
            	 
	            	 var chec = function(){
            			scope.tipoPessoa.forEach(function(item, indice) { 
            				if (item.icSelecionado === true) { 
            					scope.validarTipoPessoa(item); 
	         				}  
            		 	}) 
	            	 } 
            	 	chec();
            	 
             }
         };
     };

     angular.module('tipoPessoaFisicaJuridica', [])
     .directive('tipoPessoaFisicaJuridica', tipoPessoacheck)

 })
 (window.angular);