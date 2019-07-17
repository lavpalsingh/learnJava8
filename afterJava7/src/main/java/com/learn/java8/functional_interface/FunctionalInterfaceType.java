package com.learn.java8.functional_interface;

import java.util.function.*;

public class FunctionalInterfaceType {

    /*


1. Function<T,R>
*/

    public int type_function(int input) {
        Function<Integer, Integer> test_function = (x) -> x * 2;
        return test_function.apply(input);
    }

    /*
2. IntFunction<R>
- Accepts an int-valued argument and produces a result.

3. LongFunction<R>
- Accepts a long-valued argument and produces a result.

4. DoubleFunction<R>
- Accepts a double-valued argument and produces a result.

*/

    public double type_int_function(int input) {
        IntFunction<Double> test_function = (x) -> x + 2.0;
        return test_function.apply(input);
    }

    public String type_long_function(long input) {
        LongFunction<String> test_function = (x) -> x + " my test string";
        return test_function.apply(input);
    }

    public String type_double_function(double input) {
        DoubleFunction<String> test_function = (x) -> x + " my test string";
        return test_function.apply(input);
    }

    public Double type_long_function2(int input) {
        LongFunction<Double> test_function = (x) -> x + 4.5;
        return test_function.apply(input);
    }
    /*

5. IntToDoubleFunction
- Accepts an int-valued argument and produces a double-valued result.

6. IntToLongFunction
- Accepts an int-valued argument and produces a long-valued result.

7. LongToDoubleFunction
- Accepts a long-valued argument and produces a double-valued result.

8. LongToIntFunction
- Accepts a long-valued argument and produces an int-valued result.

9. DoubleToIntFunction
- Accepts a double-valued argument and produces an int-valued result.

10. DoubleToLongFunction
- Accepts a double-valued argument and produces a long-valued result.
*/

    public double type_int_to_double_function(int input) {
        IntToDoubleFunction test_function = (x) -> x + 3;
        return test_function.applyAsDouble(input);
    }

    /*

11. BiFunction<T,U,R>
- Accepts two arguments and produces a result.
*/

    public String type_bifunction(String input1, String input2) {
        BiFunction<String, String, String> test_function = (x, y) -> x + " & " + y;
        return test_function.apply(input1, input2);
    }

    public Double type_bifunction2(Integer input1, Long input2) {
        BiFunction<Integer, Long, Double> test_function = (x, y) -> 1.0 + x + y;
        return test_function.apply(input1, input2);
    }

    /*
12. ToIntBiFunction<T,U>
- Accepts two arguments and produces an int-valued result.

13. ToLongBiFunction<T,U>
- Accepts two arguments and produces a long-valued result.

14. ToDoubleBiFunction<T,U>
- Accepts two arguments and produces a double-valued result.

*/
    public Integer type_toInt_bifunction(Integer input1, Integer input2) {
        ToIntBiFunction<Integer, Integer> test_function = (x, y) -> 1 + x + y;
        return test_function.applyAsInt(input1, input2);
    }

    /*

15. ToIntFunction<T>
- Produces an int-valued result.

16. ToLongFunction<T>
- produces a long-valued result.

17. ToDoubleFunction<T>
- Produces a double-valued result.
    */

    public Integer type_toInt_function(String input1) {
        ToIntFunction<String> test_function = (x) -> Integer.parseInt(x);
        return test_function.applyAsInt(input1);
    }

/*
Predicate

18. Predicate<T>
- predicate / Boolean-valued function of one argument.

19. BiPredicate<T,U>
- predicate of two arguments.

20. DoublePredicate
- predicate of one double-valued argument.

21. IntPredicate
- predicate of one int-valued argument.

22. LongPredicate
- predicate of one long-valued argument.

* */

    public Boolean type_predicate(Integer input) {
        Predicate<Integer> test_predicate = (x) -> x > 10;
        return test_predicate.test(input);
    }

    public Boolean type_bipredicate(Integer input1, Integer input2) {
        BiPredicate<Integer, Integer> test_predicate = (x, y) -> x > y;
        return test_predicate.test(input1, input2);
    }

