package com.mammutgroup.workshop.common.core.model.dto;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

/**
 * @author mushtu
 * @since 4/18/16.
 */
public class WorkshopOfficeDto extends BaseDtoImpl<Long>{

    private WorkshopDto workshop;
    private OfficeDto office;
    private Long salary;
    private EmployeeDto employee;

    public WorkshopDto getWorkshop() {
        return workshop;
    }

    public void setWorkshop(WorkshopDto workshop) {
        this.workshop = workshop;
    }

    public OfficeDto getOffice() {
        return office;
    }

    public void setOffice(OfficeDto office) {
        this.office = office;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }
}
