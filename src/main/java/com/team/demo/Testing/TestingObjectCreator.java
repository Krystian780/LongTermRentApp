package com.team.demo.Testing;

import com.team.demo.OfferModel.*;
import java.util.ArrayList;
import java.util.List;

public class TestingObjectCreator {
    List<Offer> offers = new ArrayList<>();

    public void getOffers(){
        //FIRST OFFER
        City krakow = City.builder()
                .id(1)
                .province("Malopolskie")
                .name("Krakow")
                .build();

        Description description = Description.builder()
                .id(1)
                .amentities("WIFI")
                .objectDescription("someDescription")
                .price(1200)
                .build();

        Review firstReview = Review.builder()
                .id(1)
                .review("Nice room")
                .mark(5)
                .build();

        List<Review> reviews = new ArrayList<>(List.of(firstReview));

        User user = User.builder()
                .id(1)
                .name("Krystian")
                .reviews(reviews)
                .build();

    }

}
