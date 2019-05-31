package com.training.finalexam.finalexam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class AnimalType {

    @Enumerated(EnumType.STRING)
    @Column(name = "leg_count")
    private String legCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "terrain")
    private String terrain;

    public String getLegCount() {
        return legCount;
    }

    public void setLegCount(String legCount) {
        this.legCount = legCount;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }
}
