package com.mammutgroup.workshop.core.server.ws.rest.management.impl;

import com.mammutgroup.workshop.common.core.model.dto.SpareDto;
import com.mammutgroup.workshop.core.server.service.SpareService;
import com.mammutgroup.workshop.core.server.ws.rest.management.SpareRepositoryRestService;
import ir.amv.os.vaseline.ws.rest.server.base.crud.impl.BaseCrudRestServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class SpareRestService extends BaseCrudRestServiceImpl<SpareDto, Long, SpareService> implements SpareRepositoryRestService {
}
