package com.mammutgroup.workshop.core.server.dao.hibernate;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.server.dao.EmployeeDao;
import com.mammutgroup.workshop.core.shared.domain.model.EmployeeEntity;
import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.layers.crud.dao.BaseCrudHibernateDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * @author mushtu
 * @since 4/12/16.
 */
@Repository
public class EmployeeHibernateDao extends BaseCrudHibernateDaoImpl<EmployeeEntity, EmployeeDto, Long> implements EmployeeDao {
}
