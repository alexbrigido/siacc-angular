package br.gov.caixa.siacc.model;

import java.io.Serializable;
/***********************************************************************
 * Module:  ServicoContratavel.java
 * Author:  joseliano.araujo
 * Purpose: Defines the Class ServicoContratavel
 ***********************************************************************/
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.gov.caixa.siacc.model.PK.ServicoContratavelPK;

@Entity
@Table(name = "ACCXTB39SRVCOCNTRL")
@IdClass(value = ServicoContratavelPK.class)
public class ServicoContratavelModel implements Serializable {

	private static final long serialVersionUID = 4749835701634264450L;

	@Id
	@Column(name = "FK_NU_CATEGORIA")
	private Integer nuCategoria;

	@Id
	@Column(name = "FK_NU_SERVICO")
	private Integer nuServico;

	@Id
	@Column(name = "FK_NU_TIPO_CMPRO")
	private Integer nuTipoCompromisso;

	@Id
	@Column(name = "DT_INICIO_VGNCA")
	private Date inicioVigencia;

	@Column(name = "DT_FIM_VGNCA")
	private Date fimVigencia;

	@Column(name = "IC_SERVICO_DSPNL")
	private String icServicoDisponivel;

	@Column(name = "IC_TIPO_CATEGORIA")
	private String icTipoCategoria;

	@Column(name = "IC_SERVICO_CTGRA")
	private String icServicoCategoria;

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "FK_NU_SERVICO", referencedColumnName = "NU_SERVICO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "FK_NU_CATEGORIA", referencedColumnName = "FK_NU_CATEGORIA", nullable = false, insertable = false, updatable = false) })
	private ServicoModel servico;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_NU_TIPO_CMPRO", nullable = false, insertable = false, updatable = false)
	private TipoCompromissoModel tipoCompromisso;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_NU_CATEGORIA", nullable = false, insertable = false, updatable = false)
	private CategoriaModel categoria; 

	public Integer getNuCategoria() {
		return nuCategoria;
	}

	public void setNuCategoria(Integer nuCategoria) {
		this.nuCategoria = nuCategoria;
	}

	public Integer getNuServico() {
		return nuServico;
	}

	public void setNuServico(Integer nuServico) {
		this.nuServico = nuServico;
	}

	public Integer getNuTipoCompromisso() {
		return nuTipoCompromisso;
	}

	public void setNuTipoCompromisso(Integer nuTipoCompromisso) {
		this.nuTipoCompromisso = nuTipoCompromisso;
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

	public String getIcServicoDisponivel() {
		return icServicoDisponivel;
	}

	public void setIcServicoDisponivel(String icServicoDisponivel) {
		this.icServicoDisponivel = icServicoDisponivel;
	}

	public String getIcTipoCategoria() {
		return icTipoCategoria;
	}

	public void setIcTipoCategoria(String icTipoCategoria) {
		this.icTipoCategoria = icTipoCategoria;
	}

	public String getIcServicoCategoria() {
		return icServicoCategoria;
	}

	public void setIcServicoCategoria(String icServicoCategoria) {
		this.icServicoCategoria = icServicoCategoria;
	}
 
	public ServicoModel getServico() {
		return servico;
	}

	public void setServico(ServicoModel servico) {
		this.servico = servico;
	}

	public TipoCompromissoModel getTipoCompromisso() {
		return tipoCompromisso;
	}

	public void setTipoCompromisso(TipoCompromissoModel tipoCompromisso) {
		this.tipoCompromisso = tipoCompromisso;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

}