package com.mammutgroup.workshop.core.server.dao.hibernate;

import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.core.server.dao.ServiceDao;
import com.mammutgroup.workshop.core.shared.domain.model.ServiceEntity;
import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.layers.crud.dao.BaseCrudHibernateDaoImpl;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mushtu
 * @since 4/16/16.
 */
@Repository
public class ServiceHibernateDao extends BaseCrudHibernateDaoImpl<ServiceEntity, ServiceDto, Long> implements ServiceDao {

    @Override
    public List<ServiceEntity> getServicesWithEndDateBefore(Long date) {

        DetachedCriteria detCriteria = createCriteria();
        detCriteria.add(Restrictions.le("endDate",date));
        Criteria criteria = getCriteriaFromDetachedCriteria(detCriteria);
        return getListFromCriteria(criteria);
    }

    @Override
    public List<ServiceEntity> getServicesWithNullEndDate() {
        DetachedCriteria detCriteria = createCriteria();
        detCriteria.add(Restrictions.isNull("endDate"));
        Criteria criteria = getCriteriaFromDetachedCriteria(detCriteria);
        return getListFromCriteria(criteria);
    }
}
