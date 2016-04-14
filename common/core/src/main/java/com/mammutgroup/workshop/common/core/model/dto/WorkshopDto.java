package com.mammutgroup.workshop.common.core.model.dto;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

/**
 * @author mushtu
 * @since 3/30/16.
 */
public class WorkshopDto extends BaseDtoImpl<Long> {
    private String name;
    private String address;


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


}
