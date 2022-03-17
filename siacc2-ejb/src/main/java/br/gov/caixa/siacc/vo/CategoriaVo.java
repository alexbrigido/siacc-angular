package br.gov.caixa.siacc.vo;

import java.io.Serializable;
import java.util.List;
 
public class CategoriaVo implements Serializable {
   
	private static final long serialVersionUID = -4866295702468620427L;
	private int nuCategoria; 
	private String deCategoria; 
	private List<ServicoVo> servicos ;
	private Boolean icSelecionado;
	
	public CategoriaVo(){
		super();
	}
	public int getNuCategoria() {
		return nuCategoria;
	}

	public void setNuCategoria(int nuCategoria) {
		this.nuCategoria = nuCategoria;
	}

	public String getDeCategoria() {
		return deCategoria;
	}

	public void setDeCategoria(String deCategoria) {
		this.deCategoria = deCategoria;
	}

	public List<ServicoVo> getServicos() {
		return servicos;
	}

	public void setServicos(List<ServicoVo> servicos) {
		this.servicos = servicos;
	}
	public Boolean getIcSelecionado() {
		return icSelecionado;
	}
	public void setIcSelecionado(Boolean icSelecionado) {
		this.icSelecionado = icSelecionado;
	}

	 
	 
	
	
}