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
     *     2. the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
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