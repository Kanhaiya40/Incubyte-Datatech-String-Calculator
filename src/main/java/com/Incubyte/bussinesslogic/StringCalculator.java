package com.Incubyte.bussinesslogic;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static void main(String[] args) {
        System.out.println("Hello Incubyte");
    }

    /**
     * Problem:
     * 1. Create a simple String calculator with a method signature:
     * ———————————————
     * int Add(string numbers)
     * ———————————————
     * The method can take up to two numbers, separated by commas, and will return their sum.
     * for example “” or “1” or “1,2” as inputs.
     * (for an empty string it will return 0)
     *
     * @param parameter
     * @return
     */
    public int getSumByStringCalculator(String parameter) {
        String[] input = parameter.split(",");
        if (input.length == 0) {
            return 0;
        }
        if (input.length == 1) {
            if (input[0].length() == 0) {
                return 0;
            }
            return Integer.parseInt(input[0]);
        }
        return Integer.parseInt(input[0]) + Integer.parseInt(input[1]);

    }

}