package com.team.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;

@Data
@AllArgsConstructor
public class Author {
    private String name;
    private String surname;
    private int age;
    private int ID;
    private Date brithDate;
    private HashMap<String, Integer> reviews;




}
