angular.module(	"starter.controllers",
		["ngCookies", 
		 "ngAnimate",  
		 "smart-table",
 		 "ui.bootstrap", 
		 "ui.sortable", 
		 "starter.directives" ]).run(
		function($rootScope, $state, $location, $filter, $http) {

			$rootScope.tipoLancamento = [ {
				"noTipo" : "Convênio ",
				"idTipo" : 1 
			}, {
				"noTipo" : "Compromisso",
				"idTipo" : 2 
			} ] 
			
			$rootScope.enumSimNao = [ {
				"noTipo" : "Sim ",
				"idTipo" : "S" 
			}  ] 
			
			$rootScope.convenioFormalizado = [ {
				"noTipo" : "Convênio formalizado ",
				"idTipo" : "S" 
			}  ] 
			
			$rootScope.tipoColigada = [ {
				"noTipo" : "Coligada",
				"idTipo" : "S" 
			}  ] 
			
			$rootScope.tipoIOF = [ {
				"noTipo" : "Retenção de IOF",
				"idTipo" : "S" 
			}  ] 
			
			
			$rootScope.tipoContaRetorno = [ {
				"noTipo" : "SIDEC ",
				"idTipo" : "1" 
			}, {
				"noTipo" : "NSGD",
				"idTipo" : "2"
			} ] 
			
			
			$rootScope.tipoEmpresa = [ {
				"noTipo" : "Pública ",
				"idTipo" : "1" 
			}, {
				"noTipo" : "Pública com convênio",
				"idTipo" : "2"
			}, {
				"noTipo" : "Privada",
				"idTipo" : "3"
			}, {
				"noTipo" : "Privada com convênio",
				"idTipo" : "4"
			}, {
				"noTipo" : "Convênio interno",
				"idTipo" : "5"
			} ] 
			
			
			$rootScope.tipoEsfera = [ {
				"noTipo" : "Privada ",
				"idTipo" : "1" ,
				"idTipoEmpresa" : [{id:4},{id:3}]  
			}, {
				"noTipo" : "Municipal",
				"idTipo" : "2",
				"idTipoEmpresa" : [{id:1},{id:2}]  
			}, {
				"noTipo" : "Estadual",
				"idTipo" : "3" ,
				"idTipoEmpresa" : [{id:1},{id:2}]   
			}, {
				"noTipo" : "Federal",
				"idTipo" : "4" , 
				"idTipoEmpresa" : [{id:1},{id:2}]   
			}] 
			 
			
			$rootScope.categoriaPote = [ {
				"noTipo" : "Micro Empresa ",
				"idTipo" : "001" ,
				"idTipoEmpresa" : [{id:3},{id:4}]  
			},
			{
				"noTipo" : "Pequena Empresa ",
				"idTipo" : "002" ,
				"idTipoEmpresa" : [{id:3},{id:4}]  
			},
			{
				"noTipo" : "Media Empresa ",
				"idTipo" : "003" ,
				"idTipoEmpresa" : [{id:3},{id:4}]  
			},
			{
				"noTipo" : "Grande Empresa",
				"idTipo" : "004" ,
				"idTipoEmpresa" : [{id:3},{id:4}]  
			},
			{
				"noTipo" : "Empresa sem Fins Lucrativos",
				"idTipo" : "005" ,
				"idTipoEmpresa" : [{id:3},{id:4}]  
			},
			{
				"noTipo" : "Autarquia",
				"idTipo" : "001" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Conselhos de Fiscalização Profissões Regulamentadas",
				"idTipo" : "002" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Empresa Pública",
				"idTipo" : "003" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Fundação",
				"idTipo" : "004" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},			
			{
				"noTipo" : "Governo de Estado",
				"idTipo" : "005" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Instituto",
				"idTipo" : "006" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Ministério",
				"idTipo" : "007" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Prefeitura",
				"idTipo" : "008" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Secretaria",
				"idTipo" : "009" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Agências Nacionais",
				"idTipo" : "010" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Universidade",
				"idTipo" : "011" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			},
			{
				"noTipo" : "Outros",
				"idTipo" : "012" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			}  
			] 
			
			$rootScope.contaDeposito = [ {
				"noTipo" : "Aceita apenas conta salário (037 ou 3700) ",
				"idTipo" : "1" 
			}, {
				"noTipo" : "Realiza tradução de conta depósito",
				"idTipo" : "2"
			}, {
				"noTipo" : "Acata todas as operações /produtos no crédito em conta",
				"idTipo" : "3"
			} ] 
			
			
			$rootScope.segmento = [ {
				"noTipo" : "Prefeitura",
				"idTipo" : "1" ,
				"idTipoEmpresa" : [{id:1},{id:2}]  
			}, {
				"noTipo" : "Saneamento",
				"idTipo" : "2",
				"idTipoEmpresa" : [{id:1},{id:2}]  
			}, {
				"noTipo" : "Energia elétrica e gás",
				"idTipo" : "3",
				"idTipoEmpresa" : [{id:1},{id:2}]  
			}, {
				"noTipo" : "Telecomunicações",
				"idTipo" : "4",
				"idTipoEmpresa" : [{id:1},{id:2}]  
			}, {
				"noTipo" : "Orgãos Governamentais",
				"idTipo" : "5",
				"idTipoEmpresa" : [{id:1},{id:2}]  
			}, {
				"noTipo" : "Diversos",
				"idTipo" : "6",
				"idTipoEmpresa" : [{id:1},{id:2}]  
			} , {
				"noTipo" : "Multas DENATRAN",
				"idTipo" : "7",
				"idTipoEmpresa" : [{id:2}]  
			}  , {
				"noTipo" : "Exclusivo CAIXA",
				"idTipo" : "9",
				"idTipoEmpresa" : [{id:1},{id:2}]  
			}  
			
			
			
			] 
			
			
			$rootScope.cnpjPagador = [ {
				"noTipo" : "CNPJ do Convênio",
				"idTipo" : "1" 
			}, {
				"noTipo" : "CNPJ do Compromisso",
				"idTipo" : "2"
			} ] 
			
			
		})
