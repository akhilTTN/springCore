package com.spring.demo;

/**
 * Created by akhil on 28/3/17.
 */
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("This is a normal tea");
    }
}
