package com.HashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(101,"Amit");
        map.put(102,"Vijay");
        map.put(103,"Rahul");

     //   map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

          map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()));


        // for (Map.Entry map1 : map.entrySet()){
//     System.out.println(map1.getKey() + " " +map1.getValue() );
// }
//
    }
}
