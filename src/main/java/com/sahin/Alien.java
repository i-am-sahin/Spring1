package com.sahin;

import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;


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

    public Alien(int age){
        this.age = age;
        System.out.println("Para Constructor Called!");
    }

    @ConstructorProperties({"age","lap"})
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    void code(){
        System.out.println("Coding!");
        lap.compiling();
    }
}
