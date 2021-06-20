/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Mohamed Ahmed
 */
public class StreamAPI_Ex {
    public Map<String , List<String>> HP_City (Map<String , List<City>> allOfCities){
        Map<String, List<String>> result = allOfCities
            .entrySet().stream()                    // Stream over entry set
            .collect(Collectors.toMap(              // Collect final result map
                Map.Entry::getKey,                  // Key mapping is the same
                e -> e.getValue().stream().limit(1)          // Stream over list
                    .map(City::getCity_name)         // Apply mapping to MyObject
                    .collect(Collectors.toList()))  // Collect mapping into list
                );
        return result;
    }
    public String HP_Capital(List<City> cities){
        String result = cities.stream().filter(c -> c.isIsCapital()).findFirst().get().getCity_name();
        return result ;
    }
}
