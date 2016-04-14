package com.mammutgroup.workshop.common.common;


/**
 * @author mushtu
 */
public abstract class BaseService implements Service, ServiceDefinitionAware {

    /**
     * The request uuid.
     */
    private String requestUUID;

    public String getId() {
        return requestUUID;
    }

    public void setId(String s) {
        this.requestUUID = s;
    }

    public abstract ServiceDefinition getServiceDefinition();
}
