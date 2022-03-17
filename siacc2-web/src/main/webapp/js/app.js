'use strict';
angular.module('webApp', [
	"ui.router", 
	"ui.mask",   
	"ngAnimate",
	"starter.controllers",  
	"multipleDatePicker", 
	"tipoPessoaFisicaJuridica", 
	"ui.bootstrap",
	"ui.sortable", 
	'ui.select', 
	'ngSanitize' ,
	
]) 

angular.module('webApp')
	.config(function($stateProvider, $urlRouterProvider, $provide    ) {
		 
		
		$stateProvider.state("principal", {
			url : '/',
			abstract : false,
			views : {
				'header-container' : {
					templateUrl : 'pages/header.html'
				},
				'menu-container' : {
					templateUrl : 'pages/menu.html'
				},
				'page-container' : {
					templateUrl : 'pages/main.html'
				},
				'footer-container' : {
					templateUrl : 'pages/footer.html'
				}
			}
		});
		
		var state = {
				url : "/pacote",
				views : {
					'header-container' : {
						templateUrl : 'pages/header.html'
					},
					'page-container' : {
						templateUrl : 'pages/pacote/list.html'
					},
					'menu-container' : {
						templateUrl : 'pages/menu.html'
					},
					'footer-container' : {
						templateUrl : 'pages/footer.html'
					}
				},
				resolve: {
			          menuTop:  function(headerMenu) {
	                      			return headerMenu.add( [ {
	                      				"item" : "Serviços",
	                      				"link" : "",
	                      				"active":""
	                      			}, {
	                      				"item" : "Pacote",
	                      				"link" : "",
	                      				"class":"active"
	                      			} ]);
			          			}
			       }    
			};		
			$stateProvider.state('pacote', state);
			
			var state = {
					url : "/pacote/incluir",
					params: {
				        nuTipoCompromisso: null, 
				        nuPacote: null, 
				        pageHeader: "Incluir" 
				    },
					views : {
						'header-container' : {
							templateUrl : 'pages/header.html'
						},
						'page-container' : {
							templateUrl : 'pages/pacote/manutencaoPacote.html'
						},
						'menu-container' : {
							templateUrl : 'pages/menu.html'
						},
						'footer-container' : {
							templateUrl : 'pages/footer.html'
						}
					},
					resolve: {
				          menuTop:  function(headerMenu) {
		                      			return headerMenu.add([ {
		                      				"item" : "Serviços",
		                      				"link" : "",
		                      				"active" : ""
		                      			}, {
		                      				"item" : "Pacote",
		                      				"link" : "pacote",
		                      				"class" : ""
		                      			}, {
		                      				"item" : "Incluir",
		                      				"link" : "",
		                      				"class" : "active"
		                      			} ]);
				          			}
				       }   
				};		
				$stateProvider.state('pacote/incluir', state);
			 
				
				var state = {
						url : "/pacote/manutencao", 
						params: {
						        nuTipoCompromisso: null, 
						        nuPacote: null, 
						        pageHeader: "Consulta" 
						    },
						views : {
							'header-container' : {
								templateUrl : 'pages/header.html'
							},
							'page-container' : {
								templateUrl : 'pages/pacote/manutencaoPacote.html'
							},
							'menu-container' : {
								templateUrl : 'pages/menu.html'
							},
							'footer-container' : {
								templateUrl : 'pages/footer.html'
							}
						},
						resolve: {
					          menuTop:  function(headerMenu) {
			                      			return headerMenu.add([ {
			                      				"item" : "Serviços",
			                      				"link" : "",
			                      				"active" : ""
			                      			}, {
			                      				"item" : "Pacote",
			                      				"link" : "pacote",
			                      				"class" : ""
			                      			}, {
			                      				"item" : "Consulta",
			                      				"link" : "",
			                      				"class" : "active"
			                      			} ]);
					          			}
					       }   
					};		
					$stateProvider.state('pacote/manutencao', state);
					
				
				var state = {
						url : "/servicosIncompativeis",
						views : {
							'header-container' : {
								templateUrl : 'pages/header.html'
							},
							'page-container' : {
								templateUrl : 'pages/servico/list.html'
							},
							'menu-container' : {
								templateUrl : 'pages/menu.html'
							},
							'footer-container' : {
								templateUrl : 'pages/footer.html'
							}
						}
					};		
					$stateProvider.state('servicosIncompativeis', state);	
				
					var state = {
							url : "/servicosIncompativeis/incluir",
							views : {
								'header-container' : {
									templateUrl : 'pages/header.html'
								},
								'page-container' : {
									templateUrl : 'pages/servico/incluir.html'
								},
								'menu-container' : {
									templateUrl : 'pages/menu.html'
								},
								'footer-container' : {
									templateUrl : 'pages/footer.html'
								}
							}
						};		
						$stateProvider.state('servicosIncompativeis/incluir', state);
					
					
					
						var state = {
								url : "/geral",
								views : {
									'header-container' : {
										templateUrl : 'pages/header.html'
									},
									'page-container' : {
										templateUrl : 'pages/parametro/geralIncluir.html'
									},
									'menu-container' : {
										templateUrl : 'pages/menu.html'
									},
									'footer-container' : {
										templateUrl : 'pages/footer.html'
									}
								}
							};		
							$stateProvider.state('geral', state);
						
						
						
							var state = {
									url : "/convenio",
									views : {
										'header-container' : {
											templateUrl : 'pages/header.html'
										},
										'page-container' : {
											templateUrl : 'pages/convenio/list.html'
										},
										'menu-container' : {
											templateUrl : 'pages/menu.html'
										},
										'footer-container' : {
											templateUrl : 'pages/footer.html'
										}
									},
									resolve: {
								          menuTop:  function(headerMenu) {
						                      			return headerMenu.add([ {
						                      				"item" : "Convênio",
						                      				"link" : "",
						                      				"active" : ""
						                      			}, {
						                      				"item" : "Lista",
						                      				"link" : "",
						                      				"class" : "active"
						                      			} ]);
								          			}
								       }
								};		
								$stateProvider.state('convenio', state);
								
								
								
								
								var state = {
										url : "/convenio/incluir",
										views : {
											'header-container' : {
												templateUrl : 'pages/header.html'
											},
											'page-container' : {
												templateUrl : 'pages/convenio/convenioIncluir.html'
											},
											'menu-container' : {
												templateUrl : 'pages/menu.html'
											},
											'footer-container' : {
												templateUrl : 'pages/footer.html'
											}
										},
										resolve: {
									          menuTop:  function(headerMenu) {
							                      			return headerMenu.add([ {
							                      				"item" : "Convênio",
							                      				"link" : "convenio",
							                      				"active" : ""
							                      			}, {
							                      				"item" : "Incluir",
							                      				"link" : "",
							                      				"class" : "active"
							                      			} ]);
									          			}
									       }  
									};		
									$stateProvider.state('convenio/incluir', state);
									
									var state = {
											url : "/simulador",
											views : {
												'header-container' : {
													templateUrl : 'pages/header.html'
												},
												'page-container' : {
													templateUrl : 'pages/simulador/list.html'
												},
												'menu-container' : {
													templateUrl : 'pages/menu.html'
												},
												'footer-container' : {
													templateUrl : 'pages/footer.html'
												}
											}
										};		
										$stateProvider.state('simulador', state);
								
										var state = {
												url : "/simulador/incluir",
												views : {
													'header-container' : {
														templateUrl : 'pages/header.html'
													},
													'page-container' : {
														templateUrl : 'pages/simulador/incluir.html'
													},
													'menu-container' : {
														templateUrl : 'pages/menu.html'
													},
													'footer-container' : {
														templateUrl : 'pages/footer.html'
													}
												} 
											};		
											$stateProvider.state('simulador/incluir', state);
											
											
											var state = {
													url : "/simulador/aprovar",
													views : {
														'header-container' : {
															templateUrl : 'pages/header.html'
														},
														'page-container' : {
															templateUrl : 'pages/simulador/aprovarListar.html'
														},
														'menu-container' : {
															templateUrl : 'pages/menu.html'
														},
														'footer-container' : {
															templateUrl : 'pages/footer.html'
														}
													}
												};		
												$stateProvider.state('simulador/aprovar', state);
												
				
			$urlRouterProvider.otherwise('/');
	});

angular.module('webApp').run(function($rootScope, $location) {
	$rootScope.$on("$routeChangeStart", function(event, next, current) {

	
	});
	$rootScope.projeto ="SIACC - Sistema de Agendamento de Compromissos de Clientes"; 
	$rootScope.projetoCompleto ="Sistema de Agendamento de Compromissos de Clientes"; 
	$rootScope.siglaProjeto ="SIACC";
	$rootScope.pageOptions = [{name:"3",value:3},{name:"5",value:5},{name:"10",value:10},{name:"20",value:20},{name:"50",value:50}];
	$rootScope.itemsOnPage = $rootScope.pageOptions[2];
	
	console.log("Start webApp");
	
	$rootScope.carregando = true;
	
	
	$rootScope.zeroEsquerda = function(v,n ){
		if (v!=null && v!="" && v!=undefined){
			return   ("000000000000000000" + v).slice(-n)
		}
		
	}
	
	$rootScope.formatReal = function( int )
	{ 

	        return int.toFixed(2).replace('.', ',').replace(/(\d)(?=(\d{3})+\,)/g, "$1."); 
	}
 
});
 




