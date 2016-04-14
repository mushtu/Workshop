package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.OfficeDto;
import com.mammutgroup.workshop.core.server.api.OfficeApi;
import com.mammutgroup.workshop.core.server.dao.OfficeDao;
import com.mammutgroup.workshop.core.shared.domain.model.OfficeEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import org.springframework.stereotype.Component;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Component
public class OfficeApiImpl extends BaseCrudApiImpl<OfficeEntity, OfficeDto, Long, OfficeDao> implements OfficeApi{
}
