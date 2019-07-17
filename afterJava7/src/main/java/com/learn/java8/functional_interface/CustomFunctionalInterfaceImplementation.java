package com.learn.java8.functional_interface;

public class CustomFunctionalInterfaceImplementation implements CustomFunctionalInterface{

    public Integer using_interface(){
        CustomFunctionalInterface myInterface = (x, y)->x+y;
        return myInterface.my_method(1,2);
    }

    public void calling_static_method(){
        CustomFunctionalInterface.any_static_method_allowed();
    }

    public void calling_default_method(){
        CustomFunctionalInterface.super.any_default_method();
    }


    @Override
    public Integer my_method(Integer x, Integer y) {
        return x+y;
    }

}
