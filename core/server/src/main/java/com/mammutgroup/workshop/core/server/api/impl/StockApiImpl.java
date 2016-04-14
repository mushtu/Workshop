package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.StockDto;
import com.mammutgroup.workshop.core.server.api.StockApi;
import com.mammutgroup.workshop.core.server.dao.StockDao;
import com.mammutgroup.workshop.core.shared.domain.model.StockEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import org.springframework.stereotype.Component;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Component
public class StockApiImpl extends BaseCrudApiImpl<StockEntity, StockDto, Long, StockDao> implements StockApi {
}
