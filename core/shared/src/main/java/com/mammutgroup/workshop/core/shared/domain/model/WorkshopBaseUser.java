package com.mammutgroup.workshop.core.shared.domain.model;

import ir.amv.os.vaseline.security.authentication.spring.impl.server.model.user.BaseUserEntity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author mushtu
 * @since 3/30/16.
 */
@Entity
@Table(name = "workshop_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class WorkshopBaseUser extends BaseUserEntity {

    private String firstName;
    private String lastName;
    private String mobileNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
