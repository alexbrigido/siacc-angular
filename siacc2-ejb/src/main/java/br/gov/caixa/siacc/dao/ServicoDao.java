package br.gov.caixa.siacc.dao;

import javax.ejb.Local;
import javax.ejb.Stateful;

import br.gov.caixa.siacc.model.ServicoModel;

@Stateful
@Local
public class ServicoDao extends AbstractDao<ServicoModel> {

	private static final long serialVersionUID = -7859658914775734294L;

	ServicoDao() {
		super(ServicoModel.class);
	}
  

}
