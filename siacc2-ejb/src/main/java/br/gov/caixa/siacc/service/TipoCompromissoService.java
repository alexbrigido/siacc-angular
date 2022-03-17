package br.gov.caixa.siacc.service;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.gov.caixa.siacc.dao.TipoCompromissoDao;
import br.gov.caixa.siacc.retorno.ListaRetorno;
import br.gov.caixa.siacc.retorno.Retorno;

@Stateless
@Local
public class TipoCompromissoService { 
	
	public TipoCompromissoService() {
		super();
	}

	@Inject
	private TipoCompromissoDao TipoCompromissoDao;

	public Retorno getAll() {
		final ListaRetorno<Object> retorno = new ListaRetorno<>();

		retorno.getData().add(TipoCompromissoDao.getTipoCompromisso());

		return retorno;
	}

}
