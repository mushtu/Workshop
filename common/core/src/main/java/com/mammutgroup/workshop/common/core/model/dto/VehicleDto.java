package com.mammutgroup.workshop.common.core.model.dto;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

/**
 * @author mushtu
 * @since 4/10/16.
 */
public class VehicleDto extends BaseDtoImpl<Long> {
    private VehicleCategoryDto category;

    public VehicleCategoryDto getCategory() {
        return category;
    }

    public void setCategory(VehicleCategoryDto category) {
        this.category = category;
    }
}
