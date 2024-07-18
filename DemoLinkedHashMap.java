package apjfsa;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {

    public static void main(String[] args) {
        // Creating a LinkedHashMap to store country codes with country names as keys
        LinkedHashMap<String, Integer> countryCodes = new LinkedHashMap<String, Integer>();
        
        // Adding country code for United States
        countryCodes.put("US", 1);
        // Adding country code for India
        countryCodes.put("India", 91);
        // Adding country code for Australia
        countryCodes.put("Australia", 61);
        // Adding country code for China
        countryCodes.put("China", 86);
        // Adding country code for Pakistan
        countryCodes.put("Pakistan", 92);
        
        // Printing the entire LinkedHashMap which maintains the insertion order
        System.out.println(countryCodes);
        
        // Printing only the values (country codes) of the LinkedHashMap
        System.out.println(countryCodes.values());
    }
}
