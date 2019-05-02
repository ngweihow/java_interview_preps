package com.company.Itemlist;

import java.util.List;

public interface SortBy {

    /**
     * Sort the list accordingly.
     * @param list List of Item objects to be rearranged.
     */
    void sortListBy(List<Item> list);

    void print(List<Item> list, int itemCount);
}
