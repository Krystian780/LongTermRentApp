package com.team.demo.Controller;

import com.team.demo.Model.City;
import com.team.demo.Model.Offer;
import com.team.demo.Service.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OfferController {

    @Autowired
    OfferRepository offerRepository;

    @PostMapping("/employees")
    public Offer offer(@RequestBody Offer offer) {
        offerRepository.addOffer(offer);
        return offer;
    }

    @RequestMapping(value = "/employees", produces = "application/json")
    public List<Offer> getOffers() {
        return offerRepository.getOffers();
    }

    @RequestMapping(value = "/cities", produces = "application/json")
    public List<City> getCities() {
        return offerRepository.getCities();
    }

}
