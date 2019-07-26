package com.learn.java8.date;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTimeAPITest {

    private DateTimeAPI dateTimeAPI = new DateTimeAPI();

    @Test
    public void localDate() {
        dateTimeAPI.localDate();
    }

    @Test
    public void localTime() {
        dateTimeAPI.localTime();
    }

    @Test
    public void localDateTime() {
        dateTimeAPI.localDateTime();
    }

    @Test
    public void formattedDateTime() {
        dateTimeAPI.formattedDateTime();
    }

    @Test
    public void dateTimeMethods() {
        dateTimeAPI.dateTimeMethods();
    }

    @Test
    public void dateTime_of() {
        dateTimeAPI.dateTime_of();
    }

    @Test
    public void dateTime_with() {
        dateTimeAPI.dateTime_with();
    }

    @Test
    public void dateTime_operations_plus() {
        dateTimeAPI.dateTime_operations_plus();
    }

    @Test
    public void dateTime_operations_minus() {
        dateTimeAPI.dateTime_operations_minus();
    }

    @Test
    public void zoned_dateTime() {
        dateTimeAPI.zoned_dateTime();
    }


    @Test
    public void period() {
        dateTimeAPI.period();
    }

    @Test
    public void duration() {
        dateTimeAPI.duraion();
    }

    @Test
    public void compatibility() {
        dateTimeAPI.compatibility();
    }

    @Test
    public void parse() {
        dateTimeAPI.parse();
    }

    @Test
    public void beforeAfterCheck() {
        dateTimeAPI.beforeAfterCheck();
    }

    @Test
    public void compareTo() {
        dateTimeAPI.compareTo();
    }

    @Test
    public void isLeapYear() {
        dateTimeAPI.isLeapYear();
    }

    @Test
    public void dateToString() {
        dateTimeAPI.dateToString();
    }

    @Test
    public void beforeJava8() {
        dateTimeAPI.beforeJava8();
    }

    @Test
    public void timeStampInJava8() {
        dateTimeAPI.timeStampInJava8();
    }

    @Test
    public void EST_IST() {
        dateTimeAPI.EST_IST();
    }

    @Test
    public void elapsedTime() {
        dateTimeAPI.elapsedTime();
    }

    @Test
    public void chronoUnitEnums() {
        dateTimeAPI.chronoUnitEnums();
    }

    @Test
    public void temporalAdjuster() {
        dateTimeAPI.temporalAdjuster();
    }
}