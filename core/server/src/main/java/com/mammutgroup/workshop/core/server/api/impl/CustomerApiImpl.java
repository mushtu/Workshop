package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.CustomerDto;
import com.mammutgroup.workshop.core.server.api.CustomerApi;
import com.mammutgroup.workshop.core.server.dao.CustomerDao;
import com.mammutgroup.workshop.core.shared.domain.model.CustomerEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import org.springframework.stereotype.Component;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Component
public class CustomerApiImpl extends BaseCrudApiImpl<CustomerEntity, CustomerDto, Long, CustomerDao> implements CustomerApi {
}
