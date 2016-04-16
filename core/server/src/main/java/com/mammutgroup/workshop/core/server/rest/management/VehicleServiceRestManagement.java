package com.mammutgroup.workshop.core.server.rest.management;

import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.ws.rest.server.base.parent.IBaseRestService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Vehicle Service Management API
 * @author mushtu
 * @since 4/10/16.
 */

@Path("/services")
public interface VehicleServiceRestManagement extends IBaseRestService {

//
//    /**
//     * starts a vehicle service process
//     *
//     * @return
//     */
//    @Path("/request")
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    void startService(VehicleServiceRequest request);

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    List<ServiceDto> getServices() throws BaseVaselineClientException;



}
