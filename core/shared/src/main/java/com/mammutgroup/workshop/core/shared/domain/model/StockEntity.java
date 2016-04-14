package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Stock Domain Model
 *
 * @author mushtu
 * @since 3/28/16.
 */
@Entity
@Table(name = "stock")
public class StockEntity extends BaseEntityImpl<Long> {

    private String name;
    private WorkshopEntity workshop;
    private Set<StockSpareEntity> spares = new HashSet<StockSpareEntity>(0);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "stock")
    public WorkshopEntity getWorkshop() {
        return workshop;
    }

    public void setWorkshop(WorkshopEntity workshop) {
        this.workshop = workshop;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "stock")
    public Set<StockSpareEntity> getSpares() {
        return spares;
    }

    public void setSpares(Set<StockSpareEntity> spares) {
        this.spares = spares;
    }
}
