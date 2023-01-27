package com.team.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
import java.util.HashMap;

@Data
@AllArgsConstructor
public class Author {
    private int id;
    private String name;
    private String surname;
    private int age;
    private int ID;
    private Date brithDate;
    private HashMap<String, Integer> reviews;




}
