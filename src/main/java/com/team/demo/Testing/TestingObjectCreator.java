package com.team.demo.Testing;

import com.team.demo.OfferModel.*;
import java.util.ArrayList;
import java.util.List;

public class TestingObjectCreator {
    List<Offer> offers = new ArrayList<>();

    public Offer generateFirstOffer(){
        City krakow = City.builder()
                .id(1)
                .name("Krakow")
                .province("Malopolskie")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(
                Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1200)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Apartment in Cracow")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateSecondOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskie")
                .name("Krakow")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1100)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Cozy Apartment in Cracow")
                .description(description)
                .city(krakow)
                .build();
    }

    public Offer generateThirdOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Mazowieckie")
                .name("Warszawa")
                .build();


        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1500)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Small Room but nice view in Warsaw")
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

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getFifthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getSixthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getSeventhOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getEithOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getNineththOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getTenthhOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer generateEleventhOffer(){
        City krakow = City.builder()
                .id(1)
                .name("Krakow")
                .province("Malopolskie")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(
                Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1200)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Apartment in Cracow")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateTwelvethOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskie")
                .name("Krakow")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1100)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Cozy Apartment in Cracow")
                .description(description)
                .city(krakow)
                .build();
    }

    public Offer generateThirteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Mazowieckie")
                .name("Warszawa")
                .build();


        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1500)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Small Room but nice view in Warsaw")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer getFourteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getFifteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getSixteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getSeventeenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getEiteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getNineteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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

    public Offer getTwentiethOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
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
        return new ArrayList<>(List.of(generateFirstOffer(), generateSecondOffer(), generateThirdOffer(), getFourthOffer()));
    }

}
