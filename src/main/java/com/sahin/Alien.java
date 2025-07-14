package com.sahin;

import org.springframework.stereotype.Component;


public class Alien {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Setting the Age");
    }

    public Alien(){
        System.out.println("Object Created!");

    }

    void code(){
        System.out.println("Coding!");
    }
}
