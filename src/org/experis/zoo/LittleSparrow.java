package org.experis.zoo;

public class LittleSparrow extends Animal implements CanFly{
    public LittleSparrow(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("chip-chip");
    }
    @Override
    public void eat() {
        System.out.println("Sono " + super.getName() + " e mangio semi ed insetti");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!!!");
    }
}
