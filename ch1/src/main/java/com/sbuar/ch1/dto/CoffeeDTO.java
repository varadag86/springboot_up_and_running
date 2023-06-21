package com.sbuar.ch1.dto;

public class CoffeeDTO {

    private Long Id;
    private String name;

    public CoffeeDTO(String name) {
        this.name = name;
    }

    public CoffeeDTO(Long id, String name) {
        Id = id;
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
