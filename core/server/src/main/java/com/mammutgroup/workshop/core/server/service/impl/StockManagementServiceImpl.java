package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.StockDto;
import com.mammutgroup.workshop.core.server.api.StockApi;
import com.mammutgroup.workshop.core.server.service.management.StockManagementService;
import com.mammutgroup.workshop.core.shared.domain.model.StockEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class StockManagementServiceImpl extends BaseCrudServiceImpl<StockEntity, StockDto, Long, StockApi> implements StockManagementService {
}
