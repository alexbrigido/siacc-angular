package br.gov.caixa.siacc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import org.hibernate.exception.SQLGrammarException;

import br.gov.caixa.siacc.exceptions.SiaccException;
import br.gov.caixa.siacc.model.CategoriaModel;
import br.gov.caixa.siacc.model.ServicoContratavelModel;
import br.gov.caixa.siacc.vo.ServicoVo;
 

@Stateful
@Local
public class ServicoContratavelDao extends AbstractDao<ServicoContratavelModel> {
 
	private static final long serialVersionUID = 1121969629715189553L;
	
	ServicoContratavelDao() {
		super(ServicoContratavelModel.class);
	}
	public List<CategoriaModel> getServicoContratavelCategoria(int nuTipoCompromisso) throws SiaccException {
		final StringBuilder jpql = new StringBuilder();  
		final List<CategoriaModel> lista = new ArrayList<CategoriaModel>();
		try {

			jpql.append(" Select distinct ct  ");
			jpql.append(" from ServicoContratavelModel psc "); 
			jpql.append("  join psc.categoria ct  "); 
			jpql.append(" where   ");
			jpql.append("   psc.nuTipoCompromisso= :nuTipoCompromisso "); 
			jpql.append("  and  (psc.inicioVigencia <= current_date) "); 
			jpql.append("  and  ((psc.fimVigencia >= current_date) or psc.fimVigencia ='01.01.0001' )"); 
 
			final Query q = this.getEntityManager().createQuery(jpql.toString() );
			q.setParameter("nuTipoCompromisso", nuTipoCompromisso);
			
			lista.addAll(q.getResultList());
			
		} catch (final NoResultException e) {
			throw new SiaccException(e);
		} catch (NonUniqueResultException e) {
			throw new SiaccException(e);
		} catch (final SQLGrammarException e) { 
			throw new SiaccException(e);
		} catch (final Exception e) {
			throw new SiaccException(e);
		}
		 return lista;
		
	}
	
	public List<ServicoVo> getServicoContratavelServico(int nuTipoCompromisso, int nuCategoria, int nuPacote) {
		final StringBuilder jpql = new StringBuilder(); 

		try {

			jpql.append(" Select distinct new br.gov.caixa.siacc.vo.ServicoVo(sv.nuServico, sv.nuCategoria, sv.vrCusto, ");
			jpql.append(" 	sv.vrReceita, sv.icTarifa,sv.deServicoReduzido, sv.deServico,   ");
			jpql.append(" COALESCE(( select 1 from PacoteServicoContratavelModel pcs   ");
			jpql.append("  		where pcs.nuServico = sc.nuServico   ");
			jpql.append("  		and pcs.nuCategoria = sc.nuCategoria   ");
			jpql.append("  		and pcs.nuTipoCompromisso = sc.nuTipoCompromisso   ");
			jpql.append("  		and pcs.inicioVigencia = sc.inicioVigencia   ");
			jpql.append("  		and pcs.nuPacote =:nuPacote  ),0) ");
			jpql.append("  	) ");
			jpql.append(" from ServicoContratavelModel sc ");
			jpql.append("  join sc.servico sv  ");
			jpql.append(" where   ");
			jpql.append("   sc.nuTipoCompromisso= :nuTipoCompromisso ");
			jpql.append("  and  sc.nuCategoria= :nuCategoria ");
			jpql.append("  and  ((sc.fimVigencia >= current_date) or sc.fimVigencia ='01.01.0001' )");

			final Query q = this.getEntityManager().createQuery(jpql.toString());
			q.setParameter("nuTipoCompromisso", nuTipoCompromisso);
			q.setParameter("nuCategoria", nuCategoria);
			q.setParameter("nuPacote", nuPacote);

			return q.getResultList();
		} catch (final NoResultException ex) {
			return null;
		}  
	}
	
	
 
}
