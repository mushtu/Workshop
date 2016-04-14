package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.SpareDto;
import com.mammutgroup.workshop.core.server.api.SpareApi;
import com.mammutgroup.workshop.core.server.dao.SpareDao;
import com.mammutgroup.workshop.core.shared.domain.model.SpareEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import org.springframework.stereotype.Component;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Component
public class SpareApiImpl extends BaseCrudApiImpl<SpareEntity, SpareDto, Long, SpareDao> implements SpareApi {
}
