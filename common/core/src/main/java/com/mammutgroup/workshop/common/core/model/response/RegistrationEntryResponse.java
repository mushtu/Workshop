package com.mammutgroup.workshop.common.core.model.response;

import com.mammutgroup.workshop.common.common.ServiceDefinition;
import com.mammutgroup.workshop.common.common.response.ResponseService;

/**
 * @author mushtu
 */
public class RegistrationEntryResponse extends ResponseService {

    private String userIdToken;

    public String getUserIdToken() {
        return userIdToken;
    }

    public void setUserIdToken(String userIdToken) {
        this.userIdToken = userIdToken;
    }

    @Override
    public final ServiceDefinition getServiceDefinition() {
        return ServiceDefinition.REGISTRATION_ENTRY;
    }
}
