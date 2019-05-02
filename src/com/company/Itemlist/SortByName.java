package com.company.Itemlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements SortBy{
    boolean sorted =  false;

    @Override
    public void sortListBy(List<Item> list) {
        if(!sorted) {
            list.sort(Comparator.comparing(Item::getName));

        } else {
            list.sort(Comparator.comparing(Item::getName).reversed());
        }
    }

    @Override
    public void print(List<Item> list) {
        char arrow = sorted ? 'v': '^';

        System.out.println("Number :               ID                |    Name "+arrow+" |   Quantity    ");

    }
}
