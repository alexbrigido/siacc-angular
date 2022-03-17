package br.gov.caixa.siacc.controller;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import br.gov.caixa.siacc.interceptor.SegurancaInter;

@SegurancaInter
@RequestScoped
@ManagedBean
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Controller {

	public Response build(final StatusType status, final Object object) {
		return Response.status(status).entity(object).header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "Origin, X-Request-Width, Content-Type, Accept")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")
				.header("Access-Control-Max-Age", "1209600")
				.header("Cache-Control", "no-cache, no-store, must-revalidate").header("Expires", 0)
				.header("Pragma", "no-cache").header("X-Frame-Options", "DENY").header("X-XSS-Protection", "1").build();
	}

}
