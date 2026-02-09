package com.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set1=new HashSet();// writing the query with less frequency
        set1.add("Upasana");
        set1.add("David");
        set1.add("Virat");
        set1.add("Upasana");
        set1.add("Dhoni");
        set1.add("Sharma");
        System.out.println(set1);

        Set<String> set2=new TreeSet();// more read and less write frequency
        set2.add("Upasana");
        set2.add("David");
        set2.add("Virat");
        set2.add("Upasana");
        set2.add("Dhoni");
        set2.add("Sharma");
        System.out.println(set2);


    }
}
