package com.mammutgroup.workshop.core.server.ws.rest.management;

import com.mammutgroup.workshop.common.core.model.dto.OfficeDto;
import com.mammutgroup.workshop.core.server.ws.rest.RepositoryRestService;

import javax.ws.rs.Path;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Path("/offices")
public interface OfficeRespositoryRestService extends RepositoryRestService<OfficeDto,Long> {
}
