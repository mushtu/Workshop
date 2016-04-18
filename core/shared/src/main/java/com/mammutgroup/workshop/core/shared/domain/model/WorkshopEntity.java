package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mushtu
 * @since 3/28/16.
 */

@Entity
@Table(name = "workshop")
public class WorkshopEntity extends BaseEntityImpl<Long> {

    private String name;
    private String address;
    private StockEntity stock;
    private Set<WorkshopServiceEntity> services = new HashSet<WorkshopServiceEntity>(0);
    private Set<LineEntity> lines = new HashSet<LineEntity>(0);
    private Set<WorkshopOffice> employeeOffices = new HashSet<WorkshopOffice>(0);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public StockEntity getStock() {
        return stock;
    }

    public void setStock(StockEntity stock) {
        this.stock = stock;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    public Set<WorkshopServiceEntity> getServices() {
        return services;
    }

    public void setServices(Set<WorkshopServiceEntity> services) {
        this.services = services;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "workshop", cascade = CascadeType.ALL)
    public Set<LineEntity> getLines() {
        return lines;
    }

    public void setLines(Set<LineEntity> lines) {
        this.lines = lines;
    }

    @OneToMany(mappedBy = "workshop",cascade = CascadeType.ALL)
    public Set<WorkshopOffice> getEmployeeOffices() {
        return employeeOffices;
    }

    public void setEmployeeOffices(Set<WorkshopOffice> employeeOffices) {
        this.employeeOffices = employeeOffices;
    }
}
