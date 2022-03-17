package br.gov.caixa.siacc.controller.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.gov.caixa.siacc.controller.Controller;
import br.gov.caixa.siacc.service.TipoCompromissoService;

@Path("/tipoCompromisso") 
public class TipoCompromissoRest extends Controller {

	
	@EJB
    private TipoCompromissoService tipoCompromissoService;
 	
	@GET
    @Path("findAll")
    public Response findAll() { 
		
        return  build(Status.OK, tipoCompromissoService.getAll()) ;
    }
	 
	
}
