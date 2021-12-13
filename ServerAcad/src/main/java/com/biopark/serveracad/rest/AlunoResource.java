package com.biopark.serveracad.rest;

import com.biopark.serveracad.dao.AlunoDao;
import com.biopark.serveracad.model.Aluno;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ifta
 */

@Path("/aluno")
@RequestScoped
public class AlunoResource {
    
    @Inject
    private AlunoDao alunoDao;
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Aluno findById(@PathParam("id") long id){
        return alunoDao.findById(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(Aluno aluno){
        alunoDao.add(aluno);
    }
}
