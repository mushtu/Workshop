package com.mammutgroup.workshop.common.common.response;

import com.mammutgroup.workshop.common.common.Message;

/**
 * @author mushtu
 */
public class ResponseMessage<T extends ResponseService> implements Message<T> {

    /**
     * The service.
     */
    private T service;

    public void setService(T service) {
        this.service = service;
    }

    public T getService() {
        return service;
    }
}
