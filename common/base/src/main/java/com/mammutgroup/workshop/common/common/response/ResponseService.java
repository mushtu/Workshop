package com.mammutgroup.workshop.common.common.response;

import com.mammutgroup.workshop.common.common.BaseService;

/**
 * @author mushtu
 */
public abstract class ResponseService extends BaseService {

    private ResultStatus resultStatus;

    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

}
