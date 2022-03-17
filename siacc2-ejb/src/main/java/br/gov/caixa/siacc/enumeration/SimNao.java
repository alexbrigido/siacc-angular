package br.gov.caixa.siacc.enumeration;

public enum SimNao {
	S("Sim"), N("Não");

	private String valor;
 
	
	private SimNao(String valor) {
		this.valor = valor;
	}
 
	public String getValor() {
		return valor ;
	}
}
