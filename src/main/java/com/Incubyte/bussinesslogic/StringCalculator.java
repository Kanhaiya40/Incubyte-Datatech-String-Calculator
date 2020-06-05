package com.Incubyte.bussinesslogic;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static void main(String[] args) {
        System.out.println("Hello Incubyte");
    }

    /**
     * Problem:
     * 4.Support different delimiters
     * 1. to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
     * 2. the first line is optional. all existing scenarios should still be supported
     */
    public int getSumByStringCalculator(String parameter) {
        int sum=0;
        String delimiters=";";
        String[] parts=parameter.split("\n");
        String[] nubmers=parts[1].split(delimiters);
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