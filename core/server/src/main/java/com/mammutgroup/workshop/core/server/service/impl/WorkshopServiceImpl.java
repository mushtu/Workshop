package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopDto;
import com.mammutgroup.workshop.core.server.api.WorkshopApi;
import com.mammutgroup.workshop.core.server.service.management.WorkshopService;
import com.mammutgroup.workshop.core.shared.domain.model.WorkshopEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class WorkshopServiceImpl extends BaseCrudServiceImpl<WorkshopEntity, WorkshopDto, Long, WorkshopApi> implements WorkshopService{
}
