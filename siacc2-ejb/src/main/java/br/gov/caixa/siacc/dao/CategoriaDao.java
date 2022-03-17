package br.gov.caixa.siacc.dao;

import javax.ejb.Local;
import javax.ejb.Stateful;

import br.gov.caixa.siacc.model.CategoriaModel;

@Stateful
@Local
public class CategoriaDao extends AbstractDao<CategoriaModel>{
  
	private static final long serialVersionUID = 455851955608512026L;

	CategoriaDao() {
		super(CategoriaModel.class);
	}
 
	
}
