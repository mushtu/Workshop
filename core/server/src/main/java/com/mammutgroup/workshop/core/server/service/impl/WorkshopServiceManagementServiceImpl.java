package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.core.server.api.WorkshopServiceApi;
import com.mammutgroup.workshop.core.server.service.management.WorkshopServiceManagementService;
import com.mammutgroup.workshop.core.shared.domain.model.WorkshopServiceEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/18/16.
 */
@Service
public class WorkshopServiceManagementServiceImpl extends BaseCrudServiceImpl<WorkshopServiceEntity,WorkshopServiceDto,Long,WorkshopServiceApi> implements WorkshopServiceManagementService {
}
