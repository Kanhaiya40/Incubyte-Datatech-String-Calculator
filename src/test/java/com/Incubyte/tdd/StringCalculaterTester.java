package com.Incubyte.tdd;

import com.Incubyte.bussinesslogic.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculaterTester {

    /**
     * Problem:
     * 4.Support different delimiters
     * 1. to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
     * 2. the first line is optional. all existing scenarios should still be supported
     */
    @Test
    public void Add_AddUpToAnyNumbers_WhenStringIsValidAndWithCustomDelimiters() {
        String parameter="//;\\n1;2";
        int expextedsum=3;
        //Arrange
        StringCalculator stringCalculator=new StringCalculator();
        //Act
        int sum=stringCalculator.getSumByStringCalculator(parameter);
        //Assert
        Assert.assertEquals(expextedsum,sum);
    }





}
