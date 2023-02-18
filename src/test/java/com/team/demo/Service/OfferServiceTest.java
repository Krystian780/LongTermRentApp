package com.team.demo.Service;

import com.team.demo.OfferModel.City;
import com.team.demo.OfferModel.Offer;
import com.team.demo.Testing.TestingObjectCreator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class OfferServiceTest {


    @Test
    public void shouldReturnOfferForGivenCities(){
        List<Offer> offers = new TestingObjectCreator().getOffers();
        List<Offer> offersWithWarsawAsMainPlace = List.of(offers.get(2), offers.get(3));
        List<String> citiesFromOffers = offersWithWarsawAsMainPlace.stream()
                .map(Offer::getCity)
                .map(City::getName)
                .collect(Collectors.toList());
        Set<String> allCititesFromGivenOffers = new HashSet<>(citiesFromOffers);
        int size = allCititesFromGivenOffers.size();
        assertEquals(1, size);
        assertEquals(1,2);
    }
}