package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.CustomerDto;
import com.mammutgroup.workshop.core.server.api.CustomerApi;
import com.mammutgroup.workshop.core.server.service.CustomerManagementService;
import com.mammutgroup.workshop.core.shared.domain.model.CustomerEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class CustomerManagementServiceImpl extends BaseCrudServiceImpl<CustomerEntity, CustomerDto, Long, CustomerApi> implements CustomerManagementService {
}
