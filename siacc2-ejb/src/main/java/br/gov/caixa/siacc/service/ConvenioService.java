package br.gov.caixa.siacc.service;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.gov.caixa.siacc.dao.ConvenioDao;
import br.gov.caixa.siacc.model.ConvenioModel;
import br.gov.caixa.siacc.retorno.ListaRetorno;
import br.gov.caixa.siacc.retorno.Retorno;
import br.gov.caixa.siacc.vo.ConvenioVo;
import br.gov.caixa.siacc.vo.TipoPessoa;

@Stateless
@Local
public class ConvenioService {

	@Inject 
	private ConvenioDao convenio;
	
	public ConvenioService() {
		super();
	}
 
	public Retorno getConvenioAll() {
		final ListaRetorno<Object> retorno = new ListaRetorno<>();

		retorno.getData().add(convenio.getConvenioAll());

		return retorno;
	}
	
	public Retorno getConvenio(TipoPessoa tipoPessoa) {
		final ListaRetorno<Object> retorno = new ListaRetorno<>(); 
				
		retorno.getData().add(convenio.getConvenio(tipoPessoa));

		return retorno;
	}
	  
}
