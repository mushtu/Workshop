package com.mammutgroup.workshop.core.server.api.crud;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.core.shared.domain.model.LineEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.api.IBaseCrudApi;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public interface LineCrudApi extends IBaseCrudApi<LineEntity, LineDto, Long> {
}
