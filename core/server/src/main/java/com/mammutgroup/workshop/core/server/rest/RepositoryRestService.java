package com.mammutgroup.workshop.core.server.rest;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.IBaseDto;
import ir.amv.os.vaseline.base.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.ws.rest.server.base.crud.IBaseCrudRestService;
import ir.amv.os.vaseline.ws.rest.server.multiparam.annot.JsonMultParam;
import ir.amv.os.vaseline.ws.rest.server.multiparam.annot.JsonParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author mushtu
 * @since 4/11/16.
 */
public interface RepositoryRestService<D extends IBaseDto<Id>, Id extends Serializable> extends IBaseCrudRestService<D, Id> {

    @Produces({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    @GET
    D getById(@PathParam("id") Id id) throws BaseVaselineClientException;

    @Produces({MediaType.APPLICATION_JSON})
    @Path("count")
    @GET
    Long countAll() throws BaseVaselineClientException;

    @Override
    @Produces({MediaType.APPLICATION_JSON})
    @GET
    List<D> getAll() throws BaseVaselineClientException;

    @Override
    @Produces({MediaType.APPLICATION_JSON})
    @Path("getAllPaged")
    @POST
    List<D> getAll(PagingDto paginationObject)
            throws BaseVaselineClientException;

    @Override
    @Produces({MediaType.APPLICATION_JSON})
    @Path("countByExample")
    @POST
    Long countByExample(D example) throws BaseVaselineClientException;

    @Override
    @Produces({MediaType.APPLICATION_JSON})
    @Path("searchByExample")
    @POST
    List<D> searchByExample(D searchExampleDTO)
            throws BaseVaselineClientException;

    @Override
    @Produces({MediaType.APPLICATION_JSON})
    @POST
    Id save(D t) throws BaseVaselineClientException;

    @Override
    @Produces({MediaType.APPLICATION_JSON})
    @PUT
    void update(D t) throws BaseVaselineClientException;

    @Override
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    @DELETE
    void deleteById(@PathParam("id") Id id) throws BaseVaselineClientException;
}
