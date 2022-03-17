package br.gov.caixa.siacc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCXTB27CATEGORIA")
public class CategoriaModel implements Serializable {
 
	private static final long serialVersionUID = -3968083909867533003L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NU_CATEGORIA")
	private int nuCategoria;

	@Column(name = "DE_CATEGORIA")
	private String deCategoria;
 
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
 
	
}