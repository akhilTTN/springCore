package com.spring.demo;

/**
 * Created by akhil on 28/3/17.
 */
public class Restaurant {
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
