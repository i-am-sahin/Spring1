package com.sahin;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Object Created!");
    }
    @Override
    public void compiling(){
        System.out.println("Compiling Using Laptop!");
    }

}
