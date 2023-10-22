package com.Hashtable;

import java.util.Hashtable;

public class Demo {
    Hashtable<Integer,String> ht;
    void learn(){
        ht=new Hashtable<>();
        ht.put(106,"shubham");
        ht.put(102,"kamal");
        ht.put(108,"ravi");
        ht.put(117,"rahul");

        System.out.println(ht);

    }

    public static void main(String[] args) {
        new Demo().learn();
    }
}
