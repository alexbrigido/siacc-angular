package br.gov.caixa.siacc.service;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.gov.caixa.siacc.dao.PacoteServicoDao;
import br.gov.caixa.siacc.retorno.ListaRetorno;
import br.gov.caixa.siacc.retorno.Retorno;

@Stateless
@Local
public class PacoteServicoService  {
  
	
	public PacoteServicoService() {
		super();
	}
	
	@Inject 
	private PacoteServicoDao pacoteServico;
	
	public Retorno getPacoteTipoCompromisso(int idTipoCompromisso){  
		final ListaRetorno<Object> retorno = new ListaRetorno<>();
		
		   retorno.getData().add(pacoteServico.getPacoteTipoCompromisso(idTipoCompromisso)); 
		   
		   return  retorno;
	}
 
}
