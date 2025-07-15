package com.sahin.config;

import com.sahin.Alien;
import com.sahin.Computer;
import com.sahin.Desktop;
import com.sahin.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.sahin")
public class AppConfig {

//    @Bean
//    public Alien alien(@Autowired  Computer com) // @Qualifier("desktop") -->Use qualifier to tell which bean spring had choose! If we Mention Both Qualifier and Primary then  Spring Chooses Qualifier over Primary
//    {
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//
////    @Bean(name = {"com2","desktop1","Beast"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//
//           return new Desktop();
//    }
//        @Bean
//        @Primary
//    public Laptop laptop(){
//
//        return new Laptop();
//    }
}
