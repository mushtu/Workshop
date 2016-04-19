package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;
import com.mammutgroup.workshop.core.server.api.EmployeeApi;
import com.mammutgroup.workshop.core.server.dao.EmployeeDao;
import com.mammutgroup.workshop.core.shared.domain.model.EmployeeEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.util.hash.HashUtil;
import ir.amv.os.vaseline.security.authentication.spring.impl.server.model.user.BaseUserEntity;
import org.springframework.stereotype.Component;

/**
 * @author mushtu
 * @since 4/12/16.
 */
@Component
public class EmployeeApiImpl extends BaseCrudApiImpl<EmployeeEntity, EmployeeDto, Long, EmployeeDao>
        implements EmployeeApi {


    private void prepareToStoreUser(EmployeeEntity entity) {
        if(entity.getEnabled() == null) {
            entity.setEnabled(Boolean.valueOf(true));
        }

        if(entity.getPassword() != null && !entity.getPassword().equals("")) {
            entity.setPassword(HashUtil.sha1Hash(entity.getPassword()));
        }

    }

    public void preSave(EmployeeEntity entity) throws BaseVaselineServerException {
        this.prepareToStoreUser(entity);
        super.preSave(entity);
    }

}
