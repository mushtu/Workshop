package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.server.api.EmployeeApi;
import com.mammutgroup.workshop.core.server.dao.EmployeeDao;
import com.mammutgroup.workshop.core.shared.domain.model.EmployeeEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import org.springframework.stereotype.Component;

/**
 * @author mushtu
 * @since 4/12/16.
 */
@Component
public class EmployeeApiImpl extends BaseCrudApiImpl<EmployeeEntity, EmployeeDto, Long, EmployeeDao>
        implements EmployeeApi {

}
