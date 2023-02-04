package com.team.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name="Offers")
public class Offer {
    private int id;
    private String offerName;
    private Description description;

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

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Description.class)
    @JoinColumn(name="city_id")
    public Description getDescription() {
        return description;
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
}
