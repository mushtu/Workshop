package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Office(position) Domain Model.
 * An employee may has one or more office in the workshop(e.g manager, repairman, worker ...)
 *
 * @author mushtu
 * @since 3/30/16.
 */
@Entity
@Table(name = "office")
public class OfficeEntity extends BaseEntityImpl<Long> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
