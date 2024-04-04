package org.experis.zoo;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("wolf");
    }

    @Override
    public void eat() {
        System.out.println("Sono " + super.getName() + " e mangio croccantini");
    }
}
