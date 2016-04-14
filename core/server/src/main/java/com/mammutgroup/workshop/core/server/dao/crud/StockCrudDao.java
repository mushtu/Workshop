package com.mammutgroup.workshop.core.server.dao.crud;

import com.mammutgroup.workshop.common.core.model.dto.StockDto;
import com.mammutgroup.workshop.core.shared.domain.model.StockEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.dao.IBaseCrudDao;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public interface StockCrudDao extends IBaseCrudDao<StockEntity, StockDto, Long> {
}
