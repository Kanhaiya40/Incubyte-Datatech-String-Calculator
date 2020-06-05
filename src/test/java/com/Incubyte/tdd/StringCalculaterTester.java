package com.Incubyte.tdd;

import com.Incubyte.bussinesslogic.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculaterTester {

    /**
     * Problem:
     * 5.Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.
     * if there are multiple negatives, show all of them in the exception message.orted
     */
    @Test
    public  void Add_AddUpToAnyNumbers_WhenStringIsValidWithNegetiveNumber() {
        String parameter="//;\n1,-7;3,-4;-9,12,24,43,-24;-32,4";
        int expextedsum=-7;
        //Arrange
        StringCalculator stringCalculator=new StringCalculator();
        //Act
        int sum=stringCalculator.getSumByStringCalculator(parameter);
        //Assert
        Assert.assertEquals(expextedsum,sum);
    }





}
