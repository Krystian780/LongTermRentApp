package com.team.demo.OfferModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Data
public class Description {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private int price;
    private String title;
    private String objectDescription;

}
