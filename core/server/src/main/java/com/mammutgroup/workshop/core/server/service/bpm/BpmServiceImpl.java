package com.mammutgroup.workshop.core.server.service.bpm;

import com.mammutgroup.workshop.common.core.model.dto.bpm.TaskDto;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.parent.service.BaseServiceImpl;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.bpm.api.server.api.IVaselineBpmApi;
import ir.amv.os.vaseline.bpm.api.server.model.compltask.CompleteTaskRequestServer;
import ir.amv.os.vaseline.bpm.api.server.model.compltask.CompleteTaskResponseServer;
import ir.amv.os.vaseline.bpm.api.server.model.startproc.StartProcessReqServer;
import ir.amv.os.vaseline.bpm.api.server.model.startproc.StartProcessResultServer;
import ir.amv.os.vaseline.bpm.api.shared.model.compltask.AbstractCompleteTaskRequestDto;
import ir.amv.os.vaseline.bpm.api.shared.model.startproc.AbstractStartProcessReqDto;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @author mushtu
 * @since 4/16/16.
 */
@Service
public class BpmServiceImpl extends BaseServiceImpl implements BpmService {

    @Autowired
    private IVaselineBpmApi bpmApi;


    @Override
    public CompleteTaskResponseServer completeTask(AbstractCompleteTaskRequestDto request) throws BaseVaselineServerException {

        CompleteTaskRequestServer r = convert(request,CompleteTaskRequestServer.class);
        return bpmApi.completeTask(r);
    }

    @Override
    public boolean claimTask(String taskId) throws BaseVaselineServerException {
        return bpmApi.claim(taskId);

    }

    @Override
    public List<TaskDto> candidateTasks(PagingDto pagingDto) throws BaseVaselineServerException {
        List<Task> candidates = bpmApi.getCandidateUserTaskList(pagingDto);
        return convertList(candidates,TaskDto.class);
    }

    @Override
    public List<TaskDto> assignedTasks(PagingDto pagingDto) throws BaseVaselineServerException {
        List<Task> tasks = bpmApi.getPersonalTaskList(pagingDto);
        return convertList(tasks,TaskDto.class);

    }

    @Override
    public List<TaskDto> candidateOrAssignedTasks(PagingDto pagingDto) {
        return null;
    }

    @Override
    public void deployService(String xmlName, String xmlContent) {
        bpmApi.deploy(xmlName,xmlContent);
    }

    @Override
    public void deployService(String name, InputStream stream) {
        bpmApi.deploy(name,stream);
    }

    @Override
    public StartProcessResultServer startProcess(AbstractStartProcessReqDto reqDto) throws BaseVaselineServerException {
        return bpmApi.startProcess(convert(reqDto,StartProcessReqServer.class));
    }

    @Override
    public List<String> getActiveActivityIds(String executionId) {
        return bpmApi.getActiveActivityIds(executionId);
    }

    @Override
    public Map<String, Object> getProcessVariables(String processInstanceId) {
        return bpmApi.getProcessVariables(processInstanceId);
    }

    @Override
    public Map<String, Object> getProcessVariablesByTaskId(String taskId) {
        return bpmApi.getProcessVariablesByTaskId(taskId);
    }

    @Override
    public boolean isProcessExist(String processId) {
        return bpmApi.isProcessExist(processId);
    }


}
