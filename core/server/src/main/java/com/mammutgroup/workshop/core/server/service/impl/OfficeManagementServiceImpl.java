package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.OfficeDto;
import com.mammutgroup.workshop.core.server.api.OfficeApi;
import com.mammutgroup.workshop.core.server.service.management.OfficeManagementService;
import com.mammutgroup.workshop.core.shared.domain.model.OfficeEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class OfficeManagementServiceImpl extends BaseCrudServiceImpl<OfficeEntity, OfficeDto, Long, OfficeApi> implements OfficeManagementService {
}
