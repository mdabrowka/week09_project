package com.example.marta.mariosrestaurant.dishes;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Drink extends MenuItem {
    private String name;
    private int price;
    private ArrayList<Ingredient> ingredients;


    public Drink(String name, int price) {
        super(name, price);
        this.ingredients = new ArrayList<Ingredient>();
    }

}
