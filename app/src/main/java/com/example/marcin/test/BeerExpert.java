package com.example.marcin.test;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("bursztynowe")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }

/*    fun getBrands(color: String): List<String> {
        val brands = ArrayList<String>()
        if (color == "bursztynowe") {
            brands.add("Jack Amber")
            brands.add("Red Moose")
        } else {
            brands.add("Jail Pale Ale")
            brands.add("Gout Stout")
        }
        return brands
    }*/
}
