package com.mammutgroup.workshop.core.shared.domain.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Employee Domain Model
 *
 * @author mushtu
 * @since 3/30/16.
 */
@Entity
@Table(name = "employee")
public class EmployeeEntity extends WorkshopBaseUser {

    private Set<WorkshopOffice> offices = new HashSet<WorkshopOffice>(0);

    @OneToMany(mappedBy = "employee")
    public Set<WorkshopOffice> getOffices() {
        return offices;
    }

    public void setOffices(Set<WorkshopOffice> offices) {
        this.offices = offices;
    }
}
