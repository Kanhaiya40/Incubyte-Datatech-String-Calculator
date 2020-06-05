package com.Incubyte.tdd;

import com.Incubyte.bussinesslogic.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculaterTester {

    /**
     * Problem:
     * 8. Allow multiple delimiters like this: “//[delim1][delim2]\n”
     * for example “//[*][%]\n1*2%3” should return 6.
     */
    @Test
    public  void getSumOfAnyNumberByStringCalculatorWithCustomDelimiters() {
        String parameter="//[*][%]\n1*2%3,5;6";
        int expextedsum=17;
        //Arrange
        StringCalculator stringCalculator=new StringCalculator();
        //Act
        int sum=stringCalculator.getSumByStringCalculator(parameter);
        //Assert
        Assert.assertEquals(expextedsum,sum);
    }





}
