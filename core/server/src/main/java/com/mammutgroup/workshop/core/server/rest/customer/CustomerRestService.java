package com.mammutgroup.workshop.core.server.rest.customer;

import com.mammutgroup.workshop.common.core.model.enums.VehicleServiceState;
import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.common.core.model.response.VehicleServiceResponse;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by mushtu on 4/14/16.
 */
@Path("/service")
public interface CustomerRestService {

    @Produces({MediaType.APPLICATION_JSON})
    @POST
    VehicleServiceResponse requestService(VehicleServiceRequest request) throws BaseVaselineServerException;

    @Produces({MediaType.APPLICATION_JSON})
    @GET
    @Path("{id}")
    VehicleServiceState serviceState(@PathParam("id") String id);

}
