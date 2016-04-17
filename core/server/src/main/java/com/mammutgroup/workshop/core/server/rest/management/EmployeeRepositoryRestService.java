package com.mammutgroup.workshop.core.server.rest.management;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.server.rest.RepositoryRestService;

import javax.ws.rs.Path;

/**
 * @author mushtu
 * @since 4/12/16.
 */
@Path("/employees")
public interface EmployeeRepositoryRestService extends RepositoryRestService<EmployeeDto, Long> {

}
