package br.gov.caixa.siacc.vo;

import java.util.Date;

public class PacoteServicoContratavelVo {
  
	private Long nuPacote;
	 
	private String  nomePacote;
		 	 
	private int  qtdiaFloatTarifa;
 
	private int  qtDiaFloat;
 
	private int  nuPeriodoApuracaoRepasse;
	 
	private int  nuPeriodoApuracaoTarifa; 
	
	private int  nuPeriodoApuracaoRetorno;
 
	private Date  inicioVigencia;
 
	private Date  fimVigencia;

	private Long nuTipoCompromisso;
	
	private String  nomeTipoCompromisso;

	public PacoteServicoContratavelVo(Long nuPacote, String  nomePacote, Date  inicioVigencia, Long nuTipoCompromisso, String nomeTipoCompromisso){
		this.nuPacote = nuPacote;
		this.nomePacote = nomePacote;
		this.nuTipoCompromisso = nuTipoCompromisso; 
		this.nomeTipoCompromisso = nomeTipoCompromisso;
		this.inicioVigencia = inicioVigencia;
		
		
	}
	
	
	public synchronized Long getNuPacote() {
		return nuPacote;
	}

	public synchronized void setNuPacote(Long nuPacote) {
		this.nuPacote = nuPacote;
	}

	public synchronized String getNomePacote() {
		return nomePacote;
	}

	public synchronized void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}

	public synchronized int getQtdiaFloatTarifa() {
		return qtdiaFloatTarifa;
	}

	public synchronized void setQtdiaFloatTarifa(int qtdiaFloatTarifa) {
		this.qtdiaFloatTarifa = qtdiaFloatTarifa;
	}

	public synchronized int getQtDiaFloat() {
		return qtDiaFloat;
	}

	public synchronized void setQtDiaFloat(int qtDiaFloat) {
		this.qtDiaFloat = qtDiaFloat;
	}

	public synchronized int getNuPeriodoApuracaoRepasse() {
		return nuPeriodoApuracaoRepasse;
	}

	public synchronized void setNuPeriodoApuracaoRepasse(int nuPeriodoApuracaoRepasse) {
		this.nuPeriodoApuracaoRepasse = nuPeriodoApuracaoRepasse;
	}

	public synchronized int getNuPeriodoApuracaoTarifa() {
		return nuPeriodoApuracaoTarifa;
	}

	public synchronized void setNuPeriodoApuracaoTarifa(int nuPeriodoApuracaoTarifa) {
		this.nuPeriodoApuracaoTarifa = nuPeriodoApuracaoTarifa;
	}

	public synchronized int getNuPeriodoApuracaoRetorno() {
		return nuPeriodoApuracaoRetorno;
	}

	public synchronized void setNuPeriodoApuracaoRetorno(int nuPeriodoApuracaoRetorno) {
		this.nuPeriodoApuracaoRetorno = nuPeriodoApuracaoRetorno;
	}

	public synchronized Date getInicioVigencia() {
		return inicioVigencia;
	}

	public synchronized void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public synchronized Date getFimVigencia() {
		return fimVigencia;
	}

	public synchronized void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	public synchronized Long getNuTipoCompromisso() {
		return nuTipoCompromisso;
	}

	public synchronized void setNuTipoCompromisso(Long nuTipoCompromisso) {
		this.nuTipoCompromisso = nuTipoCompromisso;
	}

	public synchronized String getNomeTipoCompromisso() {
		return nomeTipoCompromisso;
	}

	public synchronized void setNomeTipoCompromisso(String nomeTipoCompromisso) {
		this.nomeTipoCompromisso = nomeTipoCompromisso;
	}
  
	
	
	
}
