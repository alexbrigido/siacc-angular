package br.gov.caixa.siacc.service;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.gov.caixa.siacc.dao.PacoteServicoContratavelDao;
import br.gov.caixa.siacc.dao.PacoteServicoDao;
import br.gov.caixa.siacc.retorno.ListaRetorno;
import br.gov.caixa.siacc.retorno.Retorno;

@Stateless
@Local
public class ServicoContratavelService {

	public ServicoContratavelService() {
		super();
	}

	@Inject
	private PacoteServicoDao pacoteServico;
	
	@Inject
	private PacoteServicoContratavelDao pacoteServicoContratavel;

	public Retorno getPacoteTipoCompromisso(int nuTipoCompromisso) {
		final ListaRetorno<Object> retorno = new ListaRetorno<>();
		retorno.getData().add(pacoteServico.getPacoteTipoCompromisso(nuTipoCompromisso));
		return retorno;
	}

	public Retorno getPacoteListAll() {
		final ListaRetorno<Object> retorno = new ListaRetorno<>();
		retorno.getData().add(pacoteServico.getPacoteListAll());
		return retorno;
	}
	
	public Retorno getPacoteServicoContratavel(int nuTipoCompromisso, int nuPacote) {
		final ListaRetorno<Object> retorno = new ListaRetorno<>();
		retorno.getData().add(pacoteServicoContratavel.getServicoContratavelTarifia(nuTipoCompromisso, nuPacote));
		return retorno;
	}
	
	

}
