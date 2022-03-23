package br.gov.caixa.siacc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.gov.caixa.siacc.model.ConvenioModel;
import br.gov.caixa.siacc.vo.ConvenioVo;
import br.gov.caixa.siacc.vo.TipoPessoa;

@Stateful
@Local
public class ConvenioDao extends AbstractDao<ConvenioModel>{
  
	private static final long serialVersionUID = 455851955608512026L;

	ConvenioDao() {
		super(ConvenioModel.class);
	}
 
	public  List<ConvenioModel> getConvenioAll(){
		final StringBuilder jpql = new StringBuilder();
		final List<ConvenioModel> lista =  new ArrayList<ConvenioModel>(); 
		
		
		try {
			
			  jpql.append(" select ");
			  jpql.append(" TB30w1.NU_CONVENIO,TB30w1.NO_CONVENIO , TB30w1.NO_LOGRADOURO,TB30w1.NU_LOCAL  , ");
			  jpql.append(" TB30w1.NO_COMPLEMENTO,TB30w1.NO_BAIRRO, TB30w1.NO_CIDADE,TB30w1.NO_UF,TB30w1.NU_CEP,TB30w1.NU_TELEFONE,TB30w1.DT_INCLUSAO  , ");
			  jpql.append(" TB30w1.DT_INICIO_VIGENCIA,TB30w1.DT_FIM_VIGENCIA  , TB30w1.NU_CGC_BASICO,TB30w1.NU_CGC_ORDEM,TB30w1.NU_CGC_DV, NU_CPF  ,TB30w1.NU_CPF_DV ,TB30w1.NU_CGC_UNIDADE  , ");
			  jpql.append(" TB30w1.IC_TIPO_EMPRESA ,TB30w1.IC_EMPRSA_COLIGADA  ,TB30w1.CO_SGMNTO_EMPRSA,TB30w1.IC_CONTA_UNICA  , ");
			  jpql.append(" TB30w1.NU_CGC_CTA_CNVNO ,TB30w1.CO_PRDTO_CTA_CNVNO  ,TB30w1.NU_CONTA_CONVENIO ,TB30w1.IC_REGRA_LNCMO  , ");
			  jpql.append(" TB30w1.IC_FORMA_LNCMO ,TB30w1.IC_FRMLZCO_CNTRTO  ,TB30w1.IC_PRCTO_CNTRZADO ,TB30w1.IC_CDSTO_COMPLETO  , ");
			  jpql.append(" TB30w1.NU_ULTIMO_AGNDO ,TB30w1.IC_FRMA_ENVO_CBRNA  ,TB30w1.IC_FORMA_DEBITO ,TB30w1.IC_FORMA_CREDITO  , ");
			  jpql.append(" TB30w1.IC_PORTE ,TB30w1.IC_NATUREZA_CNVNE  ,TB30w1.IC_SEGURADORA ,TB30w1.IC_REGRA_GOVERNO  , ");
			  jpql.append(" TB30w1.IC_ORGM_CNTA_CNVNO ,TB30w1.NU_CONTA_NSGD  ,TB30w1.NU_PRODUTO  ,TB30w1.IC_RETORNO_CONTA  , ");
			  jpql.append(" TB30w1.VR_FTRMO_ANUAL  ,TB30w1.IC_VLDCO_CNTA  ,TB30w1.IC_CNPJ_PAGADOR  ,TB30w1.NU_CNAE, IC_IOF  ");
			  jpql.append(" from ");
			  jpql.append("     ( select ");
			  jpql.append("         w.*  ");
			  jpql.append("         from ");
			  jpql.append("         ( select  dense_rank() OVER (ORDER BY TB30.dt_inclusao desc, TB30.NU_CONVENIO) as rownumber , ");
			  jpql.append("             TB30.*   ");
			  jpql.append("         from ");
			  jpql.append("             SIACC.ACCXTB30CONVENIO TB30  ");
			  jpql.append("         order by ");
			  jpql.append("            TB30.dt_inclusao desc, TB30.NU_CONVENIO fetch first 1000 rows only ) as w ) as TB30w1  ");
			  jpql.append("     where ");
			  jpql.append("         rownumber > 0  ");
			  jpql.append("     order by ");
			  jpql.append("         rownumber ");
			     

			final Query q =  this.getEntityManager().createNativeQuery(jpql.toString(), ConvenioModel.class);           
			
			/*jpql.append(" Select cv  ");
			jpql.append(" from ConvenioModel cv "); 
			jpql.append("  order by cv.nuConvenio "); 
			// q.setFirstResult(0);
		     q.setMaxResults(1000);*/
		      
			lista.addAll(q.getResultList());
		} catch (final NoResultException ex) {
			return null;
		}
		
	 
				
		
		return lista; 
	}
	

	public  ConvenioModel getConvenio(TipoPessoa tipoPessoa){
		final StringBuilder jpql = new StringBuilder(); 
		try { 
			            
			 jpql.append(" Select cv  ");
			 jpql.append(" from ConvenioModel cv "); 
			 jpql.append("  where "); 
			 
			 if (tipoPessoa.getIdTipoPessoa().equals("0") && tipoPessoa.getSiglaTipoPessoa().equals("F") ){
				 jpql.append("  cv.nuCpf=:nuCpf"); 
				 jpql.append(" and  cv.nuCpfDv=:nuCpfDv"); 
			 }else{
				 jpql.append("  cv.nuCgcBasico=:nuCgcBasico"); 
				 jpql.append(" and  cv.nuCgcOrdem=:nuCgcOrdem"); 
				 jpql.append(" and  cv.nuCgcDv=:nuCgcDv"); 
			 }
			 
			 jpql.append("  order by cv.nuConvenio desc ");  
			 
			final Query q =  this.getEntityManager().createQuery(jpql.toString()); 
			
			 if (tipoPessoa.getIdTipoPessoa().equals("0") && tipoPessoa.getSiglaTipoPessoa().equals("F") ){
				 q.setParameter("nuCpf", Integer.parseInt(tipoPessoa.getNuCpfCnpjBasico()));  
				 q.setParameter("nuCpfDv", Integer.parseInt(tipoPessoa.getNuCpfCnpjDv())); 
			  
			 }else{
				 q.setParameter("nuCgcBasico", Integer.parseInt(tipoPessoa.getNuCpfCnpjBasico()));  
				 q.setParameter("nuCgcOrdem", Integer.parseInt(tipoPessoa.getNuCpfCnpjOrden()));  
				 q.setParameter("nuCgcDv", Integer.parseInt(tipoPessoa.getNuCpfCnpjDv()));   
			 } 
			
		     q.setMaxResults(1);
		      
		     return (ConvenioModel) q.getSingleResult();
		} catch (final NoResultException ex) {
			return null;
		}
		
				
	}
	
}
