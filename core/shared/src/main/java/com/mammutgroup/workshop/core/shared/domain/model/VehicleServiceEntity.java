package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Workshop Service Domain Model
 * Services offered by workshop(e.g painting, repairing ...)
 *
 * @author mushtu
 * @since 4/2/16.
 */
@Entity
@Table(name = "vehicle_service")
public class VehicleServiceEntity extends BaseEntityImpl<Long> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
