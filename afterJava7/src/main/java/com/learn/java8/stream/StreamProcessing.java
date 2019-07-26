package com.learn.java8.stream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamProcessing {

    private List<Integer> number_list = Arrays.asList(1, 2, 3, 4, 5, 6);

    void generate_stream_sequential() {
        Stream<Integer> stream = number_list.stream();
        stream.forEach(System.out::println);
    }

    void generate_stream() {
        number_list.stream().forEach(System.out::println);
        number_list.forEach(System.out::println);
    }

    void generate_stream_parallel() {
        Stream<Integer> parallel_stream = number_list.parallelStream();
        parallel_stream.forEach(System.out::println);
    }


    void using_generate_method() {
        Stream<LocalDateTime> date_stream = Stream.generate(LocalDateTime::now);
        date_stream.limit(5).forEach(System.out::println);
    }

    void generate_stream1() {
        Stream.of(number_list).forEach(System.out::println);
    }

    void generate_stream2() {
        Stream.of(1, 2, 3, 4, 5, 6).forEach(System.out::println);
    }

    void using_tokenized_stream() {
        Stream<String> tokenized_stream = Stream.of("ABC,PQR,XYZ".split(","));
        tokenized_stream.forEach(System.out::println);
    }

    void using_char_stream() {
        IntStream char_stream = "World After Java 7".chars();
        char_stream.forEach(System.out::println);
    }

    void using_iterate_method() {
        Stream.iterate(5, i -> i + 5)
                .limit(5)
                .forEach(System.out::println);
    }

    List<Integer> convertStreamToList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        return stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

    }

    Integer[] convertStreamToArray() {
        List<Integer> int_list = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            int_list.add(i);
        }
        Stream<Integer> stream = int_list.stream();
        return stream.filter(i -> i % 2 != 0).toArray(Integer[]::new);
    }


}
