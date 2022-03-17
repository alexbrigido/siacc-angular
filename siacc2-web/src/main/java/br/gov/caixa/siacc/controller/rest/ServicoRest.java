package br.gov.caixa.siacc.controller.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import br.gov.caixa.siacc.controller.Controller;
import br.gov.caixa.siacc.service.ServicoService;

@Path("/servico")
public class ServicoRest extends Controller {

	@EJB
	private ServicoService servicoService;

	/*@GET
	@Path("/{nutipocompromisso}/{nupacote}")
	public Response getServicoPacote(@PathParam("nutipocompromisso") int nuTipoCompromisso, @PathParam("nupacote") int nupacote) throws SiaccException {
		return build(Status.OK, servicoService.getServico (nuTipoCompromisso,nupacote));
	}
*/
}
