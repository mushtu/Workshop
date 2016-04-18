package com.mammutgroup.workshop.core.server.service.management;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.core.server.service.crud.ServiceCrudService;
import ir.amv.os.vaseline.base.mapper.server.exc.VaselineConvertException;

import java.util.List;

/**
 * @author mushtu
 * @since 4/10/16.
 */
public interface ServiceManagementService extends ServiceCrudService {

    List<ServiceDto> getCompletedServices() throws VaselineConvertException;
    List<ServiceDto> getInProgressServices() throws VaselineConvertException;

    //String startService(VehicleServiceRequest request) throws BaseVaselineServerException;
}
