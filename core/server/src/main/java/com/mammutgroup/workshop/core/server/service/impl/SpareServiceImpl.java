package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.SpareDto;
import com.mammutgroup.workshop.core.server.api.SpareApi;
import com.mammutgroup.workshop.core.server.service.SpareService;
import com.mammutgroup.workshop.core.shared.domain.model.SpareEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class SpareServiceImpl extends BaseCrudServiceImpl<SpareEntity, SpareDto, Long, SpareApi> implements SpareService {
}
