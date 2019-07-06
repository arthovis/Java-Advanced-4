package com.collectionsList;

import com.Printer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class collectionsList {
    public static void main(String[] args) {
        //create a list
        List<String> countries = new ArrayList<>();
        //add items
        countries.add("England");
        countries.add("Spain");
        countries.add("Italy");
        countries.add("China");
        countries.add("Korea");
        System.out.println("Before: ");
        Printer.printList(countries);
        //remove 1 item and print the list
        countries.remove("Korea");
        System.out.println("\nAfter: ");
        Printer.printList(countries);
        //if Spain exists, then print "ola"
        if (countries.contains("Spain")){
            System.out.println("\nOla!");
        }
        //print the list size
        System.out.println("Number of countries: "+countries.size());
        //print the 2nd item in the list
        String spain = countries.get(1);
        System.out.println(spain);
        //print the index of Italy
        System.out.println("Index of Italy: "+countries.indexOf("Italy"));

        //iterate using list iterator
        Iterator<String> iterator = countries.iterator();

        //print countries using iterator
        while (iterator.hasNext()){
            String nextCountry = iterator.next();
            System.out.println(nextCountry+" "+nextCountry.toUpperCase());
        }
    }


}
