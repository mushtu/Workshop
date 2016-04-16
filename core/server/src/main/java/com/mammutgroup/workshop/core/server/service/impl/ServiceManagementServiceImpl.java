package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.core.server.api.ServiceApi;
import com.mammutgroup.workshop.core.server.service.management.ServiceManagementService;
import com.mammutgroup.workshop.core.shared.domain.model.ServiceEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.parent.service.BaseServiceImpl;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/10/16.
 */
@Service
public class ServiceManagementServiceImpl extends BaseCrudServiceImpl<ServiceEntity, ServiceDto, Long, ServiceApi> implements ServiceManagementService {

}
