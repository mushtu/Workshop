package com.mammutgroup.workshop.core.server.service;

import com.mammutgroup.workshop.common.core.model.dto.CustomerDto;
import com.mammutgroup.workshop.common.core.model.enums.VehicleServiceState;
import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.common.core.model.response.VehicleServiceResponse;
import com.mammutgroup.workshop.core.server.api.CustomerApi;
import com.mammutgroup.workshop.core.server.service.bpm.BpmService;
import com.mammutgroup.workshop.core.shared.domain.model.CustomerEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.parent.service.BaseServiceImpl;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.security.authentication.api.shared.api.IAuthenticationApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author mushtu
 * @since 4/16/16.
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl implements CustomerService {

    @Autowired
    private BpmService bpmService;
    @Autowired
    private CustomerApi customerApi;
    @Autowired
    private IAuthenticationApi authenticationAPI;

    @Override
    public VehicleServiceResponse registerServiceRequest(VehicleServiceRequest request) throws BaseVaselineServerException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setUsername(authenticationAPI.getCurrentUsername());
        List<CustomerEntity> list = customerApi.searchByExample(customerDto);
        if(list.size()  == 1){
            request.addExtraVariable("customer",convert(list.get(0),CustomerDto.class));
        }else
            throw new BaseVaselineServerException();

        return convert(bpmService.startProcess(request),VehicleServiceResponse.class);
    }

    @Override
    public VehicleServiceState getServiceState(String id) {

        if(bpmService.isProcessExist(id)) {
            List<String> actives = bpmService.getActiveActivityIds(id);
            if (actives.contains("vehicleServiceResourceAssignmentTask"))
                return VehicleServiceState.PENDING;
            else if (actives.contains("vehicleServiceTask"))
                return VehicleServiceState.IN_PROGRESS;
            else
                return VehicleServiceState.COMPLETED;
        }
        else
            return VehicleServiceState.COMPLETED;

    }
}
