package com.team.demo.Service;

import com.team.demo.OfferModel.City;
import com.team.demo.OfferModel.Offer;
import com.team.demo.Repository.OfferRepository;
import com.team.demo.Testing.TestingObjectCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;
    @Autowired
    private TestingObjectCreator testingObjectCreator;

    public void addOffer(Offer offer) {
        offer.setLocalDate(LocalDate.now());
        offerRepository.save(offer);
    }

    public void removeOffer(Offer offer) {
        offerRepository.delete(offer);
    }

    public List<Offer> getOffers() {
        return offerRepository.findAll();
    }

    public List<City> getCities() {
        return offerRepository.findAll().stream()
                .map(Offer::getCity)
                .collect(Collectors.toList());
    }

    public List<Offer> getOffersForGivenCity(String city) {
        return offerRepository.findAll().stream()
                .filter(offer -> offer.getCity().getName().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Offer> sortDescendingByPrice(String city) {
        return getOffersForGivenCity(city).stream()
                .sorted(Comparator.comparing(offer -> offer.getDescription().getPrice()))
                .collect(Collectors.toList());
    }

    public List<Offer> getOffersWithMaximumPriceSetByUser(int price) {
        return offerRepository.findAll().stream()
                .filter(offer -> offer.getDescription().getPrice()<=price)
                .collect(Collectors.toList());
    }

    //TESTING TESTING OBJECT

    public List<Offer> getOffersForGivenCityTestWithouDatabase(String city) {
        return getAllTestingOffers().stream()
                .filter(offer -> offer.getCity().getName().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public void addOfferToTestingList(Offer offer){
        testingObjectCreator.addOffer(offer);
    }

    public List<Offer> getAllTestingOffers(){
        return testingObjectCreator.getOffers();
    }

}
