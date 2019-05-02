/**
 * Catalogue file to represent the list of items.
 */
package com.company.Itemlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Catalogue {

    protected static final String[] ITEM_TYPES = { "Bottle", "Book", "Shirt", "Phone", "Hat", "Tool", "Camera", "Art" };
    protected static final int MAX_ITEMS = 100;
    protected static final int MAX_QUANTITY = 1000;

    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        Random random = new Random();
        int itemCount = random.nextInt(MAX_ITEMS);

        IntStream.range(0, itemCount).forEachOrdered(n -> {
            // Generate random Item object
            int randIndex = random.nextInt(ITEM_TYPES.length);
            Item item = new Item(ITEM_TYPES[randIndex], random.nextInt(MAX_QUANTITY));
            itemList.add(item);
        });

        // Print header


        IntStream.range(0, itemCount).forEachOrdered(n -> {
            String name = itemList.get(n).getName();
            String id = itemList.get(n).getId();
            int quantity = itemList.get(n).getQuantity();
            System.out.println(n + ": " + id + " | "+ name + " | " + quantity);

        });
    }
}
