package com.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Example {

Comparator<Employee> idComparator = new Comparator<Employee>() {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId()-o2.getId();
    }
};
Comparator<Employee> nameComparator = new Comparator<Employee>() {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
};
    public static void main(String[] args) {

        Example example = new Example();

        TreeMap <Employee,String> map = new TreeMap<>(example.idComparator);

        map.put(new Employee(104,"Sam"), "First-Entry");
        map.put(new Employee(105,"Steve"), "Second-Entry");
        map.put(new Employee(101,"Allen"), "Third");
        map.put(new Employee(103, "Scott"),"Fourth");
        map.put(new Employee(102,"John"),"Fifth");

        System.out.println(map);


        TreeMap <Employee,String> map1 = new TreeMap<>(example.nameComparator);

        map1.put(new Employee(104,"Sam"), "First-Entry");
        map1.put(new Employee(105,"Steve"), "Second-Entry");
        map1.put(new Employee(101,"Allen"), "Third");
        map1.put(new Employee(103, "Scott"),"Fourth");
        map1.put(new Employee(102,"John"),"Fifth");

        System.out.println(map1);
    }
}
