package com.team.demo.OfferModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Data
public class Offer {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private LocalDate localDate;
    private String offerName;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = Description.class)
    private Description description;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = City.class)
    private City city;
    @OneToOne
    private UserData userData;
    @Enumerated
    Amenity amenity;

}
