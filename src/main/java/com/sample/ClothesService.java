package com.sample;
import com.sample.model.ClothesType;

import java.util.ArrayList;
import java.util.List;
public class ClothesService {
    public List getAvailableBrands(ClothesType type){

        List brands = new ArrayList();

        if(type.equals(ClothesType.COMFORT)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));

        }else if(type.equals(ClothesType.SPORT)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");

        }else if(type.equals(ClothesType.CLASSIC)){
            brands.add("Corona");

        }else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}
