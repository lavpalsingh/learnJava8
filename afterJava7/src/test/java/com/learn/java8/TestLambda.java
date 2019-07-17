package com.learn.java8;

import com.learn.java8.lambda.LambdaClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestLambda {
    private LambdaClass lambdaClass = new LambdaClass();

    @Test
    public void test_addition() {
        long result = lambdaClass.perform_addition(5, 10);
        Assert.assertEquals(15, result);
    }

    @Test
    public void test_subtraction() {
        long result = lambdaClass.perform_subtraction(15, 10);
        Assert.assertEquals(5, result);
    }

    @Test
    public void test_message() {
        lambdaClass.printMessage("This is the actual message passed");
    }
}
