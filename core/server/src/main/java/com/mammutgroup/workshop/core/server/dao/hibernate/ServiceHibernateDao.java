package com.mammutgroup.workshop.core.server.dao.hibernate;

import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.core.server.dao.ServiceDao;
import com.mammutgroup.workshop.core.shared.domain.model.ServiceEntity;
import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.layers.crud.dao.BaseCrudHibernateDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * @author mushtu
 * @since 4/16/16.
 */
@Repository
public class ServiceHibernateDao extends BaseCrudHibernateDaoImpl<ServiceEntity, ServiceDto, Long> implements ServiceDao {
}
