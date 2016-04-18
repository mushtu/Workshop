package com.mammutgroup.workshop.core.server.dao;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.core.shared.domain.model.LineEntity;
import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.dao.IBaseCrudDao;

import java.util.List;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public interface LineDao extends IBaseCrudDao<LineEntity, LineDto, Long> {

    List<LineEntity> getFreeLines();
}
