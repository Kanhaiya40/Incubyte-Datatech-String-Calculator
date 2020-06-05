package com.Incubyte.tdd;

import com.Incubyte.bussinesslogic.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculaterTester {

    /**
     * Problem:
     * 7. Delimiters can be of any length with the following format: “//[delimiter]\n”
     * for example: “//[***]\n1***2***3” should return 6
     */
    @Test
    public  void getSumOfAnyNumberByStringCalculatorWithCustomDelimiters() {
        String parameter="//[***]\n1***2***3";
        int expextedsum=6;
        //Arrange
        StringCalculator stringCalculator=new StringCalculator();
        //Act
        int sum=stringCalculator.getSumByStringCalculator(parameter);
        //Assert
        Assert.assertEquals(expextedsum,sum);
    }





}
