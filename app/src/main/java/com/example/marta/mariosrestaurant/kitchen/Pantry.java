package com.example.marta.mariosrestaurant.kitchen;

import com.example.marta.mariosrestaurant.dishes.Ingredient;
import com.example.marta.mariosrestaurant.dishes.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by marta on 20/11/2017.
 */

public class Pantry {
    //private ArrayList<Ingredient> pantry;
    private HashMap<MenuItem, Integer> stock;


    public Pantry() {
       // this.pantry = new ArrayList<Ingredient>();
        this.stock = new HashMap<MenuItem, Integer>();
    }


    public void addToStock(MenuItem item, Integer integer) {
        stock.put(item, integer);
    }


}
