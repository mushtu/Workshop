package com.mammutgroup.workshop.core.server.service.impl;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.common.core.model.dto.ServiceDto;
import com.mammutgroup.workshop.core.server.api.LineApi;
import com.mammutgroup.workshop.core.server.service.management.LineManagementService;
import com.mammutgroup.workshop.core.server.service.management.ServiceManagementService;
import com.mammutgroup.workshop.core.shared.domain.model.LineEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Service
public class LineManagementServiceImpl extends BaseCrudServiceImpl<LineEntity, LineDto, Long, LineApi> implements LineManagementService {


}
