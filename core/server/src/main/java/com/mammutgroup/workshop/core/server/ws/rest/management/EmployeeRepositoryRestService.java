package com.mammutgroup.workshop.core.server.ws.rest.management;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.server.ws.rest.RepositoryRestService;
import ir.amv.os.vaseline.base.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.ws.rest.server.base.crud.IBaseCrudRestService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author mushtu
 * @since 4/12/16.
 */
@Path("/employees")
public interface EmployeeRepositoryRestService extends RepositoryRestService<EmployeeDto, Long> {

}
