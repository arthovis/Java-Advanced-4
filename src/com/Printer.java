package com;

import java.util.List;
import java.util.Set;

//print elements in the list
//command void type
public class Printer {
    public static void printList(List<String> list){
        //iterate with for each
        for (String item : list) {
            System.out.print(item+" ");
        }

    }

    //print elements in the set
    public static void printSet(Set<String> set){
        //iterate with for each
        for (String item : set) {
            System.out.print(item+" ");
        }

    }
}
