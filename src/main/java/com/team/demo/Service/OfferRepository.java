package com.team.demo.Service;

import com.team.demo.Model.Offer;
import com.team.demo.Repository.OfferRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
