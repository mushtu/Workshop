package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author mushtu
 * @since 4/10/16.
 */

@Entity
@Table(name = "vehicle_category")
public class VehicleCategoryEntity extends BaseEntityImpl<Long> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
