package com.mammutgroup.workshop.core.server.service;

import com.mammutgroup.workshop.common.core.model.enums.VehicleServiceState;
import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.common.core.model.response.VehicleServiceResponse;
import com.mammutgroup.workshop.core.server.service.bpm.BpmService;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.parent.service.BaseServiceImpl;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author mushtu
 * @since 4/16/16.
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl implements CustomerService {

    @Autowired
    private BpmService bpmService;

    @Override
    public VehicleServiceResponse registerServiceRequest(VehicleServiceRequest request) throws BaseVaselineServerException {

        return convert(bpmService.startProcess(request),VehicleServiceResponse.class);
    }

    @Override
    public VehicleServiceState getServiceState(String id) {
        return null;
    }
}
