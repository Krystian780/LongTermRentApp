package com.team.demo.Testing;

import com.team.demo.OfferModel.*;

import java.util.ArrayList;
import java.util.List;

public class TestingObjectCreator {
    List<Offer> offers = new ArrayList<>();



    public Offer getFirstOffers(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskie")
                .name("Krakow")
                .build();

        Review firstReview = Review.builder()
                .id(1)
                .review("Nice room")
                .mark(5)
                .build();

        Review secondReview = Review.builder()
                .id(1)
                .review("Nice room, fast WIFI")
                .mark(4)
                .build();

        Review thirdReview = Review.builder()
                .id(1)
                .review("Nice room, bad smell")
                .mark(3)
                .build();

        Review fourthReview = Review.builder()
                .id(1)
                .review("Nice room, quiet neighbourhood")
                .mark(5)
                .build();

        List<Review> reviews = new ArrayList<>(List.of(firstReview, secondReview, thirdReview, fourthReview));

        Description description = Description.builder()
                .id(1)
                .amentities("WIFI")
                .objectDescription("someDescription")
                .price(1200)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Apartment in Gdansk")
                .description(description)
                .city(krakow)
                .reviewList(reviews)
                .build();
    }

    public Offer getSecondOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskie")
                .name("Krakow")
                .build();

        Review firstReview = Review.builder()
                .id(1)
                .review("Cozy room")
                .mark(5)
                .build();

        Review secondReview = Review.builder()
                .id(1)
                .review("The best amentities")
                .mark(4)
                .build();

        Review thirdReview = Review.builder()
                .id(1)
                .review("Smaller than on the picture")
                .mark(3)
                .build();

        Review fourthReview = Review.builder()
                .id(1)
                .review("Weird neighbours")
                .mark(5)
                .build();

        List<Review> reviews = new ArrayList<>(List.of(firstReview, secondReview, thirdReview, fourthReview));

        Description description = Description.builder()
                .id(1)
                .amentities("WIFI")
                .objectDescription("someDescription")
                .price(1200)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Apartment in Gdansk")
                .description(description)
                .city(krakow)
                .build();
    }

    public Offer getThirdOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        Review firstReview = Review.builder()
                .id(1)
                .review("Big Bed ! I Like it !")
                .mark(5)
                .build();

        Review secondReview = Review.builder()
                .id(1)
                .review("The best amentities, no info about animals")
                .mark(4)
                .build();

        Review thirdReview = Review.builder()
                .id(1)
                .review("Smaller than on the picture")
                .mark(2)
                .build();

        Review fourthReview = Review.builder()
                .id(1)
                .review("Weird neighbours")
                .mark(5)
                .build();

        List<Review> reviews = new ArrayList<>(List.of(firstReview, secondReview, thirdReview, fourthReview));

        Description description = Description.builder()
                .id(1)
                .amentities("WIFI")
                .objectDescription("someDescription")
                .price(1500)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Cozy Room in Warsaw")
                .description(description)
                .city(krakow)
                .reviewList(reviews)
                .build();
    }

    public Offer getFourthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        Review firstReview = Review.builder()
                .id(1)
                .review("Very Clean")
                .mark(5)
                .build();

        Review secondReview = Review.builder()
                .id(1)
                .review("Could be more cleaner, but overall really nice")
                .mark(4)
                .build();

        Review thirdReview = Review.builder()
                .id(1)
                .review("Refrigerator didn't work, had to eat outside everyday")
                .mark(2)
                .build();

        Review fourthReview = Review.builder()
                .id(1)
                .review("NoisyNeighbours")
                .mark(5)
                .build();

        List<Review> reviews = new ArrayList<>(List.of(firstReview, secondReview, thirdReview, fourthReview));

        Description description = Description.builder()
                .id(1)
                .amentities("WIFI")
                .objectDescription("someDescription")
                .price(1200)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Big room in Old Town Warsaw")
                .description(description)
                .city(krakow)
                .reviewList(reviews)
                .build();
    }

    public List<Offer> getOffers(){
        return new ArrayList<>(List.of(getFirstOffers(), getSecondOffer(), getThirdOffer(), getFourthOffer()));
    }

}
