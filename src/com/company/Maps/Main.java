package com.company.Maps;

import java.nio.charset.Charset;
import java.util.*;

/**
 * Class to revise on different types of maps and strategy pattern
 */

public class Main {

    public static final int STOCKCHART_TYPES = 3;

    public static void main(String[] args) {


        StockChart stockChart = new StockChart();

        List<IStockManager> iStockManagers = new ArrayList<>();
        iStockManagers.add(new UnsortedStockList());
        iStockManagers.add(new SortedStockList());
        iStockManagers.add(new HistoricalStockList());

        // Printing out stock "first" items
        for(IStockManager iStockManager: iStockManagers) {
            String print = iStockManager.getFirstStockItem(stockChart);
            System.out.println(iStockManager.getClass().getSimpleName() + ": " + print);
        }

    }



    private static class StockChart{
        public static final int DATA_CAP = 100;
        public static final int KEY_MAX = 8;

        private List<String> names = new ArrayList<>();

        public StockChart(){

            for(int i=0;i<DATA_CAP;i++) {

                // Random Key
                byte[] str = new byte[KEY_MAX];
                new Random().nextBytes(str);
                String randomString = new String(str, Charset.forName("UTF-8"));

                // Add them into ArrayList
                names.add(randomString);
            }
        }

        public List<String> getNames() {
            return names;
        }

    }


    /**
     * Interface to test the difference between the maps
     */
    public interface IStockManager {

        String getFirstStockItem(StockChart stockChart);
    }

    private static class UnsortedStockList implements IStockManager {

        public UnsortedStockList() {

        }

        @Override
        public String getFirstStockItem(StockChart stockChart) {
            List<String> stockNames = stockChart.getNames();
            Map<String, Integer> hashMap = new HashMap<>();


            // Adding to map
            for(String name: stockNames){
                // Add to map if never seen
                if(!hashMap.containsKey(name)) {
                    hashMap.put(name, 1);
                }
                // Update value if already seen
                else {
                    hashMap.put(name, hashMap.get(name) + 1);
                }
            }

            List<String> keys = new ArrayList<>(hashMap.keySet());

            return keys.get(0);
        }
    }

    private static class SortedStockList implements IStockManager {

        public SortedStockList() {

        }

        @Override
        public String getFirstStockItem(StockChart stockChart) {
            List<String> stockNames = stockChart.getNames();
            Map<String, Integer> treeMap = new TreeMap<>();


            // Adding to map
            for(String name: stockNames){
                // Add to map if never seen
                if(!treeMap.containsKey(name)) {
                    treeMap.put(name, 1);
                }
                // Update value if already seen
                else {
                    treeMap.put(name, treeMap.get(name) + 1);
                }
            }

            List<String> keys = new ArrayList<>(treeMap.keySet());

            return keys.get(0);
        }
    }

    private static class HistoricalStockList implements IStockManager {

        public HistoricalStockList() {

        }

        @Override
        public String getFirstStockItem(StockChart stockChart) {
            List<String> stockNames = stockChart.getNames();
            Map<String, Integer> linkedHashMap = new LinkedHashMap<>();


            // Adding to map
            for(String name: stockNames){
                // Add to map if never seen
                if(!linkedHashMap.containsKey(name)) {
                    linkedHashMap.put(name, 1);
                }
                // Update value if already seen
                else {
                    linkedHashMap.put(name, linkedHashMap.get(name) + 1);
                }
            }

            List<String> keys = new ArrayList<>(linkedHashMap.keySet());

            return keys.get(0);
        }
    }
}
