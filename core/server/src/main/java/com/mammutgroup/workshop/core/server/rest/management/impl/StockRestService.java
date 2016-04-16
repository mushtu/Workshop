package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.StockDto;
import com.mammutgroup.workshop.core.server.service.StockService;
import com.mammutgroup.workshop.core.server.rest.management.StockRepositoryRestService;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class StockRestService extends BaseCrudRestServiceImpl<StockDto, Long, StockService> implements StockRepositoryRestService {
}
