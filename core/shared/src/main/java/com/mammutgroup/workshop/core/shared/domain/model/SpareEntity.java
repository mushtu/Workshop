package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Spare Domain Model
 *
 * @author mushtu
 * @since 3/28/16.
 */
@Entity
@Table(name = "spare")
public class SpareEntity extends BaseEntityImpl<Long> {

    private String name;
    private Byte[] icon;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte[] getIcon() {
        return icon;
    }

    public void setIcon(Byte[] icon) {
        this.icon = icon;
    }
}
