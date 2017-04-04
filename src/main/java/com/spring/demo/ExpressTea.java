package com.spring.demo;

/**
 * Created by akhil on 28/3/17.
 */
public class ExpressTea implements HotDrink{
    @Override
    public void prepareHotDrink() {
        System.out.println("This is Express Tea");
    }
}
