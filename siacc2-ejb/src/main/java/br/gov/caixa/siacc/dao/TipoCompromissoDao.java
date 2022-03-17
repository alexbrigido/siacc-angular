package br.gov.caixa.siacc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.gov.caixa.siacc.model.TipoCompromissoModel;
 

@Stateful
@Local
public class TipoCompromissoDao extends AbstractDao<TipoCompromissoModel> {
 
	private static final long serialVersionUID = 1121969629715189553L;
	
	TipoCompromissoDao() {
		super(TipoCompromissoModel.class);
	}
	 
	public  List<TipoCompromissoModel> getTipoCompromisso(){
		final StringBuilder jpql = new StringBuilder();
		final List<TipoCompromissoModel> lista =  new ArrayList<TipoCompromissoModel>(); 
		
		
		try {
			
			jpql.append(" Select tc  ");
			jpql.append(" from TipoCompromissoModel tc ");
			jpql.append(" where tc.inicioValidade <= current_date ");
			jpql.append(" and (tc.fimValidade >= current_date or tc.fimValidade ='01.01.0001' )"); 

			final Query q =  this.getEntityManager().createQuery(jpql.toString());
			lista.addAll(q.getResultList());
		} catch (final NoResultException ex) {
			return null;
		}
		
		try {
			
			jpql.setLength(0);
			jpql.append(" Select tc   ");
			jpql.append(" from TipoCompromissoModel tc ");
			jpql.append(" where tc.inicioValidade > current_date ");
			jpql.append(" and (tc.fimValidade < current_date or tc.fimValidade <> '01.01.0001' )");
						
			final Query q =  this.getEntityManager().createQuery(jpql.toString());
			lista.addAll(q.getResultList());
		} catch (final NoResultException ex) {
			return null;
		}
				
		
		return lista; 
	}
 
}
