package org.experis.zoo;

public abstract class Animal {
    // attributi
    private String name;

    // costruttore
    public Animal(String name) {
        this.name = name;
    }
    // getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //metodi
    public void sleep() {
        System.out.println("zzzZZZzzzZZZ");
    }

    public abstract void makeNoise();
    public abstract void eat();


}
