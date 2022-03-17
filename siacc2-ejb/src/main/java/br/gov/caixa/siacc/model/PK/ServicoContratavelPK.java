package br.gov.caixa.siacc.model.PK;

import java.io.Serializable;
import java.util.Date;
 
public class ServicoContratavelPK implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1573172133348808349L;
	 
	private Integer nuCategoria;
	 
	private Integer nuServico;  
	 	 
	private Integer nuTipoCompromisso; 	
	 
	private Date  inicioVigencia;		
 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nuCategoria == null) ? 0 : nuCategoria.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServicoContratavelPK other = (ServicoContratavelPK) obj;
		if (nuCategoria == null) {
			if (other.nuCategoria != null)
				return false;
		} else if (!nuCategoria.equals(other.nuCategoria))
			return false;
		return true;
	}
	
}
