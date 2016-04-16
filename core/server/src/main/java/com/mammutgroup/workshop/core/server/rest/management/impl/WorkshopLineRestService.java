package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.core.server.rest.management.LineRepositoryRestService;
import com.mammutgroup.workshop.core.server.service.LineService;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class WorkshopLineRestService extends BaseCrudRestServiceImpl<LineDto, Long, LineService>
        implements LineRepositoryRestService {
}