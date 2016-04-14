package com.mammutgroup.workshop.core.server.api.crud;

import com.mammutgroup.workshop.common.core.model.dto.CustomerDto;
import com.mammutgroup.workshop.core.shared.domain.model.CustomerEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.api.IBaseCrudApi;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public interface CustomerCrudApi extends IBaseCrudApi<CustomerEntity, CustomerDto, Long> {

}
