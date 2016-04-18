package com.mammutgroup.workshop.core.server.dao.crud;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.core.shared.domain.model.WorkshopServiceEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.dao.IBaseCrudDao;

/**
 * @author mushtu
 * @since 4/18/16.
 */
public interface WorkshopServiceCrudDao extends IBaseCrudDao<WorkshopServiceEntity,WorkshopServiceDto,Long>{
}
