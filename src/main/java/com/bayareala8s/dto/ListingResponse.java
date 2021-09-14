package com.bayareala8s.dto;

import java.util.List;

public class ListingResponse {

    private String type;
    private List<Feature> features;

    public ListingResponse() {

    }
    public ListingResponse(List<Feature> features, String type) {
        this.features = features;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

}
