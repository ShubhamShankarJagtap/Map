package com.TreeMap;


import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap  {

    static Map<Integer,String> map;

    static private void learnTM(){

        map = new TreeMap<>();

        map.put(106,"Akhilesh");
        map.put(103,"Steve");
        map.put(105,"Abdul");
        map.put(101,"Shubham");
        map.put(104,"Jenny");
        map.put(102,"kim");

        System.out.println(map);


        TreeMap<String,Integer> next = new TreeMap<>();

        next.put("Akhilesh",106);
        next.put("Steve",103);
        next.put("Abdul",105);
        next.put("Shubham",101);
        next.put("Jenny",104);
        next.put("Kim",102);

        System.out.println(next);

        System.out.println(next.ceilingEntry("Sam"));    //  Prints the key-value pair of a Higher key.

        System.out.println(next.firstEntry());                          // prints the first key-value pair.

        System.out.println(next.floorEntry("Man"));      //prints the key-value pair of a lower key.

        System.out.println(next.headMap("Steve"));   // prints all key value pairs with a lower key.

        System.out.println(next.higherKey("Kim"));      // prints immediate key with a high key & if not present, then it will print null.

        System.out.println(next.keySet());                // It will print all the keys.

        System.out.println(next.lastEntry());         // It Will print the last key-value pair.

        System.out.println(next.pollFirstEntry());   // It will print the first key-value pair and removes that pair from a map.

        System.out.println(next.pollLastEntry());     // It will print the last key-value pair and removes that pair from the map.

        System.out.println(next.size());                 // It will print the size of a map.

        System.out.println(next.subMap("Jenny","Shubham"));

    }

    public static void main(String[] args) {

        learnTM();

    }
}
