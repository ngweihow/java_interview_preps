package com.company;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean unique = isUnique(args[0]);
        boolean perm = permuation("abc", "abdabccc");

        //System.out.println("Permuation " + perm);
//        System.out.println("Is "+ args[0] +" unique?");
//        System.out.println(unique);

        // Testing PrintThreads
        PrintThreads printThreads = new PrintThreads();
        printThreads.doPrintThreads();

        // Testing ExtendedThread
        Thread exThread = new ExtendedThread();
        exThread.start();
    }

    public static boolean isUnique(String s) {
        Map<Character, Boolean> dict = new HashMap<Character, Boolean>();
        char[] str = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(dict.containsKey(str[i])){
                return false;
            }
            dict.put(str[i], true);
        }

        return true;
    }

    // Determine if more is a permuation of less
    public static boolean permuation(String less, String more) {
        char[] lessArray = less.toCharArray();
        char[] moreArray = more.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c: lessArray) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
            }
        }

        for (char d: moreArray) {
            if (!map.containsKey(d)) {
                return false;
            }
        }

        return true;

    }
}
