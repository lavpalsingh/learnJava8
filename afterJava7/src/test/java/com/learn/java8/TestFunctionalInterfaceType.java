package com.learn.java8;

import com.learn.java8.functional_interface.FunctionalInterfaceType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.logging.Logger;

@RunWith(JUnit4.class)
public class TestFunctionalInterfaceType {

    private FunctionalInterfaceType functionalInterfaceType = new FunctionalInterfaceType();

    private Logger logger = Logger.getLogger(this.getClass().getName());
    @Test
    public void test_type_function() {
        int result = functionalInterfaceType.type_function(5);
        Assert.assertEquals(10, result);
    }

    //delta is intended to reflect how close the numbers can be and still be considered equal. Use values like 0.1 or 0.01 or 0.001, etc, depending on how much error the application can tolerate.
    @Test
    public void test_type_int_function() {
        double result = functionalInterfaceType.type_int_function(5);
        Assert.assertEquals(7.0, result, 0);
    }

    @Test
    public void test_type_long_function() {
        String result = functionalInterfaceType.type_long_function(5L);
        Assert.assertEquals("5 my test string", result);
    }

    @Test
    public void test_type_double_function() {
        String result = functionalInterfaceType.type_double_function(15);
        Assert.assertEquals("15.0 my test string", result);
    }

    @Test
    public void test_type_long_function2() {
        Double result = functionalInterfaceType.type_long_function2(3);
        Assert.assertEquals(7.5, result, 0);
    }

    @Test
    public void test_type_int_to_double_function() {
        double result = functionalInterfaceType.type_int_to_double_function(9);
        Assert.assertEquals(12.0, result, 0);
    }

    @Test
    public void test_type_bifunction() {
        String result = functionalInterfaceType.type_bifunction("First value", "Second value");
        Assert.assertEquals("First value & Second value", result);
    }

    @Test
    public void test_type_bifunction2() {
        Double result = functionalInterfaceType.type_bifunction2(1, 2L);
        Assert.assertEquals(4.0, result, 0);
    }

    @Test
    public void test_type_toInt_bifunction() {
        Integer result = functionalInterfaceType.type_toInt_bifunction(1, 2);
        Assert.assertEquals(4, result, 0);
    }
    @Test
    public void test_type_toInt_function() {
        Integer result = functionalInterfaceType.type_toInt_function("20");
        Assert.assertEquals(20, result, 0);
    }

    @Test
    public void test_predicate() {
        Boolean result = functionalInterfaceType.type_predicate(11);
        Assert.assertTrue( result);
    }

    @Test
    public void test_bipredicate() {
        Boolean result = functionalInterfaceType.type_bipredicate(11,12);
        Assert.assertFalse( result);
    }

    @Test
    public void test_double_predicate() {
        Boolean result = functionalInterfaceType.type_double_predicate(11.7);
        Assert.assertTrue( result);
    }

    @Test
    public void test_binary_operator() {
        Long result = functionalInterfaceType.type_binary_operator(10L,20L);
        Assert.assertEquals(30L, result,0);
    }

    @Test
    public void test_long_binary_operator() {
        Long result = functionalInterfaceType.type_long_binary_operator(10L,20L);
        Assert.assertEquals(30L, result,0);
    }

    @Test
    public void test_unary_operator() {
        Long result = functionalInterfaceType.type_unary_operator(10L);
        Assert.assertEquals(11L, result,0);
    }

    @Test
    public void test_long_unary_operator() {
        Long result = functionalInterfaceType.type_long_unary_operator(10L);
        Assert.assertEquals(9L, result,0);
    }

    @Test
    public void test_type_supplier() {
        Double result = functionalInterfaceType.type_supplier();
        logger.info("test_type_supplier() -> "+result);
        Assert.assertNotNull(result);
    }

    @Test
    public void test_type_double_supplier() {
        Double result = functionalInterfaceType.type_double_supplier();
        logger.info("test_type_double_supplier() -> "+result);
        Assert.assertNotNull(result);
    }

    @Test
    public void test_type_boolean_supplier() {
        Boolean result = functionalInterfaceType.type_boolean_supplier();
        Assert.assertTrue(result);
    }

    @Test
    public void test_type_consumer() {
        functionalInterfaceType.type_consumer(20);
    }

    @Test
    public void test_type_int_consumer() {
        functionalInterfaceType.type_int_consumer(20);
    }

    @Test
    public void test_type_objDouble_consumer() {
        functionalInterfaceType.type_objDouble_consumer("Any Object can be passed here ",20.9);
    }

    @Test
    public void test_type_biconsumer() {
        functionalInterfaceType.type_biconsumer("Any Object can be passed here ",20.9);
    }

}
