package com.sahin;

import org.springframework.stereotype.Component;


public class Alien {
    private int age;
    private Laptop lap;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Setting the Age");
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop laptop) {
        this.lap = laptop;
    }

    public Alien(){
        System.out.println("Object Created!");

    }

    void code(){
        System.out.println("Coding!");
        lap.compiling();
    }
}
