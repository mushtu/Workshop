package com.mammutgroup.workshop.core.server.dao.hibernate;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopDto;
import com.mammutgroup.workshop.core.server.dao.WorkshopDao;
import com.mammutgroup.workshop.core.shared.domain.model.WorkshopEntity;
import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.layers.crud.dao.BaseCrudHibernateDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Repository
public class WorkshopHibernateDao extends BaseCrudHibernateDaoImpl<WorkshopEntity, WorkshopDto, Long> implements WorkshopDao {
}
