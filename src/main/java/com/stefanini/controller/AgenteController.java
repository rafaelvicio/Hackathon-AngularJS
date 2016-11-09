package com.stefanini.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.model.Agente;
import com.stefanini.model.Tipo;
import com.stefanini.service.TipoService;

@Path("/agente")
@RequestScoped
public class AgenteController {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Agente> get() {
List<Agente> listaAgentes = new ArrayList<Agente>();
    	
    	Agente agente1 = new Agente();
    	Agente agente2 = new Agente();
    	
    	agente1.setId(1);
    	agente1.setNome("Rafael");
    	
    	agente2.setId(2);
    	agente2.setNome("Filype");
    	
    	listaAgentes.add(agente1);
    	listaAgentes.add(agente1);
    	
        return listaAgentes;
      
    }

}
