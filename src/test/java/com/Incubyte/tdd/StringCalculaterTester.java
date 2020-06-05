package com.Incubyte.tdd;

import com.Incubyte.bussinesslogic.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculaterTester {

    /**
     * Problem:
     * 3. Allow the Add method to handle new lines between numbers (instead of commas).
     *     1. the following input is ok: “1\n2,3” (will equal 6)
     * ——————————————————————————————-
     */
    @Test
    public void Add_AddUpToAnyNumbers_WhenStringIsValidAndWithDelimiters() {
        String parameter="1,2\n3";
        int expextedsum=6;
        //Arrange
        StringCalculator stringCalculator=new StringCalculator();
        //Act
        int sum=stringCalculator.getSumByStringCalculator(parameter);
        //Assert
        Assert.assertEquals(expextedsum,sum);
    }





}
