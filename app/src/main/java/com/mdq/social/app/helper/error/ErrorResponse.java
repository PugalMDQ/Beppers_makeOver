package com.mdq.social.app.helper.error;

import com.google.gson.annotations.SerializedName;

public class ErrorResponse {

    @SerializedName("error_description")
    private String errorDescription;

    @SerializedName("error")
    private String error;

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}