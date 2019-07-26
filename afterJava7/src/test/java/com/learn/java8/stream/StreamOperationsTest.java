package com.learn.java8.stream;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class StreamOperationsTest {

    private StreamOperations so = new StreamOperations();
    @Test
    public void using_filter() {
        so.using_filter();
    }

    @Test
    public void using_map() {
        so.using_map();
    }

    @Test
    public void using_flatMap() {
        so.using_flatMap();
    }

    @Test
    public void using_distinct() {
        so.using_distinct();
    }

    @Test
    public void using_sorted() {
        so.using_sorted();
    }

    @Test
    public void using_peek() {
        so.using_peek();
    }

    @Test
    public void using_flatMap2() {
        so.using_flatMap2();
    }

    @Test
    public void using_limit() {
        so.using_limit();
    }

    @Test
    public void using_skip() {
        so.using_skip();
    }

    @Test
    public void using_toArray() {
        so.using_toArray();
    }

    @Test
    public void using_forEach() {
        so.using_forEach();
    }

    @Test
    public void using_forEachOrdered() {
        so.using_forEachOrdered();
    }

    @Test
    public void using_forEachOrdered2() {
        so.using_forEachOrdered2();
    }

    @Test
    public void using_reduce() {
        so.using_reduce();
    }

    @Test
    public void using_collect() {
        so.using_collect();
    }

    @Test
    public void using_min() {
        so.using_min();
    }

    @Test
    public void using_max() {
        so.using_max();
    }

    @Test
    public void using_count() {
        so.using_count();
    }

    @Test
    public void using_anyMatch() {
        so.using_anyMatch();
    }

    @Test
    public void using_allMatch() {
        so.using_allMatch();
    }

    @Test
    public void using_noneMatch() {
        so.using_noneMatch();
    }

    @Test
    public void using_findFirst() {
        so.using_findFirst();
    }

    @Test
    public void using_findAny() {
        so.using_findAny();
    }

    @Test
    public void using_stats() {
        so.using_stats();
    }



}