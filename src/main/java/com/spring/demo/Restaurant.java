package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by akhil on 28/3/17.
 */
public class Restaurant {

    @Autowired
    HotDrink hotDrink;

    public Restaurant() {
    }

    //    @Autowired
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    /*@Autowired
    @Required*/
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
