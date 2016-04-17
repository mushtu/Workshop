package com.mammutgroup.workshop.core.server.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.OfficeDto;
import com.mammutgroup.workshop.core.server.rest.management.OfficeRespositoryRestService;
import com.mammutgroup.workshop.core.server.service.management.OfficeManagementService;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class OfficeRestService extends BaseCrudRestServiceImpl<OfficeDto, Long, OfficeManagementService> implements OfficeRespositoryRestService {
}
