package com.mammutgroup.workshop.core.server.api.crud;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.core.shared.domain.model.WorkshopServiceEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.api.IBaseCrudApi;

/**
 * @author mushtu
 * @since 4/18/16.
 */
public interface WorkshopServiceCrudApi extends IBaseCrudApi<WorkshopServiceEntity,WorkshopServiceDto,Long> {
}
