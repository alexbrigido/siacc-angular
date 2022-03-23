var webapp = angular.module('webApp');
webapp .controller( 'PacoteManutencaoController',function($scope, $rootScope, $stateParams, $q, pacoteservice, whttp) {
	var vm = this;

	$scope.today = moment();
	moment.lang('pt');
  
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

	vm.consultCategoria = function(nuTipoCompromisso, pacote) {
		consultCategoria(nuTipoCompromisso, pacote).then(
				function(res) {

					vm.nuTipoCompromisso = nuTipoCompromisso;
					vm.pacote = pacote;

					consultTarifaContratada(nuTipoCompromisso,pacote).then(function(res) {
						vm.exbirAbas = true;
					})

				})
	}

	var consultCategoria = function(nuTipoCompromisso, pacote) {
		var deferred = $q.defer();

		vm.qtDiaFloat = pacote.qtDiaFloat;
		vm.qtdiaFloatTarifa = pacote.qtdiaFloatTarifa;

		pacoteservice.consultarCategoria(nuTipoCompromisso,pacote.nuPacote)
				.then(function(res) {
							if (res != null && res != undefined) {
								vm.listaCategoriaFull = res.data[0];
								console.log("listaCategoriaFull ", vm.listaCategoriaFull)

								vm.listaCategoriaFull.forEach(function(item,indice) {
											item.servicos.forEach(function(s,si) {
														var row = {
															"icSelecionado" : s.icSelecionado,
															"nuServico" : s.nuServico,
															"nuCategoria" : s.nuCategoria,
															"deServico" : s.deServico,
															"deServicoReduzido" : s.deServicoReduzido,
															"icCentroCusto" : s.icCentroCusto,
															"nomeCategoria" : item.deCategoria,
															"icTarifa" : s.icTarifa,
															"vrBruto" : s.vrBruto,
															"vrCusto" : s.vrCusto,
															"vrDesconto" : s.vrDesconto,
															"vrDesejado" : s.vrDesejado,
															"vrReceita" : s.vrReceita,
															"vrTarifaContrada" : s.vrTarifaContrada
														};
														vm.servicos.push(row);
													})
										})
								deferred.resolve(true);
							} else {
							}
							
						}, function(request, status, err) {
							var erro = err;
							deferred.reject(false)
						})

		return deferred.promise;
	}

	var consultTarifaContratada = function(nuTipoCompromisso,pacote) {
		var deferred = $q.defer();

		vm.qtDiaFloat = pacote.qtDiaFloat;
		vm.qtdiaFloatTarifa = pacote.qtdiaFloatTarifa;

		pacoteservice.consultarTarifaContratada(nuTipoCompromisso, pacote.nuPacote)
				.then(
						function(res) {
							if (res != null && res != undefined) {
								vm.listaTarifaContratadaFull = res.data[0];
								vm.calcularValorTotalTarifa ();
								deferred.resolve(true);
							} else {
							}
						}, function(request, status, err) {
							var erro = err;
							deferred.reject(false);
						})

		return deferred.promise;
	}

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

	var consultarPacote = function(nuTipoCompromisso,nuPacote) {

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
	
	var number = 0;
	vm.addIndex = function() {
		return number++;
	}

	vm.clear = function() {
		vm.itemPacote = "";
	}

});