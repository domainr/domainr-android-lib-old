package io.nb.domainr.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class SearchResult {
    @JsonProperty("query")
    private String query;
    @JsonProperty("results")
    private ArrayList<SearchDomain> domains;
    @JsonProperty("error")
    private SearchError error;

    public String getQuery() {
        return query;
    }

    public ArrayList<SearchDomain> getDomains() {
        return domains;
    }

    public SearchError getError() {
        return error;
    }
}
