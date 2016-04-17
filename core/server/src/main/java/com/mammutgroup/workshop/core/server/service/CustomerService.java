package com.mammutgroup.workshop.core.server.service;

import com.mammutgroup.workshop.common.core.model.enums.VehicleServiceState;
import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.common.core.model.response.VehicleServiceResponse;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;

/**
 * Created by mushtu on 4/14/16.
 */
public interface CustomerService {

    VehicleServiceResponse registerServiceRequest(VehicleServiceRequest request) throws BaseVaselineServerException;

    VehicleServiceState getServiceState(String id);

}
