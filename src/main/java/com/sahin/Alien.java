package com.sahin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    private int age;
//    private Laptop lap;

    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
//        System.out.println("Setting the Age");
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop laptop) {
//        this.lap = laptop;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Alien(){
        System.out.println("Alien Object Created!");

    }

    public Alien(int age){
        this.age = age;
//        System.out.println("Para Constructor Called!");
    }

    @ConstructorProperties({"age","lap"})
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.com = lap;
    }

    void code(){
        System.out.println("Coding!");
        com.compiling();
    }
}
