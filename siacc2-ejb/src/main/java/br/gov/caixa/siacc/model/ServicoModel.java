package br.gov.caixa.siacc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.gov.caixa.siacc.model.PK.ServicoModelPK;

/***********************************************************************
 * Module:  Categoria.java
 * Author:  joseliano.araujo
 * Purpose: Defines the Class Categoria
 ***********************************************************************/
 
@Entity
@Table(name = "ACCXTB37SERVICO")
@IdClass(value = ServicoModelPK.class)
public class ServicoModel  implements Serializable{

	private static final long serialVersionUID = 4195197232811406044L;

	/** IDENTIFICADOR DOS TIPOS DE SERVICOS.
	    * EXEMPLOS : 
	    * COD   NOME
	    * 001     DOC 
	    * 002     COBRANCA ELETRONICA CAIXA
	    * 003     COBRANCA ELETRONICA OUTROS BANCOS
	    * 004     OP 
	    * 005     CREDITO EM CONTA
	    * 006     CHEQUE ADMINISTRATIVO 
	    * 007     TRANSMISSAO ELETRONICA
	    * 008      MEIO MAGNETICO CAIXA 
	    * 009      MEIO MAGNETICO OUTROS
	    * 010      INTERNET
	    * 011      DEBITO SIMPLES
	    * 012      DEBITOS MULTIPLOS
	    * 013      DEBITO PARCIAL
	    * 014      DEBITO INCONDICIONAL
	    * 015      SEM NOTIFICACAO
	    * 016      AVISO DE DEBITO(RECIBO)
	    * 017      NOTIFICACAO DE INSUCESSO DE DEBITO
	    * 018      NOTIFICACAO DE CREDITO
	    * ETC ...
	     */
	@Id	
	@Column(name = "NU_SERVICO")
	private int nuServico;
	
	@Id	
	@Column(name = "FK_NU_CATEGORIA")
	private int nuCategoria;

	@Column(name = "VR_CUSTO")
	private double vrCusto;

	@Column(name = "VR_RECEITA")
	private double vrReceita;

	@Column(name = "IC_TARIFA")
	private String icTarifa;

	@Column(name = "DE_SERVICO_RDUZIDO")
	private String deServicoReduzido;

	@Column(name = "DE_SERVICO")
	private String deServico;
	
	@Transient
	private boolean situacao; 
    
	public int getNuServico() {
		return nuServico;
	}

	public void setNuServico(int nuServico) {
		this.nuServico = nuServico;
	}

	public int getNuCategoria() {
		return nuCategoria;
	}

	public void setNuCategoria(int nuCategoria) {
		this.nuCategoria = nuCategoria;
	}

	public double getVrCusto() {
		return vrCusto;
	}

	public void setVrCusto(double vrCusto) {
		this.vrCusto = vrCusto;
	}

	public double getVrReceita() {
		return vrReceita;
	}

	public void setVrReceita(double vrReceita) {
		this.vrReceita = vrReceita;
	}

	public String getIcTarifa() {
		return icTarifa;
	}

	public void setIcTarifa(String icTarifa) {
		this.icTarifa = icTarifa;
	}

	public String getDeServicoReduzido() {
		return deServicoReduzido;
	}

	public void setDeServicoReduzido(String deServicoReduzido) {
		this.deServicoReduzido = deServicoReduzido;
	}

	public String getDeServico() {
		return deServico;
	}

	public void setDeServico(String deServico) {
		this.deServico = deServico;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
  
	 
}
 