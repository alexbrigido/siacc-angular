package br.gov.caixa.siacc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import org.hibernate.exception.SQLGrammarException;

import br.gov.caixa.siacc.model.PacoteServicoModel;
import br.gov.caixa.siacc.vo.PacoteServicoContratavelVo;

@Stateful
@Local
public class PacoteServicoDao extends AbstractDao<PacoteServicoModel> {

	private static final long serialVersionUID = 1121969629715189553L;

	PacoteServicoDao() {
		super(PacoteServicoModel.class);
	}

	public List<PacoteServicoModel> getPacoteTipoCompromisso(int nuTipoCompromisso) {
		final StringBuilder jpql = new StringBuilder();
		final List<PacoteServicoModel> lista = new ArrayList<PacoteServicoModel>();

		try {

			jpql.append(" Select distinct tc  ");
			jpql.append(" from PacoteServicoContratavelModel psc ");
			jpql.append("  join psc.pacoteServico tc  ");
			jpql.append(" where   ");
			jpql.append("   psc.nuTipoCompromisso= :nuTipoCompromisso ");
			jpql.append("  and  ((tc.fimVigencia >= current_date) or tc.fimVigencia ='01.01.0001' )");

			final Query q = this.getEntityManager().createQuery(jpql.toString());
			q.setParameter("nuTipoCompromisso", nuTipoCompromisso);

			lista.addAll(q.getResultList());
		} catch (final NoResultException ex) {
			return null;
		}

		return lista;
	}

	public List<PacoteServicoContratavelVo> getPacoteListAll() {
		final StringBuilder jpql = new StringBuilder();
		final List<PacoteServicoContratavelVo> lista = new ArrayList<PacoteServicoContratavelVo>();

		try {

			jpql.append("Select distinct new br.gov.caixa.siacc.vo.PacoteServicoContratavelVo");
			jpql.append(" 	(ps.nuPacote, ps.nomePacote, ps.inicioVigencia, tc.nuTipoCompromisso , tc.nomeTipoCompromisso) ");
			jpql.append(" from PacoteServicoContratavelModel psc ");
			jpql.append("  join psc.pacoteServico ps  ");
			jpql.append("  join psc.servicoContratavel.tipoCompromisso tc  ");
			jpql.append(" where   ");
			jpql.append(" ((ps.fimVigencia >= current_date) or ps.fimVigencia ='01.01.0001' )");

			final Query q = this.getEntityManager().createQuery(jpql.toString()); 
			lista.addAll(q.getResultList());
			
		} catch (final NoResultException ex) {
			return null;
		} catch (NonUniqueResultException e) {
			return null;
		} catch (final SQLGrammarException ex) {
			return null;
		} catch (final Exception ex) {
			return null; 
		}

		return lista;
	}

}
