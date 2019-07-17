package com.learn.java8;

import com.learn.java8.method_reference.MethodReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class TestMethodReference {

    private MethodReference methodReference =  new MethodReference();
    @Test
    public void test_using_static_method_reference() {
        methodReference.using_static_method_reference();
    }

    @Test
    public void test_using_instance_method_reference() {
        methodReference.using_instance_method_reference();
    }

    @Test
    public void test_using_constructor_method_reference() {
        methodReference.using_constructor_method_reference();
    }


}
