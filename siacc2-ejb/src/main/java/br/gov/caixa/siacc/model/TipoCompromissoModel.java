package br.gov.caixa.siacc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.gov.caixa.siacc.config.DatabaseConfig;

@Entity
@Table(name="ACCXTB40TIPOCMPRSO", schema = DatabaseConfig.ESQUEMA_BANCO)
public class TipoCompromissoModel   implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7301715384220818244L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NU_TIPO_CMPRO")
	private Long nuTipoCompromisso;
	
	@Column(name = "IC_TIPO_CMPRO")
	private String icTipoCompromisso;
	
	@Column(name = "PC_DSCTO_PBLA")
	private Double  pcDescontoPbla;
	
	@Column(name = "PC_DSCTO_PBLA_CNVO")
	private Double  pcDescontoPblaCnvo;
		
	@Column(name = "PC_DSCTO_PRVA")
	private Double  pcDescontoPrva;
	
	@Column(name = "PC_DSCTO_PRVA_CNVO")
	private Double  pcDescontoPrvaCnvo;

	@Column(name = "PC_GERENCIAL_NGCCO")
	private Double  pcGerencialNegociado;

	@Column(name = "DE_TIPO_CMPRO")
	private String  nomeTipoCompromisso;
	
	@Column(name = "PC_DESCONTO_EN")
	private Double  pcDescontoEn;
	
	@Column(name = "PC_DSCNO_CNVNO_INT")
	private Double  pcDescontoCnvnoInt;

	@Column(name = "DT_INICIO_VALIDADE")
	private Date  inicioValidade;

	@Column(name = "DT_FIM_VALIDADE")
	private Date  fimValidade;

	@Transient
	private boolean situacao;
	
	 

	public Long getNuTipoCompromisso() {
		return nuTipoCompromisso;
	}

	public void setNuTipoCompromisso(Long nuTipoCompromisso) {
		this.nuTipoCompromisso = nuTipoCompromisso;
	}

	public String getIcTipoCompromisso() {
		return icTipoCompromisso;
	}

	public void setIcTipoCompromisso(String icTipoCompromisso) {
		this.icTipoCompromisso = icTipoCompromisso;
	}

	public Double getPcDescontoPbla() {
		return pcDescontoPbla;
	}

	public void setPcDescontoPbla(Double pcDescontoPbla) {
		this.pcDescontoPbla = pcDescontoPbla;
	}

	public Double getPcDescontoPblaCnvo() {
		return pcDescontoPblaCnvo;
	}

	public void setPcDescontoPblaCnvo(Double pcDescontoPblaCnvo) {
		this.pcDescontoPblaCnvo = pcDescontoPblaCnvo;
	}

	public Double getPcDescontoPrva() {
		return pcDescontoPrva;
	}

	public void setPcDescontoPrva(Double pcDescontoPrva) {
		this.pcDescontoPrva = pcDescontoPrva;
	}

	public Double getPcDescontoPrvaCnvo() {
		return pcDescontoPrvaCnvo;
	}

	public void setPcDescontoPrvaCnvo(Double pcDescontoPrvaCnvo) {
		this.pcDescontoPrvaCnvo = pcDescontoPrvaCnvo;
	}

	public Double getPcGerencialNegociado() {
		return pcGerencialNegociado;
	}

	public void setPcGerencialNegociado(Double pcGerencialNegociado) {
		this.pcGerencialNegociado = pcGerencialNegociado;
	}

	public String getNomeTipoCompromisso() {
		return nomeTipoCompromisso;
	}

	public void setNomeTipoCompromisso(String nomeTipoCompromisso) {
		this.nomeTipoCompromisso = nomeTipoCompromisso;
	}

	public Double getPcDescontoEn() {
		return pcDescontoEn;
	}

	public void setPcDescontoEn(Double pcDescontoEn) {
		this.pcDescontoEn = pcDescontoEn;
	}

	public Double getPcDescontoCnvnoInt() {
		return pcDescontoCnvnoInt;
	}

	public void setPcDescontoCnvnoInt(Double pcDescontoCnvnoInt) {
		this.pcDescontoCnvnoInt = pcDescontoCnvnoInt;
	}

	public Date getInicioValidade() {
		return inicioValidade;
	}

	public void setInicioValidade(Date inicioValidade) {
		this.inicioValidade = inicioValidade;
	}

	public Date getFimValidade() {
		return fimValidade;
	}

	public void setFimValidade(Date fimValidade) {
		this.fimValidade = fimValidade;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}


}
