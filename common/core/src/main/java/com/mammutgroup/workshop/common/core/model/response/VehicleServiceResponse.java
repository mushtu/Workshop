package com.mammutgroup.workshop.common.core.model.response;


import com.mammutgroup.workshop.common.core.model.request.ProcessDefinition;
import com.mammutgroup.workshop.common.core.model.request.ProcessDefinitionAware;
import ir.amv.os.vaseline.bpm.api.shared.model.startproc.StartProcessResultDto;

/**
 * Created by mushtu on 4/14/16.
 */
public class VehicleServiceResponse extends StartProcessResultDto implements ProcessDefinitionAware{


    public ProcessDefinition getProcessDefinition() {
        return ProcessDefinition.VEHICLE_SERVICE_PROCESS;
    }
}
