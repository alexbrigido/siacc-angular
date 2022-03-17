package br.gov.caixa.siacc.model;
/***********************************************************************
 * Module:  ConvenioBean.java
 * Author:  joseliano.araujo
 * Purpose: Defines the Class ConvenioBean
 ***********************************************************************/

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 
@Entity	
@Table(name = "ACCXTB30CONVENIO")
public class ConvenioModel implements  Serializable {

	private static final long serialVersionUID = -1791037969168612027L;

	@Id
	@Column(name = "NU_CONVENIO")
	private Integer nuConvenio;
 
	@Column(name = "NO_CONVENIO", length = 55)
	private String noConvenio;
 
	@Column(name = "NO_LOGRADOURO", length = 30)
	private String noLogradouro;
 
	@Column(name = "NU_LOCAL")
	private int nuLocal;
 
	@Column(name = "NO_COMPLEMENTO", length = 15)
	private String noComplemento;
 
	@Column(name = "NO_BAIRRO", length = 15)
	private String noBairro;
 
	@Column(name = "NO_CIDADE", length = 20)
	private String noCidade;
 
	@Column(name = "NO_UF", length = 2)
	private String noUf;
 
	@Column(name = "NU_CEP")
	private int nuCep;
 
	@Column(name = "NU_TELEFONE", length = 12)
	private double nuTelefone;
 
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INCLUSAO")
	private java.util.Date dtInclusao;
 
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INICIO_VIGENCIA")
	private java.util.Date dtInicioVigencia;
 
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FIM_VIGENCIA")
	private java.util.Date dtFimVigencia;
 
	@Column(name = "NU_CGC_BASICO")
	private int nuCgcBasico;
 
	@Column(name = "NU_CGC_ORDEM")
	private int nuCgcOrdem;
 
	@Column(name = "NU_CGC_DV")
	private int nuCgcDv;
 
	@Column(name = "NU_CPF", nullable=true)
	private int nuCpf;
 
	@Column(name = "NU_CPF_DV")
	private int nuCpfDv;
 
	@Column(name = "NU_CGC_UNIDADE")
	private int nuCgcUnidade;
 
	@Column(name = "IC_TIPO_EMPRESA")
	private int icTipoEmpresa;
 
	@Column(name = "IC_EMPRSA_COLIGADA", length = 1)
	private String icEmpresaColigada;
 
	@Column(name = "CO_SGMNTO_EMPRSA")
	private int coSegmentoEmpresa;
 
	@Column(name = "IC_CONTA_UNICA", length = 1) 
	private String icContaUnica;
 
	@Column(name = "NU_CGC_CTA_CNVNO")
	private int nuCgcContaConvenio;
 
	@Column(name = "CO_PRDTO_CTA_CNVNO")
	private int coProdutoContaConvenio;
 
	@Column(name = "NU_CONTA_CONVENIO")
	private int nuContaConvenio;
 
	@Column(name = "IC_REGRA_LNCMO")
	private int icRegraLancamento;
 
	@Column(name = "IC_FORMA_LNCMO")
	private int icFormaLancamentoConvenio;
	/**
	 * INDICADOR DA FORMALIZACAO DO CONTRATO. EX; S = CONTRATO FORMALIZADO N=
	 * CONTRATO NAO FORMALIZADO
	 */
	@Column(name = "IC_FRMLZCO_CNTRTO", length = 1)
	private String icFormalizacaoContrato;

	/**
	 * INDICADOR SE O CONVENIO TEM PROCESSAMENTO CENTRALIZADO. "S" = POSSUI
	 * PROCESSAMENTO CENTRALIZADO "N" = POSSUI PROCESSAMENTO DESCENTRALIZADO
	 */
	@Column(name = "IC_PRCTO_CNTRZADO", length = 1)
	private String icProcessamentoCentralizado;

	/**
	 * INDICADOR DO CADASTRAMENTO COMPLETO DO CONVENIO: "S" = CADASTRAMENTO
	 * COMPLETO "N" = CADASTRAMENTO INCOMPLETO
	 */
	@Column(name = "IC_CDSTO_COMPLETO", length = 1)
	private String icCadastramentoCmploConvenio;

	@Column(name = "NU_ULTIMO_AGNDO")
	private int nuUltimoAgendamento;

	@Column(name = "IC_FRMA_ENVO_CBRNA")
	private int icFormaEnvioCobranca;

	@Column(name = "IC_FORMA_DEBITO")
	private int icFormaDebito;

	@Column(name = "IC_FORMA_CREDITO")
	private int icFormaCredito;

	@Column(name = "IC_PORTE")
	private int icPorte;

	@Column(name = "IC_NATUREZA_CNVNE")
	private int icNaturezaConvenente;

	@Column(name = "IC_SEGURADORA", length = 1)
	private String icSeguradora;

	/**
	 * Indicador de empresa que tem convênio com o Governo, podendo ser
	 * municipal ou estadual. Poderá conter os valores "S" ou "N". O default
	 * será "N".
	 * 
	 */
	@Column(name = "IC_REGRA_GOVERNO", length = 1)
	private String icRegraGoverno;

	/**
	 * Indicador da origem de conta corrente do convenio. Ex; 01= NSGD ou
	 * 02=SIDEC
	 * 
	 */
	@Column(name = "IC_ORGM_CNTA_CNVNO")
	private int icOrigemContaConvenio;

	@Column(name = "NU_CONTA_NSGD", length = 12)
	private double nuContaNsgd;

	@Column(name = "NU_PRODUTO")
	private int nuProduto;

	/**
	 * Indicador para informar se a conta a ser retornada para a convenente será
	 * no padrão SIDEC OU NSGD. Sendo: 1-SIDEC 2-NSGD O valor inicial padrão é
	 * 1.
	 */
	@Column(name = "IC_RETORNO_CONTA")
	private int icRetornoConta = 1;

	@Column(name = "VR_FTRMO_ANUAL", length = 18, precision = 2)
	private double vrFaturamentoAnual;

	@Column(name = "IC_VLDCO_CNTA")
	private int icValidacaoConta;
	/**
	 * Indica se o CNPJ pagador será o cadastrado no Convênio ou no Compromisso.
	 * 1 - Convênio 2 - Compromisso
	 */
	@Column(name = "IC_CNPJ_PAGADOR")
	private int icCnpjPagador;

	@Column(name = "NU_CNAE")
	private int nuCnae;

	@Column(name = "IC_IOF", length = 1)
	private String icIof;

	public Integer getNuConvenio() {
		return nuConvenio;
	}

	public void setNuConvenio(Integer nuConvenio) {
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

	public int getNuCgcBasico() {
		return nuCgcBasico;
	}

	public void setNuCgcBasico(int nuCgcBasico) {
		this.nuCgcBasico = nuCgcBasico;
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
		return icContaUnica;
	}

	public void setIcContaUnica(String icContaUnica) {
		this.icContaUnica = icContaUnica;
	}

	public int getNuCgcContaConvenio() {
		return nuCgcContaConvenio;
	}

	public void setNuCgcContaConvenio(int nuCgcContaConvenio) {
		this.nuCgcContaConvenio = nuCgcContaConvenio;
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

	public int getIcValidacaoConta() {
		return icValidacaoConta;
	}

	public void setIcValidacaoConta(int icValidacaoConta) {
		this.icValidacaoConta = icValidacaoConta;
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