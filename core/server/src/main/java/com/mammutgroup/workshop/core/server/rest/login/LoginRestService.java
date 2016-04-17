package com.mammutgroup.workshop.core.server.rest.login;

import com.mammutgroup.workshop.common.core.model.dto.LoginDto;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author mushtu
 * @since 4/17/16.
 */
@Path("/login")
public interface LoginRestService {

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    Response login(LoginDto loginDto);
}
