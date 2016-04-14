package com.mammutgroup.workshop.core.server.ws.rest.management;

import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import ir.amv.os.vaseline.ws.rest.server.base.parent.IBaseRestService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Vehicle Service Management API
 * An Api for starting a vehicle service process(or flow)
 * @author mushtu
 * @since 4/10/16.
 */

public interface VehicleServiceManagement extends IBaseRestService {


    /**
     * starts a vehicle service process
     *
     * @return
     */
    @Path("/")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    Response startService(VehicleServiceRequest request);

    @Path("/lines")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    Response getServiceLines();

    /**
     * claims a vehicle service process
     *
     * @return
     */
    Response claimService();


}
