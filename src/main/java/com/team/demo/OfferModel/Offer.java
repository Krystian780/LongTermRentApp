package com.team.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Offer {
    private int id;
    private String offerName;
    @Enumerated(EnumType.STRING)
    private User user;
    private Description description;
    private City city;

    @Column
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = User.USER;
    }

    @Column
    public String getOfferName() {
        return offerName;
    }

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Description.class)
    @JoinColumn(name="description_id")
    public Description getDescription() {
        return description;
    }

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = City.class)
    @JoinColumn(name="city_id")
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
