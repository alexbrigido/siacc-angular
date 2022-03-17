package br.gov.caixa.siacc.model.PK;

import java.io.Serializable;

public class ServicoModelPK implements Serializable {

	private static final long serialVersionUID = -3830782944778687491L;

	private int nuServico;

	private int nuCategoria;

	public ServicoModelPK() {
	}

	public ServicoModelPK(int nuServico, int nuCategoria) {
		this.nuServico = nuServico;
		this.nuCategoria = nuCategoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nuServico == 0) ? 0 : nuServico) + ((nuCategoria == 0) ? 0 : nuCategoria);
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
		ServicoModelPK other = (ServicoModelPK) obj;
		if (nuServico == 0) {
			if (other.nuServico != 0) {
				return false;
			}
		} else if (nuServico != other.nuServico) {
			return false;
		} else if (nuCategoria != other.nuCategoria) {
			return false;
		}

		return true;
	}

}
