package com.mammutgroup.workshop.common.core.model.dto;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

/**
 * @author mushtu
 * @since 3/30/16.
 */
public class SpareDto extends BaseDtoImpl<Long> {

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
