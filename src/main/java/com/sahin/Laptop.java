package com.sahin;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Object Created!");
    }
    @Override
    public void compiling(){
        System.out.println("Compiling Using Laptop!");
    }

}
