package com.Incubyte.bussinesslogic;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static void main(String[] args) {
        System.out.println("Hello Incubyte");
    }

    /**
     * Problem:
     * 3. Allow the Add method to handle new lines between numbers (instead of commas).
     *     1. the following input is ok: “1\n2,3” (will equal 6)
     * ——————————————————————————————-
     */
    public int getSumByStringCalculator(String parameter) {
        int sum=0;
        String[] nubmers=parameter.split(",|\n");
        if(nubmers.length==0)
        {
            return 0;
        }
        if (nubmers.length>0) {
            for (String number : nubmers
            ) {
                sum = sum + Integer.parseInt(number);
            }
        }
        return sum;
    }

}