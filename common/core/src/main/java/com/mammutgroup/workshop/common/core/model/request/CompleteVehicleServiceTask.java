package com.mammutgroup.workshop.common.core.model.request;

import ir.amv.os.vaseline.bpm.api.shared.model.compltask.AbstractCompleteTaskRequestDto;

import java.util.Map;

/**
 * @author mushtu
 * @since 4/17/16.
 */
public class CompleteVehicleServiceTask extends AbstractCompleteTaskRequestDto {


    @Override
    public Map<String, Object> getVariables() {
        return variablesMap;
    }
}
