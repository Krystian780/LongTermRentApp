package com.team.demo.OfferModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Offer {
    private int id;
    private String offerName;
    private Description description;
    private City city;

    @Column
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    @Column
    public String getOfferName() {
        return offerName;
    }

    @OneToOne(cascade = CascadeType.ALL, targetEntity = Description.class)
    public Description getDescription() {
        return description;
    }

    @OneToOne(cascade = CascadeType.ALL, targetEntity = City.class)
    public City getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public void setCity(City city) {
        this.city = city;
    }


}
