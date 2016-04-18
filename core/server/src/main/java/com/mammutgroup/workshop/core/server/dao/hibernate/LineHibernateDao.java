package com.mammutgroup.workshop.core.server.dao.hibernate;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.core.server.dao.LineDao;
import com.mammutgroup.workshop.core.shared.domain.model.LineEntity;
import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.layers.crud.dao.BaseCrudHibernateDaoImpl;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Repository
public class LineHibernateDao extends BaseCrudHibernateDaoImpl<LineEntity, LineDto, Long> implements LineDao {

    @Override
    public List<LineEntity> getFreeLines() {
        DetachedCriteria detCriteria = createCriteria();
        DetachedCriteria currentService = detCriteria.createCriteria("currentService");
        currentService.add(Restrictions.isNull("id"));
        Criteria criteria = getCriteriaFromDetachedCriteria(detCriteria);
        return getListFromCriteria(criteria);

    }
}
