package com.company;

import java.util.*;

class Problem1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(2);
        integers.add(3);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(20);
        

        Iterator iterator = integers.iterator();

        int sum = 0;
        Iterator<Integer>  iter = integers.iterator();
        while ( iter.hasNext() ) {
            sum += iter.next();
        }

        System.out.println(sum);
    }
}