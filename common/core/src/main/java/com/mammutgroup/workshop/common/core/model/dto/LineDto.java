package com.mammutgroup.workshop.common.core.model.dto;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

import java.util.Set;

/**
 * @author mushtu
 * @since 4/11/16.
 */
public class LineDto extends BaseDtoImpl<Long> {

    private int lineNumber;
    private ServiceDto currentService;
    private WorkshopDto workshop;
    private Set<ServiceDto> services ;

    public WorkshopDto getWorkshop() {
        return workshop;
    }

    public void setWorkshop(WorkshopDto workshop) {
        this.workshop = workshop;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public ServiceDto getCurrentService() {
        return currentService;
    }

    public void setCurrentService(ServiceDto currentService) {
        this.currentService = currentService;
    }

    public Set<ServiceDto> getServices() {
        return services;
    }

    public void setServices(Set<ServiceDto> services) {
        this.services = services;
    }
}
