
package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMaps {

   
    public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    capitalCities.put("Sweden","Göteborg");
    //Copying capitalCities to capitalCities2
   HashMap<String, String> capitalCities2 = new HashMap<>(capitalCities);
   int hashNumber = capitalCities.hashCode();
   int hashNr2 = capitalCities2.hashCode();
    System.out.println(hashNumber);
    System.out.println(hashNr2);
    System.out.println("capitalCities2 " + capitalCities2);
    //************ The manual way***************And below - the lambda way*******
   /* for (String i : capitalCities.keySet()) {
    System.out.println(i);
    }*/
    capitalCities.keySet().forEach((i) -> {    
        System.out.println(i);
        });
    
    capitalCities.values().forEach((i) -> {
        System.out.println(i);
        });
    
    capitalCities.keySet().forEach((i) -> {
        System.out.println("key: " + i + " value: " + capitalCities.get(i));
        });
   
   
    }
     public static List<String> transform(List<List<String>> l){
        // platta ut en lista av listor av strings
         return l.stream().flatMap(value -> value.stream()).collect(Collectors.toList());
    }
   
     
}
