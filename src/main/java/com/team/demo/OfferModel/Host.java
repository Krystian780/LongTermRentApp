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
public class Host{

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String firstName;
    private String secondName;


}
