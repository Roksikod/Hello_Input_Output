package serealizationDeserealization;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private String breed;
    private float weigth;
    public Cat(String name, String breed, float weigth) {
        this.name = name;
        this.breed = breed;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }
}
