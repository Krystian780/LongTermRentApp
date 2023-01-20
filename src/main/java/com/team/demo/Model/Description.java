package com.team.demo.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Description {
    private int price;
    private String objectDescription;
    private String amentities;
}
