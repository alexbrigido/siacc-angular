var webapp = angular.module('webApp');
webapp .controller( 'PacoteManutencaoController',function($scope, $rootScope, $stateParams, $q, pacoteservice, whttp) {
	var vm = this;

	$scope.today = moment().locale('pt-br').format('L');
  
	vm.servicos = [];
	vm.nuTipoCompromisso = "";
	vm.pacote = "";
	vm.exbirAbas = false;

	$scope.dataFull = [];
	$scope.myMonth = moment().month(0).year(2020);
	$scope.dateMultiple = [];

	vm.init = function() {
		vm.clear();
		vm.consultaTipoCompromisso();
		vm.consultCategoria();
	}

	vm.consultaTipoCompromisso = function() {

		vm.dataTipoCompromisso = [
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
		
		vm.dataPacote = [
				{
					nuPacote: 1,
					nomePacote: 'Pacote 01',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
					
				},
				{
					nuPacote: 2,
					nomePacote: 'Pacote 02',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
				}
			];
		
		vm.listaPacoteFull = [
				{
					nuPacote: 1,
					nomePacote: 'Pacote 01',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
					
				},
				{
					nuPacote: 2,
					nomePacote: 'Pacote 02',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
				}
			];
	}

	vm.consultaPacote = function(tipoCompromisso) {
		//vm.clear();
		/*
		pacoteservice.cboPacote(tipoCompromisso).then(
				function(res) {
					if (res != null && res != undefined) {
						vm.dataPacote = res.data[0];
					} else {
					}
				})*/
		vm.dataPacote = [
				{
					nuPacote: 1,
					nomePacote: 'Pacote 01',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
					
				},
				{
					nuPacote: 2,
					nomePacote: 'Pacote 02',
					nuTipoCompromisso: 1,
					nomeTipoCompromisso: 'PAGAMENTO A FORNECEDOR',
					inicioVigencia: '22/03/2022'
				}
			];
	}


	vm.consultCategoria = function() {
		
		vm.listaCategoriaFull = [
			{
				nuCategoria: 1,
				deCategoria: 'FORMA DE PAGAMENTO',
				servicos: [
					{
						icSelecionado : false,
						nuServico : 1,
						nuCategoria : 1,
						deServico : 'DOC',
						deServicoReduzido : 'DOC',
						icCentroCusto : 'F',
						icTarifa : 'F',
						vrBruto : 0.32,
						vrCusto : 0.30,
						vrDesconto : 0.00,
						vrDesejado : 0.00,
						vrReceita : 0.23,
						vrTarifaContrada : 0.00
					},
					{
						icSelecionado : true,
						nuServico : 2,
						nuCategoria : 1,
						deServico : 'COBRANCA CAIXA',
						deServicoReduzido : 'COBRANCA CAIXA',
						icCentroCusto : 'F',
						icTarifa : 'F',
						vrBruto : 0.32,
						vrCusto : 0.30,
						vrDesconto : 0.00,
						vrDesejado : 0.00,
						vrReceita : 0.23,
						vrTarifaContrada : 0.00
					},
					{
						icSelecionado : true,
						nuServico : 8,
						nuCategoria : 1,
						deServico : 'TED',
						deServicoReduzido : 'TED',
						icCentroCusto : 'F',
						icTarifa : 'F',
						vrBruto : 0.32,
						vrCusto : 0.30,
						vrDesconto : 0.00,
						vrDesejado : 0.00,
						vrReceita : 0.23,
						vrTarifaContrada : 0.00
					},
				]
			},
			{
				nuCategoria: 2,
				deCategoria: 'FORMA DE TRANSMISSAO E RECEPCAO',
				servicos: [
					{
						icSelecionado : true,
						nuServico : 11,
						nuCategoria : 2,
						deServico : 'VIA VAN',
						deServicoReduzido : 'VIA VAN'
					},
					{
						icSelecionado : false,
						nuServico : 12,
						nuCategoria : 2,
						deServico : 'VIA SITE',
						deServicoReduzido : 'VIA SITE'
					},
					{
						icSelecionado : false,
						nuServico : 13,
						nuCategoria : 2,
						deServico : 'VIA TRANSMISSAO DIRETA',
						deServicoReduzido : 'VIA TRANSMISSAO DIRETA'
					},
					{
						icSelecionado : false,
						nuServico : 14,
						nuCategoria : 2,
						deServico : 'VIA INTERNET BANKING CXA',
						deServicoReduzido : 'VIA INTERNET BANKING CXA'
					},
					{
						icSelecionado : false,
						nuServico : 15,
						nuCategoria : 2,
						deServico : 'NENHUM',
						deServicoReduzido : 'NENHUM'
					},
				]
			},
			{
				nuCategoria: 26,
				deCategoria: 'AUTORIZA AGENDAMENTO VIA IBC',
				servicos: [
					{
						icSelecionado : true,
						nuServico : 11,
						nuCategoria : 26,
						deServico : 'COM AUTORIZACAO'
					},
					{
						icSelecionado : false,
						nuServico : 15,
						nuCategoria : 26,
						deServico : 'NENHUM'
					},
				]
			},
		];
	}

	vm.listaTarifaContratadaFull = [
					{
						icSelecionado : true,
						nuServico : 1,
						nuCategoria : 1,
						deServico : 'DOC',
						deServicoReduzido : 'DOC',
						icCentroCusto : 'F',
						icTarifa : 'F',
						vrBruto : 1.49,
						vrCusto : 0.30,
						vrDesconto : 0.00,
						vrDesejado : 0.00,
						vrReceita : 0.23,
						vrTarifaContrada : 0.00
					},
					{
						icSelecionado : true,
						nuServico : 2,
						nuCategoria : 1,
						deServico : 'COBRANCA CAIXA',
						deServicoReduzido : 'COBRANCA CAIXA',
						icCentroCusto : 'F',
						icTarifa : 'F',
						vrBruto : 0.32,
						vrCusto : 0.30,
						vrDesconto : 0.00,
						vrDesejado : 0.00,
						vrReceita : 0.23,
						vrTarifaContrada : 0.00
					},
					{
						icSelecionado : true,
						nuServico : 8,
						nuCategoria : 1,
						deServico : 'TED',
						deServicoReduzido : 'TED',
						icCentroCusto : 'F',
						icTarifa : 'F',
						vrBruto : 1.12,
						vrCusto : 0.30,
						vrDesconto : 0.00,
						vrDesejado : 0.00,
						vrReceita : 0.23,
						vrTarifaContrada : 0.00
					}

		];

	vm.validarCheck = function(obj, ct) {
		if (ct != 1) {
			vm.servicos.forEach(function(item, indice) {
						if (item.nuCategoria === ct) {
							if ((item.nuCategoria === obj.nuCategoria)
									&& (item.nuServico != obj.nuServico)) {
								item.icSelecionado = false;
							}
						}
					})
		}
	}
	
	vm.validarServicoTarifa = function(ct) {
		if ((ct.nuCategoria == 1) || (ct.nuCategoria == 21)) {
			vm.servicos.forEach(function(item, indice) {
						if (item.nuCategoria === ct.nuCategoria) {
							
							var pesqTarifa = vm.listaTarifaContratadaFull.map(function(e) {return e.nuServico;});
							var retorno = pesqTarifa.indexOf(item.nuServico);
							
							if (item.icSelecionado) {
								if (retorno < 0) {
									var row = {
										"deServico" : item.deServico,
										"deServicoReduzido" : item.deServicoReduzido,
										"icCentroCusto" : item.icCentroCusto,
										"icSelecionado" : item.icSelecionado,
										"icTarifa" : item.icTarifa,
										"nuCategoria" : item.nuCategoria,
										"nuServico" : item.nuServico,
										"vrBruto" : item.vrBruto,
										"vrCusto" : item.vrCusto,
										"vrDesconto" : item.vrDesconto,
										"vrDesejado" : item.vrDesejado,
										"vrReceita" : item.vrReceita,
										"vrTarifaContrada" : item.vrBruto
									};

									vm.listaTarifaContratadaFull.push(row);
								}
							} else {
								if (retorno >= 0) {
									vm.listaTarifaContratadaFull.splice(retorno, 1);
								}
							}
						}
					})
		}
	}

	vm.calcularTarifaDesejada = function(tarifa) {
		if (tarifa.vrDesejado > 0) {
			tarifa.vrTarifaContrada = tarifa.vrDesejado;
			tarifa.vrDesconto = 0;
		}
	}
	
	vm.calcularTarifaPercet = function(tarifa) {
		if (tarifa.vrDesconto > 0) {
			tarifa.vrDesejado = 0;
			var valorPercent = ((tarifa.vrBruto * tarifa.vrDesconto) / 100);
			var valorDesconto = tarifa.vrBruto - valorPercent;
			tarifa.vrTarifaContrada = valorDesconto;
			 
		}
	}
	vm.calcularDescontoGerencial = function(vrDesconto) {
		if (vrDesconto > 0) {
			vm.listaTarifaContratadaFull.forEach(function(item, indice) {
				item.vrDesconto =  vrDesconto;
				var valorPercent = ((item.vrBruto * item.vrDesconto) / 100);
				var valorDesconto = item.vrBruto - valorPercent;
				item.vrTarifaContrada = valorDesconto;
			});
		}
	}
	vm.calcularValorTotalTarifa = function() { 
		vm.valorTotalTarifa = 0;
		vm.listaTarifaContratadaFull.forEach(function(item, indice) { 
			vm.valorTotalTarifa = vm.valorTotalTarifa + item.vrTarifaContrada  ;
		});
	}

	 
	
	vm.validarCalculo = function(tarifa) {
		if (tarifa.vrDesejado == "" || tarifa.vrDesejado == null) {
			tarifa.vrDesejado = 0
		}
		if (tarifa.vrDesconto == "" || tarifa.vrDesconto == null ) {
			tarifa.vrDesconto = 0
		}
		if ((tarifa.vrDesejado == 0) && (tarifa.vrDesconto == 0)) {
			tarifa.vrTarifaContrada = tarifa.vrBruto.toFixed(2);
		}
	}
	
	var number = 0;
	vm.addIndex = function() {
		return number++;
	}

	vm.clear = function() {
		vm.itemPacote = "";
	}

});