package io.nb.domainr.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchError {
    @JsonProperty("status")
    private int code;
    @JsonProperty("message")
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
