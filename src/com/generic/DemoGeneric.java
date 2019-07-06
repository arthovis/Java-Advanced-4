package com.generic;

import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("ana");
        names.add("alex");
        System.out.println(names);
        names.add(2);
        System.out.println(names);
        names.add(new Car());
        System.out.println(names);

        List<String> genericNames = new ArrayList();
        genericNames.add("ana");
        genericNames.add("alex");
//        genericNames.add(2);
//        genericNames.add(new Car());

        ToyCar toyCar = new ToyCar();
        GenericBox<ToyCar> boxWithToyCar = new GenericBox<>(toyCar);

        List<String> names2 = new ArrayList<>();
        names2.add("Alex");

    }
}

class Car{
    private String brand;
}