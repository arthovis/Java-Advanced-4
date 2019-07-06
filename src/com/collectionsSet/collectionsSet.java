package com.collectionsSet;

import com.Printer;

import java.util.HashSet;
import java.util.Set;

public class collectionsSet {
    public static void main(String[] args) {
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Berlin");
        travelRoute.add("Madrid");
        travelRoute.add("Berlin");

        Printer.printSet(travelRoute);

    }
}
