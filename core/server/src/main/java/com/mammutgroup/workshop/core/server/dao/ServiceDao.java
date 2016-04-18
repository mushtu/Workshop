package com.mammutgroup.workshop.core.server.dao;

import com.mammutgroup.workshop.core.server.dao.crud.ServiceCrudDao;
import com.mammutgroup.workshop.core.shared.domain.model.ServiceEntity;

import java.util.List;

/**
 * @author mushtu
 * @since 4/16/16.
 */
public interface ServiceDao extends ServiceCrudDao {

    List<ServiceEntity> getServicesWithEndDateBefore(Long date);
    List<ServiceEntity> getServicesWithNullEndDate();

}
