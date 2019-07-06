package com.exercitiuGenerics;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    public static void main(String[] args) {
        WhateverBook whateverBook = new WhateverBook();
        GenericBook<WhateverBook> shelf = new GenericBook<>(whateverBook);
        shelf.setItem(new WhateverBook());

        List<String> bookNames = new ArrayList<>();
        bookNames.add("Lord of the Rings");
        bookNames.add("The Wheel of Time");
        System.out.println(bookNames);


    }
}
