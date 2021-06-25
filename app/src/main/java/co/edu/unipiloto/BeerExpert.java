package co.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }if (color.equals("dark")){
            brands.add("Hacker-Pschorr Dunkle Weisse");
            brands.add("Guinness");
            brands.add("Old Rasputin");
        }if (color.equals("brown")){
            brands.add("Pit Caribou Brown Ale Américaine");
            brands.add("Cigar City Cubano");
        }if (color.equals("light")){
            brands.add("Yuengling Premium");
            brands.add("Miller64");
        }
        return brands;
    }

}
