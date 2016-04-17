package com.mammutgroup.workshop.core.server.rest.customer;

import com.mammutgroup.workshop.common.core.model.enums.VehicleServiceState;
import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.common.core.model.response.VehicleServiceResponse;
import com.mammutgroup.workshop.core.server.service.CustomerService;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mushtu on 4/14/16.
 */
@Service
public class CustomerRestServiceImpl implements CustomerRestService {

    @Autowired
    private CustomerService customerService;

    @Override
    public VehicleServiceResponse requestService(VehicleServiceRequest request) throws BaseVaselineServerException {
        return customerService.registerServiceRequest(request);
    }

    @Override
    public VehicleServiceState serviceState(String id) {
        return null;
    }
}
