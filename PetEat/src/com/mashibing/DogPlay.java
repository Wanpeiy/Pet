package com.mashibing;

public class DogPlay {
    public static void play(Pet pet){
        System.out.println("pet is playing");
    }

    public static void main(String[] args) {
        Pet pet=new Dog();
        play(pet);
    }
}
