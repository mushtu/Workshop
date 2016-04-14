package com.mammutgroup.workshop.common.common.response;

import java.io.IOException;
import java.util.Properties;

/**
 * @author mushtu
 */
public enum ResultStatus {

    UNKNOWN(1, "unknown.error"),
    SUCCESS(0, "success"),
    FAILURE(1000, "failure");

    private String code; // local language code
    private String description; //local language description
    private Integer key;
    private Properties errorMessageProperties;


    ResultStatus(Integer key, String description) {
        populateConfigProperty();
        this.key = key;
        this.code = errorMessageProperties.getProperty(key.toString());
        this.description = errorMessageProperties.getProperty(description);
    }

    private void populateConfigProperty() {
        try {
            errorMessageProperties = new Properties();
            errorMessageProperties.load((this.getClass().getResourceAsStream("/errormsg.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }
}
