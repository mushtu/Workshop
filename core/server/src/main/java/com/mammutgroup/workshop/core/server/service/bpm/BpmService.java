package com.mammutgroup.workshop.core.server.service.bpm;

import com.mammutgroup.workshop.common.core.model.dto.bpm.TaskDto;
import ir.amv.os.vaseline.base.architecture.server.layers.parent.service.IBaseService;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.bpm.api.server.model.compltask.CompleteTaskResponseServer;
import ir.amv.os.vaseline.bpm.api.server.model.startproc.StartProcessResultServer;
import ir.amv.os.vaseline.bpm.api.shared.model.compltask.CompleteTaskRequestDto;
import ir.amv.os.vaseline.bpm.api.shared.model.startproc.AbstractStartProcessReqDto;


import java.io.InputStream;
import java.util.List;

/**
 * @author mushtu
 * @since 4/16/16.
 */

public interface BpmService extends IBaseService{

    CompleteTaskResponseServer completeTask(CompleteTaskRequestDto request) throws BaseVaselineServerException;

    boolean claimTask(String taskId) throws BaseVaselineServerException;

    List<TaskDto> candidateTasks(PagingDto pagingDto) throws BaseVaselineServerException;

    List<TaskDto> assignedTasks(PagingDto pagingDto) throws BaseVaselineServerException;

    List<TaskDto> candidateOrAssignedTasks(PagingDto pagingDto);

    void deployService(String xmlName,String xmlContent);

    void deployService(String name, InputStream stream);

    StartProcessResultServer startProcess(AbstractStartProcessReqDto reqDto) throws BaseVaselineServerException;


}
