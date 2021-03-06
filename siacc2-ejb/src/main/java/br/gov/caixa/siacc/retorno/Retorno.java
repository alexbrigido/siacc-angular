package br.gov.caixa.siacc.retorno;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author SIOGP
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Retorno {
	public enum RetornoStatus {
		OK, ERRO, MENSAGEM
	}

	@XmlElement
	private boolean temErro;

	@XmlElement
	private List<String> msgsErro;

	public boolean isTemErro() {
		return temErro;
	}

	public void setTemErro(final boolean temErro) {
		this.temErro = temErro;
	}

	public List<String> getMsgsErro() {
		return msgsErro;
	}

	public void setMsgsErro(final List<String> msgsErro) {
		this.msgsErro = msgsErro;
	}
}
