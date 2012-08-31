package io.nb.domainr.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class InfoResult {
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("whois_url")
    private String whoisUrl;
    @JsonProperty("register_url")
    private String registerUrl;
    @JsonProperty("tld")
    private InfoTld tld;
    @JsonProperty("registrars")
    private ArrayList<InfoRegistrar> registrars;
    @JsonProperty("host")
    private String host;
    @JsonProperty("path")
    private String path;
    @JsonProperty("www_url")
    private String wwwUrl;
    @JsonProperty("query")
    private String query;
    @JsonProperty("subdomain")
    private String subdomain;
    @JsonProperty("domain_idna")
    private String domainIdna;
    @JsonProperty("availability")
    private String availability;
}
