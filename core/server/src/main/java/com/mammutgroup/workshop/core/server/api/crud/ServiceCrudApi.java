package com.mammutgroup.workshop.core.server.api.crud;

import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.core.shared.domain.model.ServiceEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.api.IBaseCrudApi;

/**
 * @author mushtu
 * @since 4/16/16.
 */
public interface ServiceCrudApi extends IBaseCrudApi<ServiceEntity, ServiceDto, Long> {
}
