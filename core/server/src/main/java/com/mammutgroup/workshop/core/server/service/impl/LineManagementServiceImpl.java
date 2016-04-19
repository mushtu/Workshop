package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.core.server.api.LineApi;
import com.mammutgroup.workshop.core.server.service.management.LineManagementService;
import com.mammutgroup.workshop.core.server.service.management.ServiceManagementService;
import com.mammutgroup.workshop.core.shared.domain.model.LineEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.base.mapper.server.exc.VaselineConvertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class LineManagementServiceImpl extends BaseCrudServiceImpl<LineEntity, LineDto, Long, LineApi> implements LineManagementService {


//    @Override
//    public LineDto convertEntityToDTO(LineEntity lineEntity) throws VaselineConvertException {
//        LineDto lineDto = convertEntityToDTO(lineEntity);
//        lineDto.setFree(lineEntity.getCurrentService() == null);
//        return lineDto;
//    }
//
//    @Override
//    public List<LineDto> convertEntityToDTO(Collection<LineEntity> list) throws VaselineConvertException {
//        List<LineDto> dtos = convertEntityToDTO(list);
//
//    }
}
