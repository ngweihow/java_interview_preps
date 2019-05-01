package com.company.Generics;

public class GenericObj<T> {

    private T t;

    // Constructor
    public GenericObj(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
