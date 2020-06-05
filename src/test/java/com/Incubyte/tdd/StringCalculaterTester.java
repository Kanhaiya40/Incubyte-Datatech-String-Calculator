package com.Incubyte.tdd;

import com.Incubyte.bussinesslogic.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculaterTester {

    /**
     * Problem:
     * 1. Create a simple String calculator with a method signature:
     * ———————————————
     * int Add(string numbers)
     * ———————————————
     * The method can take up to two numbers, separated by commas, and will return their sum.
     * for example “” or “1” or “1,2” as inputs.
     * (for an empty string it will return 0)
     */
    @Test
    public void Add_AddUpToTwoNumbers_WhenStringIsValid() {
        String parameter="675,254";
        int expextedsum=27652;
        //Arrange
        StringCalculator stringCalculator=new StringCalculator();
        //Act
        int sum=stringCalculator.getSumByStringCalculator(parameter);
        //Assert
        Assert.assertEquals(expextedsum,sum);
    }





}
