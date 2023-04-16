package com.team.demo.OfferModel;

public enum Amenity {
    WIFI("WIFI"),
    AIR_CONDITIONING("AN_AIR_CONDITIONING"),
    GARAGE("GARAGE"),
    DISHWASHER("DISHWASHER");

    private String amenity;

    Amenity(String amenity) {
        this.amenity = amenity;
    }
}
