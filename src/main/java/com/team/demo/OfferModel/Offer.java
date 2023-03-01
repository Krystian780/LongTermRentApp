package com.team.demo.OfferModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Data
public class Offer {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String offerName;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = UserData.class)
    private UserData userData;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = Description.class)
    private Description description;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = City.class)
    private City city;
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Amenity.class)
    private List<Amenity> amenities;

}
