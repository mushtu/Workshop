package com.mammutgroup.workshop.common.common;

/**
 * @author mushtu
 */
public enum ServiceDefinition {

    REGISTRATION_ENTRY("001");

    private String code;

    ServiceDefinition(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    /**
     * Find by code.
     *
     * @param code the code
     * @return the service attribute
     */
    public static ServiceDefinition findByCode(String code) {
        ServiceDefinition[] serviceDefinitions = ServiceDefinition.values();
        for (ServiceDefinition definition : serviceDefinitions) {
            if (definition.getCode().equals(code)) {
                return definition;
            }
        }
        return null;
    }
}
