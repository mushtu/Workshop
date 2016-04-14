package com.mammutgroup.workshop.core.server.dao;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.shared.domain.model.EmployeeEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.dao.IBaseCrudDao;

/**
 * @author mushtu
 * @since 4/12/16.
 */
public interface EmployeeDao extends IBaseCrudDao<EmployeeEntity, EmployeeDto, Long> {

}
