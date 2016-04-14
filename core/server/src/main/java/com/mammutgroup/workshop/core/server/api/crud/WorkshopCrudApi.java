package com.mammutgroup.workshop.core.server.api.crud;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopDto;
import com.mammutgroup.workshop.core.shared.domain.model.WorkshopEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.api.IBaseCrudApi;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public interface WorkshopCrudApi  extends IBaseCrudApi<WorkshopEntity, WorkshopDto, Long> {
}
