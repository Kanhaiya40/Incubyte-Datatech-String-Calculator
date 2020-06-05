package com.Incubyte.bussinesslogic;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static void main(String[] args) {
        System.out.println("Hello Incubyte");
    }

    /**
     * Problem:
     * 5.Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.
     * if there are multiple negatives, show all of them in the exception message.orted
     */
    public int getSumByStringCalculator(String parameter) {
        int sum=0;
        List<String> negetivenumbers=new ArrayList<String>();
        String delimiters=";";
        String[] parts=parameter.split("\n");
        String[] nubmers=parts[1].split(""+delimiters+"|,");
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
                else
                    sum=sum+Integer.parseInt(number);
            }
            throw new ArithmeticException("negetives not allwed"+negetivenumbers);
        }
        return sum;
    }

}