package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.core.server.api.WorkshopServiceApi;
import com.mammutgroup.workshop.core.server.dao.WorkshopServiceDao;
import com.mammutgroup.workshop.core.shared.domain.model.WorkshopServiceEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import org.springframework.stereotype.Component;

/**
 * @author mushtu
 * @since 4/18/16.
 */
@Component
public class WorkshopServiceApiImpl extends BaseCrudApiImpl<WorkshopServiceEntity,WorkshopServiceDto,Long,WorkshopServiceDao> implements WorkshopServiceApi{
}
