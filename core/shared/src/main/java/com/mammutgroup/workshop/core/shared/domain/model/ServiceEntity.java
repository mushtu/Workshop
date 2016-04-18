package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Service Domain Model
 * A Service is created and is assigned to a service line
 *
 * @author mushtu
 * @since 4/10/16.
 */
@Entity
@Table(name = "service")
public class ServiceEntity extends BaseEntityImpl<Long> {

    private Long startDate;
    private Long endDate;

    private LineEntity line;
    private WorkshopServiceEntity service;


    @ManyToOne
    public LineEntity getLine() {
        return line;
    }

    public void setLine(LineEntity line) {
        this.line = line;
    }

    @ManyToOne
    public WorkshopServiceEntity getService() {
        return service;
    }

    public void setService(WorkshopServiceEntity service) {
        this.service = service;
    }

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
}
