package br.gov.caixa.siacc.controller.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.gov.caixa.siacc.controller.Controller;
import br.gov.caixa.siacc.exceptions.SiaccException;
import br.gov.caixa.siacc.service.ServicoContratavelService;
import br.gov.caixa.siacc.service.ServicoService;
import br.gov.caixa.siacc.service.TipoCompromissoService;

@Path("/pacote")
public class PacoteRest extends Controller {

	@EJB
	private TipoCompromissoService tipoCompromissoService;

	@EJB
	private ServicoContratavelService pacoteServicoService;

	@EJB
	private ServicoService servicoService;

	@GET
	@Path("listar")
	public Response listarPacote() {

		return build(Status.OK, pacoteServicoService.getPacoteListAll());
	}

	@GET
	@Path("/pacoteTipoCompromisso/{nutipocompromisso}")
	public Response pacoteTipoCompromisso(@PathParam("nutipocompromisso") int nuTipoCompromisso) {
		return build(Status.OK, pacoteServicoService.getPacoteTipoCompromisso(nuTipoCompromisso));
	}

	@GET
	@Path("/{nutipocompromisso}/{nupacote}")
	public Response getServicoPacote(@PathParam("nutipocompromisso") int nuTipoCompromisso,
			@PathParam("nupacote") int nupacote) throws SiaccException {
		return build(Status.OK, servicoService.getServico(nuTipoCompromisso, nupacote));
	}

	@GET
	@Path("/pacoteservicotarifa/{nutipocompromisso}/{nupacote}")
	public Response categoria(@PathParam("nutipocompromisso") int nuTipoCompromisso, @PathParam("nupacote") int nuPacote) {
		return build(Status.OK, pacoteServicoService.getPacoteServicoContratavel(nuTipoCompromisso, nuPacote));
	}

}
