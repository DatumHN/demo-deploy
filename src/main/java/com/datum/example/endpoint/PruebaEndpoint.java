package com.datum.example.endpoint;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Component;

import com.datum.example.pojo.Prueba;

/**
 * Endpoint de prueba
 * @author Melvin Cruz
 * @version 1.0
 * @param sumando1
 * @param sumando2
 */

@Path("/prueba")
@Component
public class PruebaEndpoint {
	@GET
    @Produces("application/json")
    public Prueba prueba(@QueryParam("sumando1") @DefaultValue("0") int sumando1, @QueryParam("sumando2") @DefaultValue("0") int sumando2) {
        return new Prueba(sumando1, sumando2);
    }

}