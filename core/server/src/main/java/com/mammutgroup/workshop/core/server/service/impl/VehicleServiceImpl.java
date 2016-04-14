package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.core.server.service.VehicleService;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.parent.service.BaseServiceImpl;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.bpm.api.server.api.IVaselineBpmApi;
import ir.amv.os.vaseline.bpm.api.server.model.startproc.StartProcessReqServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mushtu
 * @since 4/10/16.
 */
@Service
public class VehicleServiceImpl extends BaseServiceImpl implements VehicleService {

    public final static String VEHICLE_SERVICE_ID = "vehicleService";

    @Autowired
    protected IVaselineBpmApi bpmApi;

    @Override
    public String startService(VehicleServiceRequest request) throws BaseVaselineServerException {

        //VehicleEntity vehicle = convert(request.getVehicle(),VehicleEntity.class);
        //VehicleServiceEntity vehicleService = convert(request.getService(),VehicleServiceEntity.class);
        StartProcessReqServer req = new StartProcessReqServer();
        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("vehicle", request.getVehicle());
        variables.put("service", request.getService());
        req.setVariablesMap(variables);
        req.setProcessDefinitionKey(VEHICLE_SERVICE_ID);
        return bpmApi.startProcess(req).getProcessId();
    }


}
