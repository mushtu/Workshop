package com.mammutgroup.workshop.core.server.rest.customer;

import com.mammutgroup.workshop.common.core.model.enums.VehicleServiceState;
import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.common.core.model.response.VehicleServiceResponse;
import org.springframework.stereotype.Service;

/**
 * Created by mushtu on 4/14/16.
 */
@Service
public class CustomerRestServiceImpl implements CustomerRestService {


    @Override
    public VehicleServiceResponse requestService(VehicleServiceRequest request) {
        return null;
    }

    @Override
    public VehicleServiceState serviceState(String id) {
        return null;
    }
}
