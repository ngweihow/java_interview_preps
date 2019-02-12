package com.company.Maps;

import java.util.*;

/**
 * Class to revise on different types of maps
 */

public class Main {

    public static void main(String[] args) {

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

    }



    private static class StockChart{
        public static final int DATA_CAP = 100;
        public static final int VALUE_MAX = 500;

        private ArrayList<String> names;
        private ArrayList<Integer> values;

        public StockChart(){

            for(int i=0;i<DATA_CAP;i++) {


                Random random = new Random();
                int randomInt = random.nextInt(VALUE_MAX) + 1;

                values.add(randomInt);
            }


        }
    }

}
