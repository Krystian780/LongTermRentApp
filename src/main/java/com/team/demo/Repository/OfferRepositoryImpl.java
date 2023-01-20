package com.team.demo.Repository;

import com.team.demo.Model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface OfferRepositoryImpl extends JpaRepository<Offer, Long> {


}
