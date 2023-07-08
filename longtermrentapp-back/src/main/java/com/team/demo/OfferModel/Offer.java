package com.team.demo.OfferModel;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Data
@ToString
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
    @ElementCollection(targetClass = Amenity.class)
    @CollectionTable
    @Enumerated(EnumType.STRING)
    private List<Amenity> amenities;

}
