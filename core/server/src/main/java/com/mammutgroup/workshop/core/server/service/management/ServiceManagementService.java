package com.mammutgroup.workshop.core.server.service.management;

import com.mammutgroup.workshop.common.core.model.request.VehicleServiceRequest;
import com.mammutgroup.workshop.core.server.service.crud.ServiceCrudService;
import ir.amv.os.vaseline.base.architecture.server.layers.parent.service.IBaseService;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;

/**
 * @author mushtu
 * @since 4/10/16.
 */
public interface ServiceManagementService extends ServiceCrudService {

    //String startService(VehicleServiceRequest request) throws BaseVaselineServerException;
}
