package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.core.server.rest.management.LineRepositoryRestService;
import com.mammutgroup.workshop.core.server.service.management.LineManagementService;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class WorkshopLineRestService extends BaseCrudRestServiceImpl<LineDto, Long, LineManagementService>
        implements LineRepositoryRestService {

    @Override
    public List<LineDto> getAll() throws BaseVaselineClientException {
        List<LineDto> lines = super.getAll();
        return lines;
    }
}
