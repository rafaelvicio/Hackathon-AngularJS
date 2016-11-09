package com.stefanini.controller;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.model.Denunciante;
import com.stefanini.service.DenuncianteService;

@Path("/denunciantes")
@RequestScoped
public class DenuncianteController {

	
	@Inject
	private DenuncianteService denuncianteService;
	

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String salvarDenunciante(Denunciante denunciante) {
    	denuncianteService.salvar(denunciante);
    	return "Denunciante cadastrado com sucesso!";
    }
    
    @POST
    @Path("/consultar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Denunciante> consultar(Denunciante denunciante){
    	
    	return denuncianteService.consultar(denunciante);
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Denunciante> listarDenunciantes() {
    	return denuncianteService.listar();
    }
    
    @DELETE()
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String excluir(@PathParam("id") Integer id) {
    	denuncianteService.excluir(id);
    	return "Denunciante excluído com sucesso!";
    }
}
