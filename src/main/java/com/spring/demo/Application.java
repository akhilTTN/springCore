package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
       /* Database database = applicationContext.getBean(Database.class);
        System.out.println(database);
        database.setName("Oracle");
        database.setPort("8080");
        System.out.println(database);*/

        Restaurant restaurant = applicationContext.getBean("autowireDrink",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
        System.out.println(applicationContext.isPrototype("autowireDrink"));
        System.out.println(applicationContext.isSingleton("autowireDrink"));

        /*Complex complex=applicationContext.getBean(Complex.class);
        System.out.println(complex.getList());
        System.out.println(complex.getMap());
        System.out.println(complex.getSet());*/

    }
}
