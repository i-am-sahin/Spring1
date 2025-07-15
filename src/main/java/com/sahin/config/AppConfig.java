package com.sahin.config;

import com.sahin.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
//    @Bean(name = {"com2","desktop1","Beast"})
    @Bean
    @Scope("prototype")
    public Desktop desktop(){

           return new Desktop();
    }
}
