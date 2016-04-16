package com.mammutgroup.workshop.core.server.service;

import com.mammutgroup.workshop.common.core.model.enums.VehicleServiceState;

/**
 * Created by mushtu on 4/14/16.
 */
public interface CustomerService {

    void registerServiceRequest();

    VehicleServiceState getServiceState();

}
