package com.mammutgroup.workshop.core.server.dao.crud;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.shared.domain.model.EmployeeEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.dao.IBaseCrudDao;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public interface EmployeeCrudDao extends IBaseCrudDao<EmployeeEntity, EmployeeDto, Long> {
}
