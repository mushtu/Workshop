package com.mammutgroup.workshop.core.server.rest.management;

import com.mammutgroup.workshop.common.core.model.dto.StockDto;
import com.mammutgroup.workshop.core.server.rest.RepositoryRestService;

import javax.ws.rs.Path;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Path("/stocks")
public interface StockRepositoryRestService extends RepositoryRestService<StockDto,Long> {
}
