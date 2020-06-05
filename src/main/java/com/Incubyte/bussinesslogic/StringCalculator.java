package com.Incubyte.bussinesslogic;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static void main(String[] args) {
        System.out.println("Hello Incubyte");
    }

    /**
     * Problem:
     * 9. Make sure you can also handle multiple delimiters with length longer than one char
     */
    public int getSumByStringCalculator(String parameter) {
        int sum=0;
        List<String> negetivenumbers=new ArrayList<String>();
        String delimiters="[*]";
        String starDelimiters="[%]";
        String[] parts=parameter.split("\n");
        String[] nubmers=parts[1].split(""+starDelimiters+"|,|;|"+delimiters+"");
        if(nubmers.length==0)
        {
            return 0;
        }
        if (nubmers.length>0) {
            for (String number : nubmers
            ) {
                if(Integer.parseInt(number)<0)
                {
                    negetivenumbers.add(number);
                }
                else if(Integer.parseInt(number)>1000) {
                        continue;

                    }
                else
                {
                    sum = sum + Integer.parseInt(number);
                }
            }
            for (String negetive:negetivenumbers
                 ) {
                if (Integer.parseInt(negetive) < 0)
                    throw new ArithmeticException("negetives not allwed" + negetivenumbers);
            }
        }
        return sum;
    }

}