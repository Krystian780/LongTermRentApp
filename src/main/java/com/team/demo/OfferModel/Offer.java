package com.team.demo.OfferModel;

import com.team.demo.UserDataModel.UserData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
    private LocalDate localDate;
    private String offerName;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = Description.class)
    private Description description;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = City.class)
    private City city;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = UserData.class)
    private UserData userData;
    @ElementCollection(targetClass = Amenity.class)
    @CollectionTable
    @Enumerated(EnumType.STRING)
    private List<Amenity> amenities;

}
