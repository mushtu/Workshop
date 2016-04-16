package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.server.rest.management.EmployeeRepositoryRestService;
import com.mammutgroup.workshop.core.server.service.EmployeeService;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 3/30/16.
 */
@Service
public class EmployeeRestService extends BaseCrudRestServiceImpl<EmployeeDto, Long, EmployeeService>
        implements EmployeeRepositoryRestService {

    //todo add more api
}
