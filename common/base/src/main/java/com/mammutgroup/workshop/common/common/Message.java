package com.mammutgroup.workshop.common.common;

import java.io.Serializable;

/**
 * @author mushtu
 */
public interface Message<T extends Service> extends Serializable {

    /**
     * Sets the service.
     *
     * @param service the new service
     */
    void setService(T service);

    /**
     * Gets the service.
     *
     * @return the service
     */
    T getService();

}
