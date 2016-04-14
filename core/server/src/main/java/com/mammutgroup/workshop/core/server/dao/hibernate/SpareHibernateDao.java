package com.mammutgroup.workshop.core.server.dao.hibernate;

import com.mammutgroup.workshop.common.core.model.dto.SpareDto;
import com.mammutgroup.workshop.core.server.dao.SpareDao;
import com.mammutgroup.workshop.core.shared.domain.model.SpareEntity;
import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.layers.crud.dao.BaseCrudHibernateDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Repository
public class SpareHibernateDao extends BaseCrudHibernateDaoImpl<SpareEntity, SpareDto, Long> implements SpareDao {
}
