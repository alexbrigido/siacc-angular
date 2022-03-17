package br.gov.caixa.siacc.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.gov.caixa.siacc.model.PacoteServicoContratavelModel;
import br.gov.caixa.siacc.vo.ServicoVo;

@Stateful
@Local
public class PacoteServicoContratavelDao extends AbstractDao<PacoteServicoContratavelModel> {

	private static final long serialVersionUID = -7859658914775734294L;

	PacoteServicoContratavelDao() {
		super(PacoteServicoContratavelModel.class);
	}
  
	public List<ServicoVo> getServicoContratavelTarifia(int nuTipoCompromisso, int nuPacote) {
		final StringBuilder jpql = new StringBuilder(); 

		try {

			jpql.append(" Select distinct new br.gov.caixa.siacc.vo.ServicoVo(s.nuServico, s.nuCategoria, s.vrCusto, ");
			jpql.append("  s.vrReceita, s.icTarifa, s.deServicoReduzido, s.deServico, "); 
			jpql.append("  psc.vrTarifaContratada, psc.pcDescontoUtilizado, psc.icContratacaoTarifa )");
			jpql.append(" from PacoteServicoContratavelModel psc ");
			jpql.append("  	join psc.servicoContratavel cs  ");
			jpql.append("  	join cs.servico s  ");
			jpql.append(" where ");
			jpql.append("   psc.nuTipoCompromisso= :nuTipoCompromisso ");
			jpql.append("  and psc.nuPacote= :nuPacote "); 
			jpql.append("  and psc.nuCategoria in (1,21)");
			jpql.append("  and (psc.vrTarifaContratada + psc.pcDescontoUtilizado) > 0 "); 

			final Query q = this.getEntityManager().createQuery(jpql.toString());
			q.setParameter("nuTipoCompromisso", nuTipoCompromisso); 
			q.setParameter("nuPacote", nuPacote);

			return q.getResultList();
			
		} catch (final NoResultException ex) {
			return null;
		}  
	}
}
