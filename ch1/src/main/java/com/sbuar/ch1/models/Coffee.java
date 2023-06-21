package com.sbuar.ch1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "coffee")
public class Coffee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long Id;

    String type;

    public Long getId() {
        return Id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(
                "Coffee[id=%d, type='%s']",
                Id, type);
    }
}
