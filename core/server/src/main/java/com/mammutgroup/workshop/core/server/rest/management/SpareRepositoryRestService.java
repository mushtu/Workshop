package com.mammutgroup.workshop.core.server.rest.management;

import com.mammutgroup.workshop.common.core.model.dto.SpareDto;
import com.mammutgroup.workshop.core.server.rest.RepositoryRestService;

import javax.ws.rs.Path;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Path("/spares")
public interface SpareRepositoryRestService extends RepositoryRestService<SpareDto,Long> {
}
