package com.Incubyte.tdd;

import com.Incubyte.bussinesslogic.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculaterTester {

    /**
     * Problem:
     * 9. make sure you can also handle multiple delimiters with length longer than one char
     */
    @Test
    public  void getSumOfAnyNumberByStringCalculatorWithCustomDelimiters() {
        String parameter="//[@@@][%%%]\n1@@@2%%%3,5;6,7";
        int expextedsum=24;
        //Arrange
        StringCalculator stringCalculator=new StringCalculator();
        //Act
        int sum=stringCalculator.getSumByStringCalculator(parameter);
        //Assert
        Assert.assertEquals(expextedsum,sum);
    }





}
