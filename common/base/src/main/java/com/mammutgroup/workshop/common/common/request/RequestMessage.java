package com.mammutgroup.workshop.common.common.request;

import com.mammutgroup.workshop.common.common.Message;

/**
 * Request message that client sends to server
 *
 * @author mushtu
 */
public class RequestMessage<T extends RequestService> implements Message<T> {

    /**
     * The service.
     */
    private T service;
    private RequestHeader requestHeader;

    public void setService(T service) {
        this.service = service;
    }

    public T getService() {
        return service;
    }

    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }
}
