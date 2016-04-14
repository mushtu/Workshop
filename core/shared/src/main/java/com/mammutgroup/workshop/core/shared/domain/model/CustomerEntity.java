package com.mammutgroup.workshop.core.shared.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Customer Domain Model.
 * Customers are the vehicle owners or drivers who request the workshop for available services!
 *
 * @author mushtu
 * @since 3/28/16.
 */
@Entity
@Table(name = "customer")
public class CustomerEntity extends WorkshopBaseUser {


}
