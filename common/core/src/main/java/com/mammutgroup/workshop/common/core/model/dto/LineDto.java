package com.mammutgroup.workshop.common.core.model.dto;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

/**
 * @author mushtu
 * @since 4/11/16.
 */
public class LineDto extends BaseDtoImpl<Long> {

    private String lineNumber;
    private boolean free;
    private WorkshopDto workshop;

    public WorkshopDto getWorkshop() {
        return workshop;
    }

    public void setWorkshop(WorkshopDto workshop) {
        this.workshop = workshop;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
