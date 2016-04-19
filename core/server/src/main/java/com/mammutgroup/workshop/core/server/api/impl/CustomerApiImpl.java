package com.mammutgroup.workshop.core.server.api.impl;

import com.mammutgroup.workshop.common.core.model.dto.CustomerDto;
import com.mammutgroup.workshop.core.server.api.CustomerApi;
import com.mammutgroup.workshop.core.server.dao.CustomerDao;
import com.mammutgroup.workshop.core.shared.domain.model.CustomerEntity;
import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.core.shared.util.hash.HashUtil;
import ir.amv.os.vaseline.security.authentication.spring.impl.server.model.user.BaseUserEntity;
import org.springframework.stereotype.Component;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Component
public class CustomerApiImpl extends BaseCrudApiImpl<CustomerEntity, CustomerDto, Long, CustomerDao> implements CustomerApi {


    private void prepareToStoreUser(CustomerEntity entity) {
        if(entity.getEnabled() == null) {
            entity.setEnabled(Boolean.valueOf(true));
        }

        if(entity.getPassword() != null && !entity.getPassword().equals("")) {
            entity.setPassword(HashUtil.sha1Hash(entity.getPassword()));
        }

    }

    public void preSave(CustomerEntity entity) throws BaseVaselineServerException {
        this.prepareToStoreUser(entity);
        super.preSave(entity);
    }

}
