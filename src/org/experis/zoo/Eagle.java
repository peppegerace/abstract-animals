package org.experis.zoo;

public class Eagle extends Animal{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("keee-aaah");
    }

    @Override
    public void eat() {
        System.out.println("Sono " + super.getName() + " e mangio piccoli mammiferi");
    }
}
