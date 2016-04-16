package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopDto;
import com.mammutgroup.workshop.core.server.service.WorkshopService;
import com.mammutgroup.workshop.core.server.rest.management.WorkshopRepositoryRestService;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class WorkshopRestService extends BaseCrudRestServiceImpl<WorkshopDto, Long, WorkshopService>
        implements WorkshopRepositoryRestService{
}
