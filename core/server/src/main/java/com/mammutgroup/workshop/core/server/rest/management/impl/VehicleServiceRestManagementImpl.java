package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.common.core.model.request.CompleteVehicleServiceResourceAssignmentTask;
import com.mammutgroup.workshop.common.core.model.request.CompleteVehicleServiceTask;
import com.mammutgroup.workshop.core.server.rest.management.VehicleServiceRestManagement;
import com.mammutgroup.workshop.core.server.service.bpm.BpmService;
import com.mammutgroup.workshop.core.server.service.management.LineManagementService;
import com.mammutgroup.workshop.core.server.service.management.ServiceManagementService;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * Created by mushtu on 4/14/16.
 */
@Service
public class VehicleServiceRestManagementImpl implements VehicleServiceRestManagement {


    @Autowired
    private LineManagementService lineManagementService;
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

        LineDto lineDto = lineManagementService.getById(cmpTask.getLine().getId());
        if(lineDto != null)
        {
            //save new service
            serviceDto.setLine(lineDto);
            Long id = this.service.save(serviceDto);
            serviceDto.setId(id);
            lineDto.setCurrentService(serviceDto);
            // save line
            //lineManagementService.update(lineDto);
            cmpTask.setLine(lineDto);
            bpmService.completeTask(cmpTask);
        }

    }

    @Override
    public void completeVehicleServiceTask(CompleteVehicleServiceTask cmpTask) throws BaseVaselineClientException, BaseVaselineServerException {
        Map<String,Object> vars = bpmService.getProcessVariablesByTaskId(cmpTask.getTaskId());
        LineDto lineDto = (LineDto) vars.get("line");
        ServiceDto serviceDto = lineDto.getCurrentService();
        if(serviceDto != null)
        {
            serviceDto.setEndDate(new Date().getTime());
            //lineDto.setCurrentService(null);
            //lineManagementService.update(lineDto);
            service.update(serviceDto);
            bpmService.completeTask(cmpTask);
        }
        //List<ServiceDto> serviceDtoList = service.searchByExample(serviceDto);

        //todo
    }
}
