package org.experis.zoo;

public class Dolphin extends Animal{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("eee-oww-eee");
    }

    @Override
    public void eat() {
        System.out.println("Sono " + super.getName() + " e mangio pesci e molluschi");
    }
}
