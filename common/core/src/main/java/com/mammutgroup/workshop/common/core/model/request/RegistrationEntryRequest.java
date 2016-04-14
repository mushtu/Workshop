package com.mammutgroup.workshop.common.core.model.request;

import com.mammutgroup.workshop.common.common.ServiceDefinition;
import com.mammutgroup.workshop.common.common.request.RequestService;

/**
 * @author mushtu
 */
public class RegistrationEntryRequest extends RequestService {

    private String cellNumber;
    private String bankCode;
    private String accountNumber;
    private String nationalCode;
    private String email;


    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public final ServiceDefinition getServiceDefinition() {
        return ServiceDefinition.REGISTRATION_ENTRY;
    }
}
