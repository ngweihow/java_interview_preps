package com.company.Itemlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

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
    public void print(List<Item> itemList, int itemCount) {
        char arrow = sorted ? 'v': '^';

        System.out.println("Number :               ID                |    Name "+arrow+" |   Quantity    ");
        IntStream.range(0, itemCount).forEachOrdered(n -> {
            String name = itemList.get(n).getName();
            String id = itemList.get(n).getId();
            int quantity = itemList.get(n).getQuantity();
            System.out.println(n + ": " + id + " | "+ name + " | " + quantity);

        });
    }
}
