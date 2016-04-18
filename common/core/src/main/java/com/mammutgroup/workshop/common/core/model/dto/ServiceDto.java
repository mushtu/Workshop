package com.mammutgroup.workshop.common.core.model.dto;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

/**
 * @author mushtu
 * @since 4/11/16.
 */
public class ServiceDto extends BaseDtoImpl<Long> {

    private Long startDate;
    private Long endDate;

    private WorkshopServiceDto vehicleService;
    private LineDto line;

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public WorkshopServiceDto getVehicleService() {
        return vehicleService;
    }

    public void setVehicleService(WorkshopServiceDto vehicleService) {
        this.vehicleService = vehicleService;
    }

    public LineDto getLine() {
        return line;
    }

    public void setLine(LineDto line) {
        this.line = line;
    }
}
