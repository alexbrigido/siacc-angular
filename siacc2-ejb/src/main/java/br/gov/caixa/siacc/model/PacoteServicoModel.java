package br.gov.caixa.siacc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import br.gov.caixa.siacc.config.DatabaseConfig;

/***********************************************************************
 * Module:  PacoteServico.java
 * Author:  joseliano.araujo
 * Purpose: Defines the Class PacoteServico
 ***********************************************************************/


@Entity
@Table(name="ACCXTB80PCTESRVCO", schema = DatabaseConfig.ESQUEMA_BANCO)
public class PacoteServicoModel  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6230876066726809001L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NU_PACOTE")
	private Long nuPacote;
	
	@Column(name = "DE_PACOTE")
	private String  nomePacote;
		 	
	@Column(name = "QT_DIA_FLOAT_TRFA")
	private int  qtdiaFloatTarifa;

	@Column(name = "QT_DIA_FLOAT")
	private int  qtDiaFloat;

	@Column(name = "NU_PRDO_APRCO_RPSE")
	private int  nuPeriodoApuracaoRepasse;
	
	@Column(name = "NU_PRDO_APRCO_TRFA")
	private int  nuPeriodoApuracaoTarifa;
	 
	@Column(name = "NU_PRDO_APRCO_RTNO")
	private int  nuPeriodoApuracaoRetorno;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_VIGENCIA")
	private Date  inicioVigencia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM_VIGENCIA")
	private Date  fimVigencia;
 
	@Transient
	private boolean situacao;

	 

	public String getNomePacote() {
		return nomePacote;
	}

	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}

	public int getQtdiaFloatTarifa() {
		return qtdiaFloatTarifa;
	}

	public void setQtdiaFloatTarifa(int qtdiaFloatTarifa) {
		this.qtdiaFloatTarifa = qtdiaFloatTarifa;
	}

	public int getQtDiaFloat() {
		return qtDiaFloat;
	}

	public void setQtDiaFloat(int qtDiaFloat) {
		this.qtDiaFloat = qtDiaFloat;
	}

	public int getNuPeriodoApuracaoRepasse() {
		return nuPeriodoApuracaoRepasse;
	}

	public void setNuPeriodoApuracaoRepasse(int nuPeriodoApuracaoRepasse) {
		this.nuPeriodoApuracaoRepasse = nuPeriodoApuracaoRepasse;
	}

	public int getNuPeriodoApuracaoTarifa() {
		return nuPeriodoApuracaoTarifa;
	}

	public void setNuPeriodoApuracaoTarifa(int nuPeriodoApuracaoTarifa) {
		this.nuPeriodoApuracaoTarifa = nuPeriodoApuracaoTarifa;
	}

	public int getNuPeriodoApuracaoRetorno() {
		return nuPeriodoApuracaoRetorno;
	}

	public void setNuPeriodoApuracaoRetorno(int nuPeriodoApuracaoRetorno) {
		this.nuPeriodoApuracaoRetorno = nuPeriodoApuracaoRetorno;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public Date getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public Long getNuPacote() {
		return nuPacote;
	}

	public void setNuPacote(Long nuPacote) {
		this.nuPacote = nuPacote;
	}

 
 
	  

}
