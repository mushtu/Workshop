package com.mammutgroup.workshop.common.core.model.dto;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

/**
 * @author mushtu
 * @since 3/30/16.
 */
public class StockDto extends BaseDtoImpl<Long> {

    private String name;
    private WorkshopDto workshop;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkshopDto getWorkshop() {
        return workshop;
    }

    public void setWorkshop(WorkshopDto workshop) {
        this.workshop = workshop;
    }
}
