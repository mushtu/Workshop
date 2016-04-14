package com.mammutgroup.workshop.core.server.api.crud;

import com.mammutgroup.workshop.common.core.model.dto.OfficeDto;
import com.mammutgroup.workshop.core.shared.domain.model.OfficeEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.api.IBaseCrudApi;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public interface OfficeCrudApi extends IBaseCrudApi<OfficeEntity, OfficeDto, Long> {
}
