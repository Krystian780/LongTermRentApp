package com.team.demo.Controller;

import com.team.demo.Model.Offer;
import com.team.demo.Service.OfferAdder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController {

    @Autowired
    OfferAdder offerAdder;

    @PostMapping("/employees")
    public Offer offer(@RequestBody Offer offer) {
        offerAdder.addOffer(offer);
        return offer;
    }




}
