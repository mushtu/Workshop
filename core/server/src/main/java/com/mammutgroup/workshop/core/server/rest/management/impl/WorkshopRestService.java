package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.common.core.model.dto.WorkshopDto;
import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.common.core.model.request.CompleteVehicleServiceResourceAssignmentTask;
import com.mammutgroup.workshop.common.core.model.request.CompleteVehicleServiceTask;
import com.mammutgroup.workshop.core.server.service.bpm.BpmService;
import com.mammutgroup.workshop.core.server.service.management.ServiceManagementService;
import com.mammutgroup.workshop.core.server.service.management.WorkshopService;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class WorkshopRestService extends BaseCrudRestServiceImpl<WorkshopDto, Long, WorkshopService>
        implements com.mammutgroup.workshop.core.server.rest.management.WorkshopRestService {


    @Autowired
    private ServiceManagementService service;
    @Autowired
    private BpmService bpmService;


    @Override
    public void completeVehicleServiceResourceAssignmentTask(CompleteVehicleServiceResourceAssignmentTask cmpTask) throws BaseVaselineClientException, BaseVaselineServerException {

        Map<String,Object> vars = bpmService.getProcessVariablesByTaskId(cmpTask.getTaskId());
        WorkshopServiceDto workshopServiceDto = (WorkshopServiceDto) vars.get("service");
        //EmployeeDto employeeDto = (EmployeeDto) vars.get("employee");
        ServiceDto serviceDto = new ServiceDto();
        serviceDto.setVehicleService(workshopServiceDto);
        serviceDto.setStartDate(new Date().getTime());
        serviceDto.setLine(cmpTask.getLine());
        this.service.save(serviceDto);
        bpmService.completeTask(cmpTask);

    }

    @Override
    public void completeVehicleServiceTask(CompleteVehicleServiceTask cmpTask) throws BaseVaselineClientException {
        Map<String,Object> vars = bpmService.getProcessVariablesByTaskId(cmpTask.getTaskId());
        LineDto lineDto = (LineDto) vars.get("line");
        ServiceDto serviceDto = new ServiceDto();
        serviceDto.setLine(lineDto);
        List<ServiceDto> serviceDtoList = service.searchByExample(serviceDto);
        //todo
    }

}
