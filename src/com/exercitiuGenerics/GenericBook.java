package com.exercitiuGenerics;

public class GenericBook<T> {
    private T item;

    public GenericBook(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
