package com.mammutgroup.workshop.core.server.dao.hibernate;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.core.server.dao.WorkshopServiceDao;
import com.mammutgroup.workshop.core.shared.domain.model.WorkshopServiceEntity;
import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.layers.crud.dao.BaseCrudHibernateDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * @author mushtu
 * @since 4/18/16.
 */
@Repository
public class WorkshopServiceHibernateDao extends BaseCrudHibernateDaoImpl<WorkshopServiceEntity,WorkshopServiceDto,Long> implements WorkshopServiceDao{
}
