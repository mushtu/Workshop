package com.mammutgroup.workshop.common.core.model.enums;

/**
 * @author mushtu
 * @since 3/30/16.
 */
public enum WorkshopEmployeeOffice {

    ACCOUNTANT("0"),
    REPAIR_MAN("01"),
    SERVICE_MAN("02");


    private String code;

    WorkshopEmployeeOffice(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static WorkshopEmployeeOffice findByCode(String code) {
        WorkshopEmployeeOffice[] offices = WorkshopEmployeeOffice.values();
        for (WorkshopEmployeeOffice office : offices) {
            if (office.getCode().equals(code)) {
                return office;
            }
        }
        return null;
    }


}
