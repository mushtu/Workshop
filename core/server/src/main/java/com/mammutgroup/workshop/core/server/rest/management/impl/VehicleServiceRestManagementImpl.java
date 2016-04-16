package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.core.server.rest.management.VehicleServiceRestManagement;
import com.mammutgroup.workshop.core.server.service.management.ServiceManagementService;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by mushtu on 4/14/16.
 */
public class VehicleServiceRestManagementImpl implements VehicleServiceRestManagement {


    @Autowired
    private ServiceManagementService service;

    @Override
    public List<ServiceDto> getServices() throws BaseVaselineClientException {
        return service.getAll();
    }


}
