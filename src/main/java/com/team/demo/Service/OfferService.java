package com.team.demo.Service;

import com.team.demo.OfferModel.City;
import com.team.demo.OfferModel.Offer;
import com.team.demo.Repository.OfferRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class OfferRepository {
    @Autowired
    private OfferRepositoryImpl offerRepository;

    public void addOffer(Offer offer){
        offerRepository.save(offer);
    }

    public void removeOffer(Offer offer){
        offerRepository.delete(offer);
    }

    public List<Offer> getOffers(){
        return offerRepository.findAll();
    }

    public List<City> getCities(){
        List<Offer> offers = offerRepository.findAll();
        return offers.stream()
                .map(Offer::getCity)
                .collect(Collectors.toList());
    }

    public List<Offer> getOffersForGivenCity(String city){
        return offerRepository.findAll().stream()
                .filter(offer -> offer.getCity().getName().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

}
