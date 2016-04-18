package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.core.server.api.ServiceApi;
import com.mammutgroup.workshop.core.server.dao.ServiceDao;
import com.mammutgroup.workshop.core.shared.domain.model.ServiceEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author mushtu
 * @since 4/16/16.
 */
@Component
public class ServiceApiImpl extends BaseCrudApiImpl<ServiceEntity, ServiceDto, Long, ServiceDao> implements ServiceApi {

    @Autowired
    private ServiceDao serviceDao;

    @Override
    public List<ServiceEntity> getCompletedServices() {

        return serviceDao.getServicesWithEndDateBefore(new Date().getTime());
    }

    @Override
    public List<ServiceEntity> getInProgressServices() {
        return serviceDao.getServicesWithNullEndDate();
    }
}
