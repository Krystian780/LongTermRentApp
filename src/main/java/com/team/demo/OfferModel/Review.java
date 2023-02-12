package com.team.demo.OfferModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Review {
    private int id;
    private String review;
    private int mark;

    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Column
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
