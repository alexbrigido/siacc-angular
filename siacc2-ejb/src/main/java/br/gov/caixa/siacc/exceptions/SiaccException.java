package br.gov.caixa.siacc.exceptions;

 
public class SiaccException extends Exception {
  
	private static final long serialVersionUID = 8497337420801736297L;

	public SiaccException() {
		super();
	}

	public SiaccException(final String msg) {
		super(msg);
		
	}

	public SiaccException(final Throwable erro) {
		super(erro);
		
	}

	public SiaccException(final String msg, final Throwable erro) {
		super(msg, erro);
		
	}

}
