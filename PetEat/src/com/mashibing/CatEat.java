package com.mashibing;

public class CatEat {
    public static void show(Pet pet){
        System.out.println("pet is eating");
    }

    public static void main(String[] args) {
        Pet pet=new Cat();
        show(pet);
    }
}
