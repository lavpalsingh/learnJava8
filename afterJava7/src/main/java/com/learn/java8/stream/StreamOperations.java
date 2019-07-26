package com.learn.java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamOperations {
    private List<String> employee_list = Arrays.asList("Danny", "Alex", "Danny", "Fedrico");

    private List<Integer> int_list = Arrays.asList(9, 1, 5, 7, 2);

    //Filter accepts a predicate to filter all elements of the stream
    void using_filter() {
        employee_list.stream().filter((x) -> x.length() == 4)
                .forEach(System.out::println);
    }

    void using_map() {
        employee_list.stream().filter((x) -> x.length() == 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    void using_flatMap() {
        employee_list.stream()
                .flatMap(x -> Stream.of(x.toCharArray()))
                .forEach(System.out::println);
    }


    void using_flatMap2() {
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);
    }

    void using_distinct() {
        employee_list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    void using_sorted() {
        employee_list.stream()
                .sorted()   //Custom Comparator sort
                .forEach(System.out::println);
    }

    void using_peek() {
        employee_list.stream()
                .peek(System.out::println)
                .map(x -> x.replace("a", "A"))
                .forEach(System.out::println);
    }

    void using_limit() {
        employee_list.stream()
                .limit(2)
                .forEach(System.out::println);
    }

    void using_skip() {
        employee_list.stream()
                .skip(2)
                .forEach(System.out::println);
    }

    void using_forEach() {
        employee_list.parallelStream()
                .forEach(System.out::println);
    }

    void using_forEachOrdered() {
        employee_list.parallelStream()
                .forEachOrdered(System.out::println);
    }

    //lose the benefits of parallelism if you use operations like forEachOrdered() with parallel streams
    void using_forEachOrdered2() {
        employee_list.stream()
                .sorted(Comparator.reverseOrder())
                .forEachOrdered(System.out::println);
    }

    void using_toArray() {
        Object[] result = employee_list.stream().map(String::toUpperCase).toArray();
        System.out.println(Arrays.asList(result));
    }

    void using_reduce() {
        Optional<String> result = employee_list.stream().reduce((x, y) -> x + "," + y);
        result.ifPresent(System.out::println);
    }

    void using_collect() {
        List<String> result = employee_list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);

        String result2 = employee_list.stream().distinct().collect(Collectors.joining(", "));
        System.out.println(result2);
    }

    void using_min() {
        Optional<Integer> result = int_list.stream().skip(2).min(Integer::compareTo);
        result.ifPresent(System.out::println);
    }

    void using_max() {
        Optional<Integer> result = int_list.stream().limit(3).max(Integer::compareTo);
        result.ifPresent(System.out::println);
    }

    void using_count() {
        long result = int_list.stream().filter(x -> x >= 5).count();
        System.out.println(result);
    }

    void using_anyMatch() {
        boolean result = employee_list.stream().anyMatch(x -> x.contains("Al"));
        System.out.println(result);
    }

    void using_allMatch() {
        boolean result = int_list.stream().allMatch(x -> x > 2);
        System.out.println(result);
    }

    void using_noneMatch() {
        boolean result = int_list.stream().noneMatch(x -> x % 2 == 0);
        System.out.println(result);
    }

    void using_findFirst() {
        Optional<Integer> result = int_list.stream().filter(x -> x < 5).findFirst();
        result.ifPresent(System.out::println);

        result = int_list.stream().parallel().filter(x -> x < 5).findFirst();
        result.ifPresent(System.out::println);
    }

    void using_findAny() {
        Optional<Integer> result = int_list.stream().filter(x -> x < 5).findAny();
        result.ifPresent(System.out::println);

        result = int_list.stream().parallel().filter(x -> x < 5).findAny();
        result.ifPresent(System.out::println);
    }

    void using_stats(){
        IntSummaryStatistics stats = int_list.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest -- " + stats.getMax());
        System.out.println("Lowest -- " + stats.getMin());
        System.out.println("Sum -- " + stats.getSum());
        System.out.println("Average -- " + stats.getAverage());
    }


}
