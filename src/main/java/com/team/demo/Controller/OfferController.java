package com.team.demo.Controller;

import com.team.demo.OfferModel.City;
import com.team.demo.OfferModel.Offer;
import com.team.demo.OfferModel.User;
import com.team.demo.Service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class OfferController {
    @Autowired
    private OfferService offerRepository;

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        offerRepository.addOffer(offer);
        return offer;
    }


    @PostMapping("/offer/add")
    public Offer addOffer(@RequestBody Offer offer) {
        offerRepository.addOffer(offer);
        return offer;
    }

    @RequestMapping(value = "/offers", produces = "application/json")
    public List<Offer> getOffers() {
        return offerRepository.getOffers();
    }

    @RequestMapping(value = "/cities", produces = "application/json")
    public List<City> getCities() {
        return offerRepository.getCities();
    }

    @RequestMapping(path="/offers/cities")
    @ResponseBody
    public List<Offer> offers(@RequestParam String city){
        return offerRepository.getOffersForGivenCity(city);
    }

}
