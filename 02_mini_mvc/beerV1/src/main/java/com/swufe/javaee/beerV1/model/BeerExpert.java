package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<Beer> getBrands(String color) {
        List<Beer> brands = new ArrayList<>();

        if (color.equals("amber")) {
            brands.add(new Beer("1917","wine","detail123156"));
            brands.add(new Beer("1587","Red Moose","detail1566165"));
        } else {
            brands.add(new Beer("1651","Jali Pale Ale","detail156166522368"));
            brands.add(new Beer("1999","Gout Stout","detail115615"));
        }
        return brands;
    }
}
