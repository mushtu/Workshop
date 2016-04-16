package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.core.server.rest.management.VehicleServiceManagement;

import javax.ws.rs.core.Response;

/**
 * Created by mushtu on 4/14/16.
 */
public class VehicleServiceManagementImpl implements VehicleServiceManagement {
    @Override
    public Response startService(VehicleServiceRequest request) {
        return null;
    }

    @Override
    public Response getServiceLines() {
        return null;
    }

    @Override
    public Response claimService() {
        return null;
    }
}
