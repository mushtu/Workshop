package com.mammutgroup.workshop.core.server.api.crud;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.shared.domain.model.EmployeeEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.api.IBaseCrudApi;

/**
 * @author mushtu
 * @since 4/12/16.
 */
public interface EmployeeCrudApi extends IBaseCrudApi<EmployeeEntity, EmployeeDto, Long> {
}
