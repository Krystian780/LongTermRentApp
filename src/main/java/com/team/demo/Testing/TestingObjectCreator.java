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
                .id(3)
                .offerName("Small Room but nice view")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer getFourthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskiee")
                .name("Krakow")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(2000)
                .build();

        return Offer.builder()
                .id(4)
                .offerName("Big room in Old Town Cracow")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateFifthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Malopolskie")
                .name("Krakow")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1300)
                .build();

        return Offer.builder()
                .id(5)
                .offerName("Big room in Old Town Cracow")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateSixthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Mazowieckie")
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
                .id(6)
                .offerName("Big room in Old Town Warsaw")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateSeventhOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Mazowieckie")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1400)
                .build();

        return Offer.builder()
                .id(7)
                .offerName("Big room in Old Town Warsaw")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateEithOffer(){
        City warszawa = City.builder()
                .id(1)
                .province("Mazowieckie")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1600)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Big room in Old Town Warsaw")
                .description(description)
                .city(warszawa)
                .amenities(amenities)
                .build();
    }

    public Offer generateNineththOffer(){
        City warszawa = City.builder()
                .id(1)
                .province("Mazowieckie")
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
                .id(9)
                .offerName("Big room in Old Town Warsaw")
                .description(description)
                .city(warszawa)
                .amenities(amenities)
                .build();
    }

    public Offer generateTenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Mazowieckie")
                .name("Warszawa")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1700)
                .build();

        return Offer.builder()
                .id(10)
                .offerName("Big room in Old Town Warsaw")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateEleventhOffer(){
        City krakow = City.builder()
                .id(1)
                .name("Warszawa")
                .province("Mazowieckie")
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
                .id(11)
                .offerName("Apartment in Warsaw")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateTwelvethOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Slaskie")
                .name("Katowice")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(900)
                .build();

        return Offer.builder()
                .id(12)
                .offerName("Cozy Apartment in Katowice")
                .description(description)
                .city(krakow)
                .build();
    }

    public Offer generateThirteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Slaskie")
                .name("Katowice")
                .build();


        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.DISHWASHER,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(1000)
                .build();

        return Offer.builder()
                .id(1)
                .offerName("Small Room but nice view")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateFourteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Slaskie")
                .name("Katowice")
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
                .id(14)
                .offerName("Big room near market square")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateFifteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Slaskie")
                .name("Katowice")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(800)
                .build();

        return Offer.builder()
                .id(15)
                .offerName("Big room near Mariacka street")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateSixteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Pomorskie")
                .name("Sopot")
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
                .id(16)
                .offerName("Cozy Room facing the see")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateSeventeenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Pomorskie")
                .name("Sopot")
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
                .id(17)
                .offerName("Comfortable room in Sopot")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateEighteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Pomorskie")
                .name("Sopot")
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
                .id(18)
                .offerName("Room near Monciak")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateNineteenthOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Pomorskie")
                .name("Sopot")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(2000)
                .build();

        return Offer.builder()
                .id(19)
                .offerName("Big Room with view on the sea")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public Offer generateTwentiethOffer(){
        City krakow = City.builder()
                .id(1)
                .province("Pomorskie")
                .name("Sopot")
                .build();

        List<Amenity> amenities = new ArrayList<>(List.of(Amenity.WIFI,
                Amenity.GARAGE,
                Amenity.AIR_CONDITIONING));

        Description description = Description.builder()
                .id(1)
                .objectDescription("someDescription")
                .price(800)
                .build();

        return Offer.builder()
                .id(20)
                .offerName("Cozy room 3 km from the center")
                .description(description)
                .city(krakow)
                .amenities(amenities)
                .build();
    }

    public List<Offer> getOffers(){
        return new ArrayList<>(List.of(generateFirstOffer(), generateSecondOffer(), generateThirdOffer(),
                getFourthOffer(), generateFifthOffer(), generateSixthOffer(), generateEighteenthOffer(), generateNineththOffer(),
                generateTenthOffer(), generateEleventhOffer(), generateTwelvethOffer(), generateThirteenthOffer(),
                generateFourteenthOffer(), generateFifteenthOffer(), generateSixteenthOffer(), generateSeventeenthOffer(),
                generateEighteenthOffer(), generateNineteenthOffer(), generateTwentiethOffer()));
    }

}
