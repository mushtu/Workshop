package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.core.server.api.LineApi;
import com.mammutgroup.workshop.core.server.service.LineService;
import com.mammutgroup.workshop.core.shared.domain.model.LineEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class LineServiceImpl extends BaseCrudServiceImpl<LineEntity, LineDto, Long, LineApi> implements LineService {
}
