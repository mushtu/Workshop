package com.mammutgroup.workshop.core.server.rest.management;

import com.mammutgroup.workshop.common.core.model.request.CompleteVehicleServiceResourceAssignmentTask;
import com.mammutgroup.workshop.common.core.model.request.CompleteVehicleServiceTask;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.ws.rest.server.base.parent.IBaseRestService;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Vehicle Service Management API
 * @author mushtu
 * @since 4/10/16.
 */

@Path("/manage")
public interface VehicleServiceRestManagement extends IBaseRestService {

    @POST
    @Path("/resourceAssignment")
    void completeVehicleServiceResourceAssignmentTask(CompleteVehicleServiceResourceAssignmentTask cmpTask) throws BaseVaselineClientException, BaseVaselineServerException;

    @POST
    @Path("/complete")
    void completeVehicleServiceTask(CompleteVehicleServiceTask cmpTask) throws BaseVaselineClientException, BaseVaselineServerException;

}
