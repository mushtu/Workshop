package com.mammutgroup.workshop.core.server.ws.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.CustomerDto;
import com.mammutgroup.workshop.core.server.service.CustomerService;
import com.mammutgroup.workshop.core.server.ws.rest.management.CustomerRepositoryRestService;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class CustomerRestService extends BaseCrudRestServiceImpl<CustomerDto, Long, CustomerService> implements CustomerRepositoryRestService {
}
