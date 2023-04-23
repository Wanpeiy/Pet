package com.mashibing;

public class Dog extends Pet {
    private String eat;

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public Dog(String name, int age, String eat) {
        super(name, age);
        this.eat = eat;
    }
}
