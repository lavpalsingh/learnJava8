package com.learn.java8.functional_interface;

@FunctionalInterface
public interface CustomFunctionalInterface {
    //No target method - Compile time error if no abstract method
    // Multiple non-overriding abstract methods found - Compile time error if more than one abstract method
    Integer my_method(Integer x, Integer y);


    //public by default, private/protected not allowed
     static void any_static_method_allowed(){
         System.out.println("Static method is allowed inside a functional interface");
    }

    //public by default, private/protected not allowed
      default void any_default_method(){
          System.out.println("Default method is allowed inside a functional interface using a default keyword");
    }
}
