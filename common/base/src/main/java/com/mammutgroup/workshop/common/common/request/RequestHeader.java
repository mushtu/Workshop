package com.mammutgroup.workshop.common.common.request;

import java.io.Serializable;

/**
 * Created by sima on 5/18/2015.
 */
public class RequestHeader implements Serializable {
    private String version;
    private String authToken;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
