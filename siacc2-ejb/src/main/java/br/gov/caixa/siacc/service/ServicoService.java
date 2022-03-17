package br.gov.caixa.siacc.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.gov.caixa.siacc.dao.ServicoContratavelDao;
import br.gov.caixa.siacc.exceptions.SiaccException;
import br.gov.caixa.siacc.model.CategoriaModel;
import br.gov.caixa.siacc.retorno.ListaRetorno;
import br.gov.caixa.siacc.retorno.Retorno;
import br.gov.caixa.siacc.vo.CategoriaVo;
import br.gov.caixa.siacc.vo.ServicoVo;

@Stateless
@Local
public class ServicoService  {
  
	
	public ServicoService() {
		super();
	}
	
	@Inject 
	private ServicoContratavelDao servicoContratavel;
	
	public Retorno getServico(int nuTipoCompromisso,int nupacote) throws SiaccException {
		final ListaRetorno<Object> retorno = new ListaRetorno<>();
		List<CategoriaModel> listCategoria = servicoContratavel.getServicoContratavelCategoria(nuTipoCompromisso);
		List<CategoriaVo> listCategoriaVo = new ArrayList<>();

		for (final CategoriaModel categoria : listCategoria) {
			CategoriaVo categoriaVo = new CategoriaVo();

			categoriaVo.setNuCategoria(categoria.getNuCategoria());
			categoriaVo.setDeCategoria(categoria.getDeCategoria());
			categoriaVo.setServicos(detalharServico(nuTipoCompromisso, categoria,nupacote));
			listCategoriaVo.add(categoriaVo);
		}
		retorno.getData().add(listCategoriaVo);

		return retorno;
	}

	private List<ServicoVo> detalharServico(int nuTipoCompromisso, final CategoriaModel categoria,int nupacote) {
		List<ServicoVo> Listservico = servicoContratavel.getServicoContratavelServico(nuTipoCompromisso,categoria.getNuCategoria(),nupacote);				
		List<ServicoVo> retornoServico = new ArrayList<>();
		int selecionado = 0;
		
		for (final ServicoVo servico : Listservico) {
			ServicoVo s = new ServicoVo();
			s.setDeServico(servico.getDeServico());
			s.setDeServicoReduzido(servico.getDeServicoReduzido());
			s.setIcTarifa(servico.getIcTarifa());
			s.setNuCategoria(servico.getNuCategoria());
			s.setNuServico(servico.getNuServico());
			s.setIcSelecionado(servico.getIcSelecionado());
			s.setVrCusto(servico.getVrCusto());
			s.setVrReceita(servico.getVrReceita());
			retornoServico.add(s);
			
			if (selecionado==0){
				if(servico.getIcSelecionado()){
					selecionado = 1;
				} 
			}

		}

		if (categoria.getNuCategoria() != 1) {
			retornoServico.add(adcionarNenhum(categoria.getNuCategoria(), selecionado));
		}

		return retornoServico;
	}

	private ServicoVo adcionarNenhum(int nuCategoria, int selecionado) {

		ServicoVo s = new ServicoVo();
		s.setDeServico("Nenhum");
		s.setDeServicoReduzido("Nenhum");
		s.setIcTarifa("0");
		s.setNuCategoria(nuCategoria);
		s.setNuServico(999);
		s.setIcSelecionado(selecionado==0? true: false);
		s.setVrCusto(0);
		s.setVrReceita(0);

		return s;
	}
 
}
