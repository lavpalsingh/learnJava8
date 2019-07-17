package com.learn.java8.method_reference;

@FunctionalInterface
interface AnyFuncInterface {
    void any_method();
}

class AnyFuncInterfaceImpl implements AnyFuncInterface {
    @Override
    public void any_method() {
        System.out.println("Parent class method");
    }
}

public class MethodReference extends AnyFuncInterfaceImpl {

    @FunctionalInterface
    interface Printer {
        void print(String msg);
    }

    public MethodReference() {
        System.out.println("MethodReference constructor");
    }

    private void instance_method() {
        System.out.println("Instance method");
    }

    private static void static_method(String s) {
        System.out.println(s);
    }

    public void using_static_method_reference() {
        Printer p = MethodReference::static_method;
        p.print("Static method"); //consumer
    }

    public void using_instance_method_reference() {
        AnyFuncInterface a = this::instance_method;
        a.any_method();

        AnyFuncInterface b = super::any_method;
        b.any_method(); // context , will be explored deeply in streams
    }

    public void using_constructor_method_reference() {
        AnyFuncInterface a = MethodReference::new; // supplier
        a.any_method();  // this is used to invoke the constructor
    }
}
