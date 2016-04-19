package com.mammutgroup.workshop.core.server.rest.customer;

import com.mammutgroup.workshop.common.core.model.enums.VehicleServiceState;
import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.common.core.model.response.VehicleServiceResponse;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.ws.rest.server.base.parent.IBaseRestService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by mushtu on 4/14/16.
 */
@Path("/request")
public interface CustomerRestService extends IBaseRestService {

    @Produces({MediaType.APPLICATION_JSON})
    @POST
    VehicleServiceResponse requestService(VehicleServiceRequest request) throws BaseVaselineServerException;

    @Produces({MediaType.APPLICATION_JSON})
    @GET
    @Path("/{id}")
    VehicleServiceState serviceState(@PathParam("id") String id);

}