    public Boolean type_double_predicate(Double input) {
        DoublePredicate test_predicate = (x) -> x > 10;
        return test_predicate.test(input);
    }


    /*

    BinaryOperator

23. BinaryOperator<T>
- operation upon two operands of the same type, producing a result of the same type as the operands

24. IntBinaryOperator
- operation upon two int-valued operands and produces an int-valued result.

25. LongBinaryOperator
- operation upon two long-valued operands and produces a long-valued result.

26. DoubleBinaryOperator
- operation upon two double-valued operands and producing a double-valued result.

===========================

    UnaryOperator
    - abstract method apply which takes one argument and returns a result of same type

    public interface UnaryOperator
    {
         public T apply(T x);
    }

27. UnaryOperator<T>
- operation on a single operand that produces a result of the same type as its operand.

28. IntUnaryOperator
- operation on a single int-valued operand that produces an int-valued result.

29. LongUnaryOperator
- operation on a single long-valued operand that produces a long-valued result.

30. DoubleUnaryOperator
- operation on a single double-valued operand that produces a double-valued result.

    * */

    public Long type_binary_operator(Long input1, Long input2) {
        BinaryOperator<Long> test_predicate = (x, y) -> x + y;
        return test_predicate.apply(input1, input2);
    }

    public Long type_long_binary_operator(Long input1, Long input2) {
        LongBinaryOperator test_predicate = (x, y) -> x + y;
        return test_predicate.applyAsLong(input1, input2);
    }

    public Long type_unary_operator(Long input) {
        UnaryOperator<Long> test_predicate = (x) -> ++x;
        return test_predicate.apply(input);
    }

    public Long type_long_unary_operator(Long input) {
        LongUnaryOperator test_predicate = (x) -> --x;
        return test_predicate.applyAsLong(input);
    }


    /*

    Supplier

31. Supplier<T>
-  supplier of results.

32. BooleanSupplier
- supplier of Boolean-valued results.

33. DoubleSupplier
- supplier of double-valued results.

34. IntSupplier
- supplier of int-valued results.

35. LongSupplier
- supplier of long-valued results.

    * */
    public Double type_supplier() {
        Supplier<Double> test_supplier = () -> Math.random();
        return test_supplier.get();
    }

    public Double type_double_supplier() {
        DoubleSupplier test_supplier = () -> Math.random();
        return test_supplier.getAsDouble();
    }

    public Boolean type_boolean_supplier() {
        BooleanSupplier test_supplier = () -> 1>0;
        return test_supplier.getAsBoolean();
    }

    /*
    Consumer

36. Consumer<T>
- operation that accepts a single input argument and returns no result.

37. IntConsumer
- operation that accepts a single int-valued argument and returns no result.

38. LongConsumer
- operation that accepts a single long-valued argument and returns no result.

39. DoubleConsumer
- operation that accepts a single double-valued argument and returns no result.

40. ObjDoubleConsumer<T>
- operation that accepts an object-valued and a double-valued argument, and returns no result.

41. ObjIntConsumer<T>
- operation that accepts an object-valued and an int-valued argument, and returns no result.

42. ObjLongConsumer<T>
- operation that accepts an object-valued and a long-valued argument, and returns no result.

43. BiConsumer<T,U>
- operation that accepts two input arguments, and returns no result.

    * */

    public void type_consumer(Integer input) {
        Consumer<Integer> test_consumer = (x) -> System.out.println("input = [" + x + "]");
        test_consumer.accept(input);
    }

    public void type_int_consumer(Integer input) {
        IntConsumer test_consumer = (x) -> System.out.println("input = [" + x + "]");
        test_consumer.accept(input);
    }

    public void type_objDouble_consumer(Object input1, Double input2) {
        ObjDoubleConsumer<Object> test_consumer = (x,y) -> System.out.println(x+" "+y);
        test_consumer.accept(input1, input2);
    }

    public void type_biconsumer(Object input1, Object input2) {
        BiConsumer<Object,Object> test_consumer = (x,y) -> System.out.println(x+" "+y);
        test_consumer.accept(input1, input2);
    }
}
