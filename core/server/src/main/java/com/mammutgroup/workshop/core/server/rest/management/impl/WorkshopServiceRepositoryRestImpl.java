package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.core.server.rest.management.WorkshopServiceRepositoryRest;
import com.mammutgroup.workshop.core.server.service.crud.WorkshopServiceCrudService;
import com.mammutgroup.workshop.core.server.service.management.WorkshopServiceManagementService;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/18/16.
 */
@Service
public class WorkshopServiceRepositoryRestImpl extends BaseCrudRestServiceImpl<WorkshopServiceDto,Long,WorkshopServiceManagementService> implements WorkshopServiceRepositoryRest {
}
