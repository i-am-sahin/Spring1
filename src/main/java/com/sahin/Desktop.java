package com.sahin;


import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public Desktop (){
        System.out.println("Desktop Object Created!");
    }
    @Override
    public void compiling(){
        System.out.println("Compiling Using Desktop!");
    }
}
