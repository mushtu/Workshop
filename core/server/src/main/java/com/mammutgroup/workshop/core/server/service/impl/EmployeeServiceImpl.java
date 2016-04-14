package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.server.api.EmployeeApi;
import com.mammutgroup.workshop.core.server.service.EmployeeService;
import com.mammutgroup.workshop.core.shared.domain.model.EmployeeEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/12/16.
 */
@Service
public class EmployeeServiceImpl extends BaseCrudServiceImpl<EmployeeEntity, EmployeeDto, Long, EmployeeApi>
        implements EmployeeService {
}
