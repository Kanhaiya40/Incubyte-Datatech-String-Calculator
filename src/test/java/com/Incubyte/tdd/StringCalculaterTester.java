package com.Incubyte.tdd;

import com.Incubyte.bussinesslogic.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculaterTester {

    /**
     * Problem:
     * 6.Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
     */
    @Test
    public  void Add_AddUpToAnyNumbers_WhenStringIsValidWithNumberLessThan1000() {
        String parameter="//;\n1,7;3,1001,1001";
        int expextedsum=2013;
        //Arrange
        StringCalculator stringCalculator=new StringCalculator();
        //Act
        int sum=stringCalculator.getSumByStringCalculator(parameter);
        //Assert
        Assert.assertEquals(expextedsum,sum);
    }





}
