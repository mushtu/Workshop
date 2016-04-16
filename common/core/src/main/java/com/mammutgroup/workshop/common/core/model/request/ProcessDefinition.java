package com.mammutgroup.workshop.common.core.model.request;

/**
 * @author mushtu
 * @since 4/16/16.
 */
public enum  ProcessDefinition {

    VEHICLE_SERVICE_PROCESS("vehicleServiceProcess");

    private String key;

    ProcessDefinition(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    /**
     * Find by key.
     *
     * @param code the key
     * @return the service attribute
     */
    public static ProcessDefinition findByKey(String code) {
        ProcessDefinition[] serviceDefinitions = ProcessDefinition.values();
        for (ProcessDefinition definition : serviceDefinitions) {
            if (definition.getKey().equals(code)) {
                return definition;
            }
        }
        return null;
    }

}
