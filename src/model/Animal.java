package model;

import org.junit.Test;

public class Animal {

    protected int name;
    void sound() {
        System.out.println("animal can make a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof " + name);
    }
}

class Duck extends Animal {
    //@Override
    @Test
    void sound() {
        System.out.println("кря-кря");
    }
}

 class TestPolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Duck();

//        myAnimal.sound();
//        myDog.sound();
//        myCat.sound();
    }
}

