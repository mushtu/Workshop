package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.core.server.api.ServiceApi;
import com.mammutgroup.workshop.core.server.service.management.ServiceManagementService;
import com.mammutgroup.workshop.core.shared.domain.model.ServiceEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import ir.amv.os.vaseline.base.mapper.server.exc.VaselineConvertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mushtu
 * @since 4/10/16.
 */
@Service
public class ServiceManagementServiceImpl extends BaseCrudServiceImpl<ServiceEntity, ServiceDto, Long, ServiceApi> implements ServiceManagementService {

    @Autowired
    private ServiceApi serviceApi;

    @Override
    public List<ServiceDto> getCompletedServices() throws VaselineConvertException {

        return convertList(serviceApi.getCompletedServices(),ServiceDto.class);

    }

    @Override
    public List<ServiceDto> getInProgressServices() throws VaselineConvertException {
        return convertList(serviceApi.getInProgressServices(),ServiceDto.class);
    }
}
