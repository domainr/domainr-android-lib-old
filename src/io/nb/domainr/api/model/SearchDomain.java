package io.nb.domainr.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchDomain {
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("register_url")
    private String registerUrl;
    @JsonProperty("host")
    private String host;
    @JsonProperty("path")
    private String path;
    @JsonProperty("subdomain")
    private String subdomain;
    @JsonProperty("availability")
    private String availability;

    public String getDomain() {
        return domain;
    }

    public String getRegisterUrl() {
        return registerUrl;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public String getAvailability() {
        return availability;
    }
}
