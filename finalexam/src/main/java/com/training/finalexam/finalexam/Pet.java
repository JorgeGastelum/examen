package com.training.finalexam.finalexam;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Pet {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "race_name", nullable = false)
    private String raceName;

    @Column(name = "animal_type", nullable = false)
    private String animalType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
