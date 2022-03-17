'use strict';
var webapp = angular.module('webApp');
webapp.controller('MenuController', function($scope, $rootScope, $filter,
		$state) {

	
	$rootScope.arvoreNavegacao = [ {
		'filhosFilhoExecutavel' : "",
		'filhosFilhoProcessoCodigo' : "001100",
		'filhosFilhoProcessoNome' : "Serviços",
		'filhosPaiProcessoCodigo' : "001",
		'filhos' : [ {
			'filhosFilhoExecutavel' : "pacote",
			'filhosFilhoProcessoCodigo' : "001200",
			'filhosFilhoProcessoNome' : "Pacote",
			'filhosPaiProcessoCodigo' : "001"
		}, {
			'filhosFilhoExecutavel' : "servicosIncompativeis",
			'filhosFilhoProcessoCodigo' : "001200",
			'filhosFilhoProcessoNome' : "Serviços Incompatíveis",
			'filhosPaiProcessoCodigo' : "001"
		}

		],
	}, {
		'filhosFilhoExecutavel' : "",
		'filhosFilhoProcessoCodigo' : "001300",
		'filhosFilhoProcessoNome' : "Simulador",
		'filhosPaiProcessoCodigo' : "001",
		'filhos' : [ {
			'filhosFilhoExecutavel' : "simulador",
			'filhosFilhoProcessoCodigo' : "001200",
			'filhosFilhoProcessoNome' : "Simulador",
			'filhosPaiProcessoCodigo' : "001"
		}, {
			'filhosFilhoExecutavel' : "simulador/aprovar",
			'filhosFilhoProcessoCodigo' : "001200",
			'filhosFilhoProcessoNome' : "Aprovar",
			'filhosPaiProcessoCodigo' : "001"
		}
		/*
		 * , { 'filhosFilhoExecutavel' : "", 'filhosFilhoProcessoCodigo' :
		 * "001200", 'filhosFilhoProcessoNome' : "Serviços Incompatíveis",
		 * 'filhosPaiProcessoCodigo' : "001", 'filhos' : [ {
		 * 'filhosFilhoExecutavel' : "pacote", 'filhosFilhoProcessoCodigo' :
		 * "001200", 'filhosFilhoProcessoNome' : "Pacote",
		 * 'filhosPaiProcessoCodigo' : "001" }, { 'filhosFilhoExecutavel' :
		 * "servicosIncompativeis", 'filhosFilhoProcessoCodigo' : "001200",
		 * 'filhosFilhoProcessoNome' : "Serviços Incompatíveis",
		 * 'filhosPaiProcessoCodigo' : "001" }
		 *  ] }
		 */

		]

	}, {
		'filhosFilhoExecutavel' : "",
		'filhosFilhoProcessoCodigo' : "001200",
		'filhosFilhoProcessoNome' : "Convênio",
		'filhosPaiProcessoCodigo' : "002",
		'filhos' : [ {
			'filhosFilhoExecutavel' : "convenio",
			'filhosFilhoProcessoCodigo' : "001200",
			'filhosFilhoProcessoNome' : "Convênio",
			'filhosPaiProcessoCodigo' : "002"
		} ]

	}, {
		'filhosFilhoExecutavel' : "",
		'filhosFilhoProcessoCodigo' : "001600",
		'filhosFilhoProcessoNome' : "Parâmetros",
		'filhosPaiProcessoCodigo' : "001",
		'filhos' : [ {
			'filhosFilhoExecutavel' : "geral",
			'filhosFilhoProcessoCodigo' : "001200",
			'filhosFilhoProcessoNome' : "Geral",
			'filhosPaiProcessoCodigo' : "001"
		}, {
			'filhosFilhoExecutavel' : "consultarconvenio",
			'filhosFilhoProcessoCodigo' : "001200",
			'filhosFilhoProcessoNome' : "Convênio",
			'filhosPaiProcessoCodigo' : "001"
		}

		],
	}

	]

})
