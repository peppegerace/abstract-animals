package org.experis.zoo;

public class LittleSparrow extends Animal {
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
}
