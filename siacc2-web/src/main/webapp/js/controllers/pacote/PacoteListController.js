var webapp = angular.module('webApp');
webapp.controller('PacoteListController', function($scope,$q, $rootScope, whttp, modalService) {
 
	$scope.dataFull=[]; 
	$scope.itemPacote = {};
	
	$scope.listaTipoCompromisso = [
			{
				nuTipoCompromisso: 1,
				nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR'
			},
			{
				nuTipoCompromisso: 2,
				nomeTipoCompromisso: 'PAGAMENTO DE SALARIO'
			},
			{
				nuTipoCompromisso: 3,
				nomeTipoCompromisso: 'AUTO-PAGAMENTO'
			},
			{
				nuTipoCompromisso: 4,
				nomeTipoCompromisso: 'ORDEM BANCARIA'
			},
			{
				nuTipoCompromisso: 6,
				nomeTipoCompromisso: 'SALARIOS CAIXA DO TRABALHADOR'
			},
			{
				nuTipoCompromisso: 7,
				nomeTipoCompromisso: 'FOLHA CAIXA WEB'
			},
			{
				nuTipoCompromisso: 11,
				nomeTipoCompromisso: 'DEBITO EM CONTA'
			}
	];
	
	$scope.listar = function() {	
			$scope.listaPacoteFull = [
				{
					nuPacote: 1,
					nomePacote: 'Pacote DEPOSITO JUDICIAL',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
					
				},
				{
					nuPacote: 2,
					nomePacote: 'Pacote PIX',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
				},
				{
					nuPacote: 3,
					nomePacote: 'Pacote Tres',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '23/03/2022'
				},
				{
					nuPacote: 4,
					nomePacote: 'Pacote Teste',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '24/03/2022'
				}
			]
		
	}
	
});