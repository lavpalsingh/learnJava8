package com.learn.java8.lambda;

public class LambdaClass {

    private long perform_operation(TestInterface1 interface_obj, long x, long y) {
        return interface_obj.perform(x, y);
    }

    private TestInterface1 getAddOp() {
        return (x, y) -> x + y;
    }

    private TestInterface1 getMinusOp() {
        return (x, y) -> x - y;
    }

    private TestInterface2 getPrinter(){
        return msg -> System.out.println("Given Message: "+msg);
    }

    public long perform_addition(long input1, long input2) {
        return perform_operation(getAddOp(), input1, input2);
    }

    public long perform_subtraction(long input1, long input2) {
        return perform_operation(getMinusOp(), input1, input2);
    }

    public void printMessage(String message){
        getPrinter().print(message);
    }
}
