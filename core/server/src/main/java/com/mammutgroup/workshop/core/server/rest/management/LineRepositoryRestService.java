package com.mammutgroup.workshop.core.server.rest.management;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.core.server.rest.RepositoryRestService;
import ir.amv.os.vaseline.base.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.ws.rest.server.multiparam.annot.JsonMultParam;
import ir.amv.os.vaseline.ws.rest.server.multiparam.annot.JsonParam;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

/**
 * @author mushtu
 * @since 4/11/16.
 */
@Path("/lines")
public interface LineRepositoryRestService extends RepositoryRestService<LineDto, Long> {

    @Override
    @Produces({MediaType.APPLICATION_JSON})
    @Path("searchByExamplePaged")
    @POST
    List<LineDto> searchByExample(
            @JsonMultParam({
                    @JsonParam(paramName = "example", paramType = LineDto.class),
                    @JsonParam(paramName = "pagingDto", paramType = PagingDto.class)
            }) Map<String, Object> map) throws BaseVaselineClientException;
}
