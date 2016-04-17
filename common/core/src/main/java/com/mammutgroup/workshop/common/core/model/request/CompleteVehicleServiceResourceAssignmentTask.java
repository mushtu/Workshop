package com.mammutgroup.workshop.common.core.model.request;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import ir.amv.os.vaseline.bpm.api.shared.model.compltask.AbstractCompleteTaskRequestDto;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mushtu
 * @since 4/17/16.
 */
public class CompleteVehicleServiceResourceAssignmentTask extends AbstractCompleteTaskRequestDto {

    private LineDto line;
    private EmployeeDto employee;

    public LineDto getLine() {
        return line;
    }

    public void setLine(LineDto line) {
        this.line = line;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }

    @Override
    public Map<String, Object> getVariables() {
        Map<String,Object> vars = new HashMap<String, Object>();
        vars.put("line",line);
        vars.put("employee",employee);
        vars.putAll(variablesMap);
        return vars;
    }
}
