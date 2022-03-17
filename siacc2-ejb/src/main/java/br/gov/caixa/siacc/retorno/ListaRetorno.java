package br.gov.caixa.siacc.retorno;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class ListaRetorno<T> extends Retorno {
	/**
	 * Daos que serão trafegados no retorno.
	 */
	@XmlElementWrapper(name = "data")
	@XmlElement(name = "data")
	private List<T> data;

	/**
	 * Construtor padrão sem argumentos.
	 */
	public ListaRetorno() {
		super();
		data = new ArrayList<>();
	}

	/**
	 * Construtor com inicilização dos dados.
	 * 
	 * @param lista
	 */
	public ListaRetorno(List<T> lista) {
		this();
		data.addAll(lista);
	}

	/**
	 * @return the data
	 */
	public final List<T> getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public final void setData(List<T> data) {
		this.data = data;
	}
}
