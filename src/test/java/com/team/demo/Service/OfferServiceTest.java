package com.team.demo.Service;

import com.team.demo.OfferModel.City;
import com.team.demo.OfferModel.Offer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
class OfferServiceTest {

    @Autowired
    OfferService offerService;

    @Test
    public void shouldReturnOfferForGivenCities(){
        List<Offer> offersInWarsaw = offerService.getOffersForGivenCity("warszawa");
        List<String> citiesFromOffers = offersInWarsaw.stream()
                .map(Offer::getCity)
                .map(City::getName)
                .collect(Collectors.toList());
        Set<String> distinctCitiesNameFromObtainedOffer = new HashSet<>(citiesFromOffers);
        int size = distinctCitiesNameFromObtainedOffer.size();
        assertEquals(size, 1);
        assertTrue(distinctCitiesNameFromObtainedOffer.contains("warszawa"));
    }

}