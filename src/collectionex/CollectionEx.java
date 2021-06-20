/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mohamed Ahmed
 */
public class CollectionEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<City> city;
        List<Country> country;
        ReadFromFile R = new ReadFromFile();
        city = R.readFileCity("H:\\ITI\\Java\\Assignment\\newCities.csv");
        country = R.ReadFileCountry("H:\\ITI\\Java\\Assignment\\newCountries.csv");
        city.sort(Comparator.comparing(City::getCity_pop).reversed());
        Map<String , List<City>> CoandCi =new HashMap<>();
        for(Country co:country){
            List<City> s =new ArrayList<>();
            for(City c:city){
                if(co.getCountry_id().equals(c.getCo_id())){
                    s.add(c);
                }
            } 
            CoandCi.put(co.getCountry_id(), s);
        }
//        CoandCi.forEach((k,v)->System.out.println("Key is "+k+" Value is"+v));
        
        StreamAPI_Ex a = new StreamAPI_Ex();
        System.out.println(a.HP_City(CoandCi));
        System.out.println(a.HP_Capital(city));
    }
    
}
