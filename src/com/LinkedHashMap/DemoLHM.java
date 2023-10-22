package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;


public class DemoLHM {

   static Map<String,Object> map;
    static  private void learnLHM(){

        map = new LinkedHashMap<>();
        map.put("Name","Shubham");
        map.put("ID",102);
        map.put("Department","Testing");
        map.put("Designation","QA");
        map.put("Permanent",true);
        map.put("Age",27);
        map.put("Salary",4.8);

        for (Map.Entry<String,Object> m:map.entrySet()){

            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }

    public static void main(String[] args) {
        learnLHM();
    }
}
