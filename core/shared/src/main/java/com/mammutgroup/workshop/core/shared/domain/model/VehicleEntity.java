package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author mushtu
 * @since 3/30/16.
 */
@Entity
@Table(name = "vehicle")
public class VehicleEntity extends BaseEntityImpl<Long> {

    private VehicleCategoryEntity category;

    @OneToOne(fetch = FetchType.EAGER)
    public VehicleCategoryEntity getCategory() {
        return category;
    }

    public void setCategory(VehicleCategoryEntity category) {
        this.category = category;
    }
}
