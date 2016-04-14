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
    private Set<VehicleServiceEntity> services = new HashSet<VehicleServiceEntity>(0);
    private Set<LineEntity> lines = new HashSet<LineEntity>(0);

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

    @ManyToMany(fetch = FetchType.LAZY)
    public Set<VehicleServiceEntity> getServices() {
        return services;
    }

    public void setServices(Set<VehicleServiceEntity> services) {
        this.services = services;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "workshop", cascade = CascadeType.ALL)
    public Set<LineEntity> getLines() {
        return lines;
    }

    public void setLines(Set<LineEntity> lines) {
        this.lines = lines;
    }
}
