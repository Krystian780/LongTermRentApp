/* package com.team.demo.Testing;

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

        Amenity firstAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity secondAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity thirdAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity fourthAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(firstAmenity, secondAmenity, thirdAmenity, fourthAmenity));

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
                .amenities(amenities)
                .build();
    }

    public Offer getSecondOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskie")
                .name("Krakow")
                .build();

        Amenity firstAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity secondAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity thirdAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity fourthAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        List<Amenity> reviews = new ArrayList<>(List.of(firstAmenity, secondAmenity, thirdAmenity, fourthAmenity));

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

        Amenity firstAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity secondSecond = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity thirdAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity fourthAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(firstAmenity, secondSecond, thirdAmenity, fourthAmenity));

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
                .amenities(amenities)
                .build();
    }

    public Offer getFourthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        Amenity firstAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity secondAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity thirdAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        Amenity fourthAmenity = Amenity.builder()
                .id(1)
                .amenity("WIFI")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(firstAmenity, secondAmenity, thirdAmenity, fourthAmenity));

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
                .amenities(amenities)
                .build();
    }

    public List<Offer> getOffers(){
        return new ArrayList<>(List.of(getFirstOffers(), getSecondOffer(), getThirdOffer(), getFourthOffer()));
    }

}
*/