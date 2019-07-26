package com.learn.java8.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamProcessingTest {
    private StreamProcessing sp = new StreamProcessing();


    @Test
    public void generate_stream_sequential() {
        sp.generate_stream_sequential();
    }


    @Test
    public void generate_stream_parallel() {
        sp.generate_stream_parallel();
    }

    @Test
    public void convertStreamToList() {
        List<Integer> result = sp.convertStreamToList();
        Assert.assertArrayEquals(new Integer[]{2, 4}, result.toArray());
    }

    @Test
    public void convertStreamToArray() {
        Integer[] result = sp.convertStreamToArray();
        Assert.assertArrayEquals(new Integer[]{1, 3}, result);
    }

    @Test
    public void using_tokenized_stream() {
        sp.using_tokenized_stream();
    }

    @Test
    public void using_char_stream() {
        sp.using_char_stream();
    }

    @Test
    public void using_iterate_method() {
        sp.using_iterate_method();
    }

    @Test
    public void using_generate_method() {
        sp.using_generate_method();
    }

    @Test
    public void generate_stream() {
        sp.generate_stream();
    }

    @Test
    public void generate_stream1() {
        sp.generate_stream1();
    }

    @Test
    public void generate_stream2() {
        sp.generate_stream2();
    }
}