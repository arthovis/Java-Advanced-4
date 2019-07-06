package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapStuff {
    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();
        countries.put("Poland","Warsaw");
        countries.put("Germany","Berlin");
        printMap(countries);
        String capitalOfPoland = countries.get("Poland");
        System.out.println(capitalOfPoland);

//        countries.remove("Poland");
        System.out.println(countries.values());
        System.out.println(countries.keySet());
        System.out.println("------------------------");
        System.out.println("Mai jos ruleaza metoda compareMaps: \n");
        compareMaps();
    }

    // print map elements
    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String,String> entry:map.entrySet()) {
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.printf("%s : %s\n",country,capital);
        }
    }

    private static void compareMaps(){
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Poland","Warsaw");
        hashMap.put("Germany","Berlin");
        printMap(hashMap);

        System.out.println("************************");

        Map<String, String> treeMap = new TreeMap<>(); //-----> sorteaza inputul
        treeMap.put("Poland","Warsaw");
        treeMap.put("Germany","Berlin");
        printMap(treeMap);
    }

}
