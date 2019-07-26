package com.learn.java8.optional;

import org.junit.Test;

import static org.junit.Assert.*;

public class OptionalExampleTest {

    OptionalExample oe = new OptionalExample();
    @Test
    public void using_empty() {
        oe.using_empty();
    }

    @Test
    public void using_equals() {
        oe.using_equals();
    }

    @Test
    public void using_of() {
        oe.using_of();
    }

    @Test
    public void using_get() {
        oe.using_get();
    }

    @Test
    public void using_isPresent() {
        oe.using_isPresent();
    }

    @Test
    public void using_orElse() {
        oe.using_orElse();
    }

    @Test
    public void using_orElseThrow() {
        oe.using_orElseThrow();
    }

    @Test
    public void using_ofNullable() {
        oe.using_ofNullable();
    }

    @Test
    public void using_ifPresent() {
        oe.using_ifPresent();
    }

    @Test
    public void using_map() {
        oe.using_map();
    }

    @Test
    public void using_filter() {
        oe.using_filter();
    }
}