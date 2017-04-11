package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by akhil on 12/4/17.
 */
@Configuration
public class SpringAppConfiguration {
    @Bean
    Tea tea(){
        Tea tea = new Tea();
        return tea;
    }
    @Bean
    Restaurant restaurant(){
        Restaurant restaurant = new Restaurant();
        restaurant.setHotDrink(new Tea());
        return restaurant;
    }
}
