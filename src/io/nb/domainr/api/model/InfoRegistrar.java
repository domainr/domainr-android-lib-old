package io.nb.domainr.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoRegistrar {
    @JsonProperty("registrar")
    private String registrar;
    @JsonProperty("name")
    private String name;
    @JsonProperty("register_url")
    private String registerUrl;

    public String getRegistrar() {
        return registrar;
    }

    public String getName() {
        return name;
    }

    public String getRegisterUrl() {
        return registerUrl;
    }
}
