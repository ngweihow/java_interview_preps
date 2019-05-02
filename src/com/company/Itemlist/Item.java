package com.company.Itemlist;

import java.util.UUID;

public class Item {

    private String name;
    private String id;
    private int quantity;
    private long date;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        date = System.currentTimeMillis() / 1000L;
        id = UUID.randomUUID().toString();
    }


    /**
     * Getter and Setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
