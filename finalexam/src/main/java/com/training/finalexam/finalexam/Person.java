package com.training.finalexam.finalexam;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity

public class Person {
    @Column(name ="name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private String age;

    private String petList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPetList() {
        return petList;
    }

    public void setPetList(String petList) {
        this.petList = petList;
    }
}
