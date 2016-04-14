package com.mammutgroup.workshop.core.server.service;

import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import ir.amv.os.vaseline.base.architecture.server.layers.parent.service.IBaseService;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;

/**
 * @author mushtu
 * @since 4/10/16.
 */
public interface VehicleService extends IBaseService {

    String startService(VehicleServiceRequest request) throws BaseVaselineServerException;
}
