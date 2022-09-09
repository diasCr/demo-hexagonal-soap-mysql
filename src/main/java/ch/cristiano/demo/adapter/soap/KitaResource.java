/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.adapter.soap;

import java.net.URI;
import java.net.URISyntaxException;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ch.cristiano.demo1.application.rest.dto.ChildDto;
import ch.cristiano.demo1.application.rest.dto.ChildDtoIn;
import ch.cristiano.demo1.application.rest.dto.FamilyDto;
import ch.cristiano.demo1.domain.model.Child;
import ch.cristiano.demo1.domain.port.in.ChildService;
import ch.cristiano.demo1.domain.port.in.FamilyService;

/**
 * REST adapter for KitaApp.
 */
@Path("/")
public class KitaResource {

    @Inject
    private ChildService childService;

    @Inject
    private FamilyService familyService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/childs/{lastname}")
    public Response getChildByLastName(@PathParam("lastname") String lastName) {
        Child child = childService.getByLastName(lastName);
        return Response.ok().entity(new ChildDto().ofDomain(child)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/childs")
    public Response createChild(ChildDtoIn childDtoIn) {
        try {
            childService.createChild(childDtoIn.toDomain());
            return Response.created(new URI("")).build();
        } catch (URISyntaxException exception) {
            return Response.ok().build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/families")
    public Response register(FamilyDto familyDto) {
        try {
            familyService.createFamily(null, null);
            return Response.created(new URI("")).build();
        } catch (URISyntaxException exception) {
            return Response.ok().build();
        }
    }
}
