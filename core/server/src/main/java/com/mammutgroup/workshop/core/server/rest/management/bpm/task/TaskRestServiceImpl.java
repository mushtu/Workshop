package com.mammutgroup.workshop.core.server.rest.management.bpm.task;

import com.mammutgroup.workshop.common.core.model.dto.bpm.TaskDto;
import com.mammutgroup.workshop.core.server.service.bpm.BpmService;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.bpm.api.server.api.IVaselineBpmApi;
import ir.amv.os.vaseline.bpm.api.shared.model.compltask.CompleteTaskRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.PathParam;
import java.util.List;

/**
 * @author mushtu
 * @since 4/16/16.
 */
@Service
public class TaskRestServiceImpl implements TaskRestService {

    @Autowired
    private BpmService bpmService;


    @Override
    public List<TaskDto> getUserAssignedTasks(PagingDto pagingDto) throws BaseVaselineServerException {

        return bpmService.assignedTasks(pagingDto);
    }

    @Override
    public List<TaskDto> getUserCandidateTasks(PagingDto pagingDto) throws BaseVaselineServerException {
        return bpmService.candidateTasks(pagingDto);
    }


    @Override
    public void completeTask(CompleteTaskRequestDto request) throws BaseVaselineServerException {
        bpmService.completeTask(request);
    }

    @Override
    public void claimTask(@PathParam("taskId") String taskId) throws BaseVaselineServerException {
        bpmService.claimTask(taskId);
    }
}
