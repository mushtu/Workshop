package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Workshop Service Line Domain Model
 * Every line can handle a single service at the same time!
 *
 * @author mushtu
 * @since 4/2/16.
 */
@Entity
@Table(name = "line")
public class LineEntity extends BaseEntityImpl<Long> {

    @Column(unique = true)
    private int lineNumber;

    private WorkshopEntity workshop;
    private Set<ServiceEntity> services = new HashSet<ServiceEntity>(0);
    private ServiceEntity currentService;

    //private ServiceEntity currentService ; // can be handled by service start dates

    @ManyToOne
    @JoinColumn(nullable = false)
    public WorkshopEntity getWorkshop() {
        return workshop;
    }

    public void setWorkshop(WorkshopEntity workshop) {
        this.workshop = workshop;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "line", cascade = CascadeType.ALL)
    public Set<ServiceEntity> getServices() {
        return services;
    }

    public void setServices(Set<ServiceEntity> services) {
        this.services = services;
    }

    @OneToOne(mappedBy = "line")
    public ServiceEntity getCurrentService() {
        return currentService;
    }

    public void setCurrentService(ServiceEntity currentService) {
        this.currentService = currentService;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}

