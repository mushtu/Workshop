package com.mammutgroup.workshop.common.core.model.dto;

import java.util.Set;

/**
 * @author mushtu
 * @since 3/30/16.
 */
public class EmployeeDto extends WorkshopBaseUserDto {

    Set<WorkshopOfficeDto> offices;

    public Set<WorkshopOfficeDto> getOffices() {
        return offices;
    }

    public void setOffices(Set<WorkshopOfficeDto> offices) {
        this.offices = offices;
    }
}
