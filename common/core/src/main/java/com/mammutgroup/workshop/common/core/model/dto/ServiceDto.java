package com.mammutgroup.workshop.common.core.model.dto;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

/**
 * @author mushtu
 * @since 4/11/16.
 */
public class ServiceDto extends BaseDtoImpl<Long> {

    private VehicleServiceDto vehicleService;
    private LineDto line;

    public VehicleServiceDto getVehicleService() {
        return vehicleService;
    }

    public void setVehicleService(VehicleServiceDto vehicleService) {
        this.vehicleService = vehicleService;
    }

    public LineDto getLine() {
        return line;
    }

    public void setLine(LineDto line) {
        this.line = line;
    }
}
