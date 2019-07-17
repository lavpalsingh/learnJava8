package com.learn.java8;

import com.learn.java8.functional_interface.CustomFunctionalInterfaceImplementation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestCustomFunctionalInterface {
    private CustomFunctionalInterfaceImplementation custom_functional_interface_implementation= new CustomFunctionalInterfaceImplementation();

    @Test
    public void test_custom_functionalInterface() {
        Integer result = custom_functional_interface_implementation.using_interface();
        Assert.assertEquals(3,result,0);
    }

    @Test
    public void test_calling_static_method_custom_functionalInterface() {
        custom_functional_interface_implementation.calling_static_method();
    }

    @Test
    public void test_calling_default_method_custom_functionalInterface() {
        custom_functional_interface_implementation.any_default_method();
    }

    @Test
    public void test_calling_default_method_custom_functionalInterface2() {
        custom_functional_interface_implementation.calling_default_method();
    }

}
