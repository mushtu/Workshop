package com.mammutgroup.workshop.core.server.api;

import com.mammutgroup.workshop.core.server.api.crud.ServiceCrudApi;
import com.mammutgroup.workshop.core.shared.domain.model.ServiceEntity;

import java.util.List;

/**
 * @author mushtu
 * @since 4/16/16.
 */
public interface ServiceApi extends ServiceCrudApi {

    List<ServiceEntity> getCompletedServices();
    List<ServiceEntity> getInProgressServices();
}
