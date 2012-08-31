package io.nb.domainr.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoTld {
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("domain_idna")
    private String domain_idna;
    @JsonProperty("wikipedia_url")
    private String wikipediaUrl;
    @JsonProperty("iana_url")
    private String ianaUrl;

    public String getDomain() {
        return domain;
    }

    public String getDomain_idna() {
        return domain_idna;
    }

    public String getWikipediaUrl() {
        return wikipediaUrl;
    }

    public String getIanaUrl() {
        return ianaUrl;
    }
}
