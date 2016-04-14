package com.mammutgroup.workshop.common.core.model.request;

import com.mammutgroup.workshop.common.core.model.dto.VehicleDto;
import com.mammutgroup.workshop.common.core.model.dto.VehicleServiceDto;

/**
 * @author mushtu
 * @since 4/10/16.
 */
public class VehicleServiceRequest {

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
}
