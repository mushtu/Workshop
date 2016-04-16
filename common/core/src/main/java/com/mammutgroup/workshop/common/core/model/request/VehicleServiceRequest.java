package com.mammutgroup.workshop.common.core.model.request;

import com.mammutgroup.workshop.common.core.model.dto.VehicleDto;
import com.mammutgroup.workshop.common.core.model.dto.VehicleServiceDto;
import ir.amv.os.vaseline.bpm.api.shared.model.startproc.AbstractStartProcessReqDto;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mushtu
 * @since 4/10/16.
 */
public class VehicleServiceRequest extends AbstractStartProcessReqDto implements ProcessDefinitionAware{

    private VehicleDto vehicle;
    private VehicleServiceDto service;

    public VehicleDto getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDto vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleServiceDto getService() {
        return service;
    }

    public void setService(VehicleServiceDto service) {
        this.service = service;
    }


    @Override
    public String getProcessDefinitionKey() {
        return getProcessDefinition().getKey();
    }

    @Override
    public Map<String, Object> getVariablesMap() {
        Map<String,Object> vars = new HashMap<String, Object>();
        vars.put("vehicle",vehicle);
        vars.put("service",service);
        return vars;
    }

    public ProcessDefinition getProcessDefinition() {
        return ProcessDefinition.VEHICLE_SERVICE_PROCESS;
    }
}
