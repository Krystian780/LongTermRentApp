package com.team.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class City {
    private int id;
    private String name;
    private String province;

    @Column
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

}
