package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Problem3 {
    public static void main(String[] args) {

        Date d1 = new Date(9, 24, 2002);
        Date d2 = new Date(10, 21, 2005);
        Date d3 = new Date(9, 21, 2003);
        Date d4 = new Date(9, 30, 2002);

        TreeMap<Date, String> syllabus = new TreeMap<>();
        syllabus.put(d1, "Java");
        syllabus.put(d2, "Phyton");
        syllabus.put(d3, "C++");
        syllabus.put(d4, "Javascript");

        for(Map.Entry<Date, String> entry: syllabus.entrySet()){
            if(entry.getKey().month == 9 && entry.getKey().year == 2002)
                System.out.println(entry.getValue());
        }

    }
}
