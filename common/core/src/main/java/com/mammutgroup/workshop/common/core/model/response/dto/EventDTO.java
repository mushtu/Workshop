package com.mammutgroup.workshop.common.core.model.response.dto;

import java.io.Serializable;
import java.security.PublicKey;

/**
 * Created by sima on 8/16/15.
 */
public class EventDTO {

    public enum EventStatus {
        ACTIVE,
        PASSIVE
    }

    private String name;
    private String description;
    private EventStatus status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventStatus getStatus() {
        return status;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }
}
