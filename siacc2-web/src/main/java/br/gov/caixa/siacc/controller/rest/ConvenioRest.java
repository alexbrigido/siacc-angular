package br.gov.caixa.siacc.controller.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.gov.caixa.siacc.controller.Controller;
import br.gov.caixa.siacc.service.ConvenioService;
import br.gov.caixa.siacc.vo.TipoPessoa;

@Path("/convenio")
public class ConvenioRest extends Controller {

	@EJB
	private ConvenioService convenioService;
	
	
	@GET
    @Path("findAll")
    public Response findAll() {  
        return  build(Status.OK, convenioService.getConvenioAll()) ;
    }
 
	@POST 
	@Path("/consulta")
    public Response consultaConvenio(final TipoPessoa tipoPessoa) { 
		String cpfCnpj ="";
		
        return  build(Status.OK, convenioService.getConvenio(tipoPessoa)) ;
    }
 
}
