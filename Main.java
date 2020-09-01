package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Date d1 = new Date(8, 24, 2002);
        Date d2 = new Date(10, 21, 2005);
        Date d3 = new Date(9, 21, 2003);
        Date d4 = new Date(9, 30, 2001);


            if(d1.compareTo(d2) == 1)
                System.out.println(d1.month + "/" + d1.day + "/" + d1.year + " is later than " + d2.month + "/" + d2.day + "/" + d2.year );
            else if(d1.compareTo(d2) == -1)
                System.out.println(d1.month + "/" + d1.day + "/" + d1.year +" is earlier than " + d2.month + "/" + d2.day + "/" + d2.year  );
            else {
                System.out.println(d1.month + "/" + d1.day + "/" + d1.year + " and " + d2.month + "/" + d2.day + "/" + d2.year + " are the same dates");
            }

    }
}








