package com.mammutgroup.workshop.core.server.rest.management;

import com.mammutgroup.workshop.common.core.model.dto.WorkshopServiceDto;
import com.mammutgroup.workshop.core.server.rest.RepositoryRestService;

import javax.ws.rs.Path;

/**
 * @author mushtu
 * @since 4/18/16.
 */
@Path("/svs")
public interface WorkshopServiceRepositoryRest extends RepositoryRestService<WorkshopServiceDto,Long> {
}
