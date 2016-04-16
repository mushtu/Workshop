package com.mammutgroup.workshop.core.server.rest.management.bpm.task;

import com.mammutgroup.workshop.common.core.model.dto.bpm.TaskDto;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.bpm.api.shared.model.compltask.CompleteTaskRequestDto;
import ir.amv.os.vaseline.ws.rest.server.base.parent.IBaseRestService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author mushtu
 * @since 4/16/16.
 */
@Path("/tasks")
public interface TaskRestService extends IBaseRestService {


    @Path("/assigned")
    @Produces({MediaType.APPLICATION_JSON})
    @GET
    List<TaskDto> getUserAssignedTasks(PagingDto pagingDto) throws BaseVaselineServerException;

    @Path("/candidates")
    @Produces({MediaType.APPLICATION_JSON})
    @GET
    List<TaskDto> getUserCandidateTasks(PagingDto pagingDto) throws BaseVaselineServerException;

    @Path("/completeTask")
    @PUT
    void completeTask(CompleteTaskRequestDto request) throws BaseVaselineServerException;

    @Path("/{taskId}/claimTask")
    @PUT
    void claimTask(@PathParam("taskId") String taskId) throws BaseVaselineServerException;



}
