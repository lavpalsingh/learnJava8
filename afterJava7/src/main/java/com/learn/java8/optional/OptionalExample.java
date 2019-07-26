package com.learn.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class OptionalExample {
    private List<Integer> int_list = Arrays.asList(9, 1, 5, 7, 2);

    void using_empty() {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty); //returns an empty instance of Optional class
    }

    void using_of() {
        Optional<Integer> result = Optional.of(24);
        System.out.println(result);
    }


    void using_ofNullable() {
        Optional<Integer> result = Optional.ofNullable(null);
        System.out.println(result);
    }

    void using_get() {
        Optional<Integer> result = int_list.stream().filter(x -> x > 10).reduce((x, y) -> x + y);
        System.out.println(result.equals(Optional.empty()));
        System.out.println(result.get());
    }

    void using_isPresent() {
        Optional<Integer> result = int_list.stream().filter(x -> x > 10).reduce((x, y) -> x + y);
        if (result.isPresent())
            System.out.println(result.get());

    }

    void using_ifPresent() {
        Optional<Integer> result = int_list.stream().filter(x -> x > 10).reduce((x, y) -> x + y);
        result.ifPresent(System.out::println);

    }

    void using_orElse() {
        Optional<Integer> result = int_list.stream().filter(x -> x > 10).reduce((x, y) -> x + y);
        System.out.println(result.orElse(0));
    }

    void using_orElseThrow() {
        Optional<Integer> result = int_list.stream().filter(x -> x > 10).reduce((x, y) -> x + y);
        System.out.println(result.orElseThrow(IllegalStateException::new));
    }

    void using_equals() {
        Optional<Integer> result_1 = int_list.stream().reduce((x, y) -> x + y);
        Optional<Integer> result_2 = Optional.of(24);
        System.out.println(result_1.equals(result_2));
    }

    void using_map() {
        Optional<Integer> result = int_list.stream().reduce((x, y) -> x + y);
        result.ifPresent(System.out::println);
        result = result.map(x -> x * 2);
        result.ifPresent(System.out::println);
    }

    void using_filter() {
        Optional<Integer> result = int_list.stream().reduce((x, y) -> x + y);
        result.ifPresent(System.out::println);
        result = result.filter(x -> x > 25);
        result.ifPresent(System.out::println);
    }
}
