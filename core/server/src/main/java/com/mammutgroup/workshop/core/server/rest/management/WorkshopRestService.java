package com.mammutgroup.workshop.core.server.rest.management;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopDto;
import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.common.core.model.request.CompleteVehicleServiceResourceAssignmentTask;
import com.mammutgroup.workshop.common.core.model.request.CompleteVehicleServiceTask;
import com.mammutgroup.workshop.core.server.rest.RepositoryRestService;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Path("/workshops")
public interface WorkshopRestService extends RepositoryRestService<WorkshopDto,Long> {

    @POST
    @Path("/resourceAssignment")
    void completeVehicleServiceResourceAssignmentTask(CompleteVehicleServiceResourceAssignmentTask cmpTask) throws BaseVaselineClientException, BaseVaselineServerException;

    @POST
    @Path("/complete-service")
    void completeVehicleServiceTask(CompleteVehicleServiceTask cmpTask) throws BaseVaselineClientException;

}
