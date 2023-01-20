package com.team.demo.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.File;

@AllArgsConstructor
@Data
@Entity
public class Offer {
    private String offerName;
    private File file;
    private Author author;

}
