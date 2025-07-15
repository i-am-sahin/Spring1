package com.sahin;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("com2") // You can also Specify the bean name in ()
@Primary
public class Desktop implements Computer{
    public Desktop (){
        System.out.println("Desktop Object Created!");
    }
    @Override
    public void compiling(){
        System.out.println("Compiling Using Desktop!");
    }
}
