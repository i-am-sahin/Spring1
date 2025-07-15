package com.sahin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Alien alien = new Alien();
//        alien.code();


        //Creating Container that stores bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml"); //There is a different way to configuring Spring Project And one of the way is XML
//        Alien a2 = (Alien) applicationContext.getBean("alien");  // applicationContext.getBean --> Returns Object, so we've to typecast this.
        Alien a2 =  applicationContext.getBean("alien",Alien.class);
        a2.code();
        System.out.println(a2.getAge());
//        a2.setAge(21);
//        System.out.println(a2.getAge());
//        Alien a3 = (Alien) applicationContext.getBean("alien");  // applicationContext.getBean --> Returns Object, so we've to typecast this.
////        a2.code();
//        System.out.println(a3.age);


                //If we are not spicing the name here, then it will start searching by type.
//        Desktop desktop =  applicationContext.getBean(Desktop.class);
//        Computer com = applicationContext.getBean(Computer.class);

    }
}
