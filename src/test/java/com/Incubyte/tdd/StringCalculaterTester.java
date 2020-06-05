package com.Incubyte.tdd;

import com.Incubyte.bussinesslogic.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculaterTester {

    /**
     * Problem:
     * 2. Allow the Add method to handle an unknown amount of numbers
     */
    @Test
    public void Add_AddUpToAnyNumbers_WhenStringIsValid() {
        String parameter="6,8,9,13";
        int expextedsum=36;
        //Arrange
        StringCalculator stringCalculator=new StringCalculator();
        //Act
        int sum=stringCalculator.getSumByStringCalculator(parameter);
        //Assert
        Assert.assertEquals(expextedsum,sum);
    }





}
