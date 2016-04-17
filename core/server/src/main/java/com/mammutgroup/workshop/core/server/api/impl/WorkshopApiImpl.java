package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopDto;
import com.mammutgroup.workshop.core.server.api.WorkshopApi;
import com.mammutgroup.workshop.core.server.dao.WorkshopDao;
import com.mammutgroup.workshop.core.shared.domain.model.WorkshopEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import org.springframework.stereotype.Component;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Component
public class WorkshopApiImpl extends BaseCrudApiImpl<WorkshopEntity, WorkshopDto, Long, WorkshopDao> implements WorkshopApi {
}
