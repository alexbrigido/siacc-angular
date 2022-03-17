package br.gov.caixa.siacc.vo;

import java.io.Serializable;

/***********************************************************************
 * Module: Categoria.java Author: joseliano.araujo
 ***********************************************************************/

public class ServicoVo implements Serializable {

	private static final long serialVersionUID = 1527954337986645386L;
	private int nuServico;
	private int nuCategoria;
	private double vrCusto;
	private double vrReceita;
	private String icTarifa;
	private String deServicoReduzido;
	private String deServico;
	private Boolean icSelecionado;

	private double vrBruto;
	private double vrDesejado;

	private double vrTarifaContrada;
	private double vrDesconto;
	private String icCentroCusto;

	public ServicoVo() {
		super();
	}

	public ServicoVo(int nuServico, int nuCategoria, double vrCusto, double vrReceita, String icTarifa,
			String deServicoReduzido, String deServico, int situacao) {
		this.nuServico = nuServico;
		this.nuCategoria = nuCategoria;
		this.vrCusto = vrCusto;
		this.vrReceita = vrReceita;
		this.icTarifa = icTarifa;
		this.deServicoReduzido = deServicoReduzido;
		this.deServico = deServico;

		if (situacao == 0) {
			this.icSelecionado = false;
		} else {
			this.icSelecionado = true;
		}

	}

	public ServicoVo(int nuServico, int nuCategoria, double vrCusto, double vrReceita, String icTarifa,
			String deServicoReduzido, String deServico, double vrTarifaContrada, double vrDesconto,
			String icCentroCusto) {
		this.nuServico = nuServico;
		this.nuCategoria = nuCategoria;
		this.vrCusto = vrCusto;
		this.vrReceita = vrReceita;
		this.icTarifa = icTarifa;
		this.deServicoReduzido = deServicoReduzido;
		this.deServico = deServico;

		this.vrTarifaContrada = vrTarifaContrada;
		this.vrDesconto = vrDesconto;
		this.icCentroCusto = icCentroCusto;
	}

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

	public Boolean getIcSelecionado() {
		return icSelecionado;
	}

	public void setIcSelecionado(Boolean icSelecionado) {
		this.icSelecionado = icSelecionado;
	}

	public double getVrTarifaContrada() {
		return vrTarifaContrada;
	}

	public void setVrTarifaContrada(double vrTarifaContrada) {
		this.vrTarifaContrada = vrTarifaContrada;
	}

	public double getVrDesconto() {
		return vrDesconto;
	}

	public void setVrDesconto(double vrDesconto) {
		this.vrDesconto = vrDesconto;
	}

	public String getIcCentroCusto() {
		return icCentroCusto;
	}

	public void setIcCentroCusto(String icCentroCusto) {
		this.icCentroCusto = icCentroCusto;
	}

	public double getVrBruto() {
		return this.vrCusto + this.vrReceita;
	}

	public double getVrDesejado() {
		return vrDesejado;
	}

	public void setVrDesejado(double vrDesejado) {
		this.vrDesejado = vrDesejado;
	}

	public void setVrBruto(double vrBruto) {
		this.vrBruto = vrBruto;
	}

}
