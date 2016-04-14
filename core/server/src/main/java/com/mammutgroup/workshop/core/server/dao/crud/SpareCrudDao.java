package com.mammutgroup.workshop.core.server.dao.crud;

import com.mammutgroup.workshop.common.core.model.dto.SpareDto;
import com.mammutgroup.workshop.core.shared.domain.model.SpareEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.dao.IBaseCrudDao;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public interface SpareCrudDao extends IBaseCrudDao<SpareEntity, SpareDto, Long> {
}
