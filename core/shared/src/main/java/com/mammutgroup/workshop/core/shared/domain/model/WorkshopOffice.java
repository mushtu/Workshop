package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Workshop Office Domain Model
 * Offices(positions) in the workshop.
 *
 * @author mushtu
 * @since 3/30/16.
 */
@Entity
@Table(name = "workshop_office")
public class WorkshopOffice extends BaseEntityImpl<Long> {

    private WorkshopEntity workshop;
    private OfficeEntity office;
    private Long salary;
    private EmployeeEntity employee;

    @ManyToOne
    public WorkshopEntity getWorkshop() {
        return workshop;
    }

    public void setWorkshop(WorkshopEntity workshop) {
        this.workshop = workshop;
    }

    @ManyToOne
    public OfficeEntity getOffice() {
        return office;
    }

    public void setOffice(OfficeEntity office) {
        this.office = office;
    }

    @ManyToOne
    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
