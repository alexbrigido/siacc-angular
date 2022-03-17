package br.gov.caixa.siacc.model;

import java.io.Serializable;
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

import br.gov.caixa.siacc.model.PK.PacoteServicoContratavelPK;

@Entity
@Table(name = "ACCXTB82PCTECNTVL")
@IdClass(value = PacoteServicoContratavelPK.class)
public class PacoteServicoContratavelModel  implements Serializable{ 
	
	private static final long serialVersionUID = -8960714853644508825L;

	/**
	 * Importância monetária atribuída pela CAIXA ao serviço simulado, da
	 * seguinte forma: Tarifa Bruta - PC_DESCONTO_UTILIZADO.
	 */
	
	@Id
	@Column(name="FK_NU_CATEGORIA")
	private Integer nuCategoria;
	
	@Id
	@Column(name="FK_NU_SERVICO")
	private Integer nuServico;  
	
	@Id
	@Column(name="FK_NU_PACOTE")
	private Integer nuPacote; 	
	
	@Id
	@Column(name="FK_NU_TIPO_CPMSO")
	private Integer nuTipoCompromisso; 	
	
	@Id	
	@Column(name="FK_DT_INCO_VGNCA")
	private Date  inicioVigencia;		
	  
	 
	@Column(name="VR_TARIFA_CTRDA")
	private double vrTarifaContratada;
	
	@Column(name="IC_CNTCO_TARIFA")
	private String icContratacaoTarifa;
	
	@Column(name="PC_DSCNO_UTILIZADO")
	private double pcDescontoUtilizado;
   
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_NU_PACOTE", nullable=false,insertable=false, updatable=false) 
	private  PacoteServicoModel pacoteServico;
	
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "FK_NU_SERVICO", referencedColumnName = "FK_NU_SERVICO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "FK_NU_CATEGORIA", referencedColumnName = "FK_NU_CATEGORIA", nullable = false, insertable = false, updatable = false), 
			@JoinColumn(name = "FK_NU_TIPO_CPMSO", referencedColumnName = "FK_NU_TIPO_CMPRO", nullable = false, insertable = false, updatable = false) ,
			@JoinColumn(name = "FK_DT_INCO_VGNCA", referencedColumnName = "DT_INICIO_VGNCA", nullable = false, insertable = false, updatable = false) 
		})	
	private ServicoContratavelModel servicoContratavel;
  
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

	public Integer getNuPacote() {
		return nuPacote;
	}

	public void setNuPacote(Integer nuPacote) {
		this.nuPacote = nuPacote;
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

	public double getVrTarifaContratada() {
		return vrTarifaContratada;
	}

	public void setVrTarifaContratada(double vrTarifaContratada) {
		this.vrTarifaContratada = vrTarifaContratada;
	}

	public String getIcContratacaoTarifa() {
		return icContratacaoTarifa;
	}

	public void setIcContratacaoTarifa(String icContratacaoTarifa) {
		this.icContratacaoTarifa = icContratacaoTarifa;
	}

	public double getPcDescontoUtilizado() {
		return pcDescontoUtilizado;
	}

	public void setPcDescontoUtilizado(double pcDescontoUtilizado) {
		this.pcDescontoUtilizado = pcDescontoUtilizado;
	}
 

	public PacoteServicoModel getPacoteServico() {
		return pacoteServico;
	}

	public void setPacoteServico(PacoteServicoModel pacoteServico) {
		this.pacoteServico = pacoteServico;
	}

	public ServicoContratavelModel getServicoContratavel() {
		return servicoContratavel;
	}

	public void setServicoContratavel(ServicoContratavelModel servicoContratavel) {
		this.servicoContratavel = servicoContratavel;
	}
 
	
}
