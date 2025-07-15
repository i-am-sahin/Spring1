package com.sahin;

import com.sahin.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//           Crating Bean container using Java Based Configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);




        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

//        Desktop dt = context.getBean("desktop",Desktop.class);
//        dt.compiling();
//        Desktop dt2 = context.getBean("desktop",Desktop.class);
//        dt.compiling();

//        System.out.println(dt == dt2); // false --> Both are not Single Object













//        System.out.println( "Hello World!" );
//        Alien alien = new Alien();
//        alien.code();


        //Creating Container that stores bean Using XML
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml"); //There is a different way to configuring Spring Project And one of the way is XML
////        Alien a2 = (Alien) applicationContext.getBean("alien");  // applicationContext.getBean --> Returns Object, so we've to typecast this.
//        Alien a2 =  applicationContext.getBean("alien",Alien.class);
//        a2.code();
//        System.out.println(a2.getAge());
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
