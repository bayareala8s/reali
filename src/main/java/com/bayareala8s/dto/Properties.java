package com.bayareala8s.dto;

public class Properties {

    private Long id;
    private Long price;
    private String street;
    private int bedrooms;
    private int bathrooms;
    private int sqft;

    public Properties() {

    }

    public Properties(Long id, Long price, String street, int bedrooms, int bathrooms, int sqft) {
        this.id = id;
        this.price = price;
        this.street = street;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.sqft = sqft;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }
}
