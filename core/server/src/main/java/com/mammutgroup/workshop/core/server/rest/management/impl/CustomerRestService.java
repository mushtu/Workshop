package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.CustomerDto;
import com.mammutgroup.workshop.core.server.rest.management.CustomerRepositoryRestService;
import com.mammutgroup.workshop.core.server.service.CustomerManagementService;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class CustomerRestService extends BaseCrudRestServiceImpl<CustomerDto, Long, CustomerManagementService> implements CustomerRepositoryRestService {
}