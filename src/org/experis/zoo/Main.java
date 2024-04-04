package org.experis.zoo;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Pippo"), new LittleSparrow("Jack"), new Eagle("Mike"), new Dolphin("Flipper")};
        for (Animal animal : animals) {
            System.out.println("Il mio nome è: " + animal.getName());
            animal.makeNoise();
            animal.sleep();
            animal.eat();
            if (animal instanceof CanFly) {
                faiVolare((CanFly) animal);
            }
            if (animal instanceof CanSwim) {
                faiNuotare((CanSwim) animal);
            }
            System.out.println("----------");

        }
    }
    public static void faiVolare(CanFly animale) {
        animale.fly();
    }

    public static void faiNuotare(CanSwim animale) {
        animale.swim();
    }
}
