package br.gov.caixa.siacc.vo;

import br.gov.caixa.siacc.enumeration.SimNao;

public class ConvenioVo {

	public int nuConvenio;
	public String noConvenio;
	public String noLogradouro;
	public int nuLocal;
	public String noComplemento;
	public String noBairro;
	public String noCidade;
	public String noUf;
	public int nuCep;
	public double nuTelefone;
	public java.util.Date dtInclusao;
	public java.util.Date dtInicioVigencia;
	public java.util.Date dtFimVigencia;
	public int nuCgcOrdem;
	public int nuCgcDv;
	public int nuCpf;
	public int nuCpfDv;
	public int nuCgcUnidade;
	public int icTipoEmpresa;
	public String icEmpresaColigada;
	public int coSegmentoEmpresa;
	public String icContaUnica;
	public int coProdutoContaConvenio;
	public int nuContaConvenio;
	public int icRegraLancamento;
	public int icFormaLancamentoConvenio;
	public String icFormalizacaoContrato;
	public String icProcessamentoCentralizado;
	public String icCadastramentoCmploConvenio;
	public int nuUltimoAgendamento;
	public int icFormaEnvioCobranca;
	public int icFormaDebito;
	public int icFormaCredito;
	public int icPorte;
	public int icNaturezaConvenente;
	public String icSeguradora;
	public String icRegraGoverno;
	public int icOrigemContaConvenio;
	public double nuContaNsgd;
	public int nuProduto;
	public int icRetornoConta = 1;
	public double vrFaturamentoAnual;
	public int icCnpjPagador;
	public int nuCnae;
	public String icIof;
	
	
	public int getNuConvenio() {
		return nuConvenio;
	}
	public void setNuConvenio(int nuConvenio) {
		this.nuConvenio = nuConvenio;
	}
	public String getNoConvenio() {
		return noConvenio;
	}
	public void setNoConvenio(String noConvenio) {
		this.noConvenio = noConvenio;
	}
	public String getNoLogradouro() {
		return noLogradouro;
	}
	public void setNoLogradouro(String noLogradouro) {
		this.noLogradouro = noLogradouro;
	}
	public int getNuLocal() {
		return nuLocal;
	}
	public void setNuLocal(int nuLocal) {
		this.nuLocal = nuLocal;
	}
	public String getNoComplemento() {
		return noComplemento;
	}
	public void setNoComplemento(String noComplemento) {
		this.noComplemento = noComplemento;
	}
	public String getNoBairro() {
		return noBairro;
	}
	public void setNoBairro(String noBairro) {
		this.noBairro = noBairro;
	}
	public String getNoCidade() {
		return noCidade;
	}
	public void setNoCidade(String noCidade) {
		this.noCidade = noCidade;
	}
	public String getNoUf() {
		return noUf;
	}
	public void setNoUf(String noUf) {
		this.noUf = noUf;
	}
	public int getNuCep() {
		return nuCep;
	}
	public void setNuCep(int nuCep) {
		this.nuCep = nuCep;
	}
	public double getNuTelefone() {
		return nuTelefone;
	}
	public void setNuTelefone(double nuTelefone) {
		this.nuTelefone = nuTelefone;
	}
	public java.util.Date getDtInclusao() {
		return dtInclusao;
	}
	public void setDtInclusao(java.util.Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}
	public java.util.Date getDtInicioVigencia() {
		return dtInicioVigencia;
	}
	public void setDtInicioVigencia(java.util.Date dtInicioVigencia) {
		this.dtInicioVigencia = dtInicioVigencia;
	}
	public java.util.Date getDtFimVigencia() {
		return dtFimVigencia;
	}
	public void setDtFimVigencia(java.util.Date dtFimVigencia) {
		this.dtFimVigencia = dtFimVigencia;
	}
	public int getNuCgcOrdem() {
		return nuCgcOrdem;
	}
	public void setNuCgcOrdem(int nuCgcOrdem) {
		this.nuCgcOrdem = nuCgcOrdem;
	}
	public int getNuCgcDv() {
		return nuCgcDv;
	}
	public void setNuCgcDv(int nuCgcDv) {
		this.nuCgcDv = nuCgcDv;
	}
	public int getNuCpf() {
		return nuCpf;
	}
	public void setNuCpf(int nuCpf) {
		this.nuCpf = nuCpf;
	}
	public int getNuCpfDv() {
		return nuCpfDv;
	}
	public void setNuCpfDv(int nuCpfDv) {
		this.nuCpfDv = nuCpfDv;
	}
	public int getNuCgcUnidade() {
		return nuCgcUnidade;
	}
	public void setNuCgcUnidade(int nuCgcUnidade) {
		this.nuCgcUnidade = nuCgcUnidade;
	}
	public int getIcTipoEmpresa() {
		return icTipoEmpresa;
	}
	public void setIcTipoEmpresa(int icTipoEmpresa) {
		this.icTipoEmpresa = icTipoEmpresa;
	}
	public String getIcEmpresaColigada() {
		return icEmpresaColigada;
	}
	public void setIcEmpresaColigada(String icEmpresaColigada) {
		this.icEmpresaColigada = icEmpresaColigada;
	}
	public int getCoSegmentoEmpresa() {
		return coSegmentoEmpresa;
	}
	public void setCoSegmentoEmpresa(int coSegmentoEmpresa) {
		this.coSegmentoEmpresa = coSegmentoEmpresa;
	}
	public String getIcContaUnica() {
		return SimNao.valueOf(icContaUnica).toString()  ;
	}
	public void setIcContaUnica(String icContaUnica) {
		this.icContaUnica = icContaUnica;
	}
	public int getCoProdutoContaConvenio() {
		return coProdutoContaConvenio;
	}
	public void setCoProdutoContaConvenio(int coProdutoContaConvenio) {
		this.coProdutoContaConvenio = coProdutoContaConvenio;
	}
	public int getNuContaConvenio() {
		return nuContaConvenio;
	}
	public void setNuContaConvenio(int nuContaConvenio) {
		this.nuContaConvenio = nuContaConvenio;
	}
	public int getIcRegraLancamento() {
		return icRegraLancamento;
	}
	public void setIcRegraLancamento(int icRegraLancamento) {
		this.icRegraLancamento = icRegraLancamento;
	}
	public int getIcFormaLancamentoConvenio() {
		return icFormaLancamentoConvenio;
	}
	public void setIcFormaLancamentoConvenio(int icFormaLancamentoConvenio) {
		this.icFormaLancamentoConvenio = icFormaLancamentoConvenio;
	}
	public String getIcFormalizacaoContrato() {
		return icFormalizacaoContrato;
	}
	public void setIcFormalizacaoContrato(String icFormalizacaoContrato) {
		this.icFormalizacaoContrato = icFormalizacaoContrato;
	}
	public String getIcProcessamentoCentralizado() {
		return icProcessamentoCentralizado;
	}
	public void setIcProcessamentoCentralizado(String icProcessamentoCentralizado) {
		this.icProcessamentoCentralizado = icProcessamentoCentralizado;
	}
	public String getIcCadastramentoCmploConvenio() {
		return icCadastramentoCmploConvenio;
	}
	public void setIcCadastramentoCmploConvenio(String icCadastramentoCmploConvenio) {
		this.icCadastramentoCmploConvenio = icCadastramentoCmploConvenio;
	}
	public int getNuUltimoAgendamento() {
		return nuUltimoAgendamento;
	}
	public void setNuUltimoAgendamento(int nuUltimoAgendamento) {
		this.nuUltimoAgendamento = nuUltimoAgendamento;
	}
	public int getIcFormaEnvioCobranca() {
		return icFormaEnvioCobranca;
	}
	public void setIcFormaEnvioCobranca(int icFormaEnvioCobranca) {
		this.icFormaEnvioCobranca = icFormaEnvioCobranca;
	}
	public int getIcFormaDebito() {
		return icFormaDebito;
	}
	public void setIcFormaDebito(int icFormaDebito) {
		this.icFormaDebito = icFormaDebito;
	}
	public int getIcFormaCredito() {
		return icFormaCredito;
	}
	public void setIcFormaCredito(int icFormaCredito) {
		this.icFormaCredito = icFormaCredito;
	}
	public int getIcPorte() {
		return icPorte;
	}
	public void setIcPorte(int icPorte) {
		this.icPorte = icPorte;
	}
	public int getIcNaturezaConvenente() {
		return icNaturezaConvenente;
	}
	public void setIcNaturezaConvenente(int icNaturezaConvenente) {
		this.icNaturezaConvenente = icNaturezaConvenente;
	}
	public String getIcSeguradora() {
		return icSeguradora;
	}
	public void setIcSeguradora(String icSeguradora) {
		this.icSeguradora = icSeguradora;
	}
	public String getIcRegraGoverno() {
		return icRegraGoverno;
	}
	public void setIcRegraGoverno(String icRegraGoverno) {
		this.icRegraGoverno = icRegraGoverno;
	}
	public int getIcOrigemContaConvenio() {
		return icOrigemContaConvenio;
	}
	public void setIcOrigemContaConvenio(int icOrigemContaConvenio) {
		this.icOrigemContaConvenio = icOrigemContaConvenio;
	}
	public double getNuContaNsgd() {
		return nuContaNsgd;
	}
	public void setNuContaNsgd(double nuContaNsgd) {
		this.nuContaNsgd = nuContaNsgd;
	}
	public int getNuProduto() {
		return nuProduto;
	}
	public void setNuProduto(int nuProduto) {
		this.nuProduto = nuProduto;
	}
	public int getIcRetornoConta() {
		return icRetornoConta;
	}
	public void setIcRetornoConta(int icRetornoConta) {
		this.icRetornoConta = icRetornoConta;
	}
	public double getVrFaturamentoAnual() {
		return vrFaturamentoAnual;
	}
	public void setVrFaturamentoAnual(double vrFaturamentoAnual) {
		this.vrFaturamentoAnual = vrFaturamentoAnual;
	}
	public int getIcCnpjPagador() {
		return icCnpjPagador;
	}
	public void setIcCnpjPagador(int icCnpjPagador) {
		this.icCnpjPagador = icCnpjPagador;
	}
	public int getNuCnae() {
		return nuCnae;
	}
	public void setNuCnae(int nuCnae) {
		this.nuCnae = nuCnae;
	}
	public String getIcIof() {
		return icIof;
	}
	public void setIcIof(String icIof) {
		this.icIof = icIof;
	}

	
}