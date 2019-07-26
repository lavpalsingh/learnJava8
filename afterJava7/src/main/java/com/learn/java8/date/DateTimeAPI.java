package com.learn.java8.date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

class DateTimeAPI {

    void beforeJava8(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS");

        Date currentDate = new Date();

        System.out.println(formatter.format(currentDate));

        Calendar calendar = Calendar.getInstance();

        System.out.println(formatter.format(calendar.getTime()));       //04/06/2017 04:13:46.174


        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        Calendar currentTime = Calendar.getInstance();
        String timeStr = formatter.format(currentTime.getTime());
        System.out.println(timeStr);

        //Method 1 - via System watch
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        //Method2 - via java.util.Date
        Date date = new Date();
        Timestamp timestamp2 = new Timestamp(date.getTime());
        System.out.println(timestamp1);     //2018-07-14 13:48:39.336
        System.out.println(timestamp2);
    }

    void localDate() {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date :- " + date);

         }

    void localTime() {
        LocalTime date = LocalTime.now();
        System.out.println("Current Time :- " + date);
    }

    void localDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date Time :- " + dateTime);
    }

    void timeStampInJava8(){
        //Method 1: Get current instant
        Instant instant = Instant.now();

        //Method 2: From java.sql.Timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Instant instant2 = timestamp.toInstant();

        //Method 3: From java.util.Date
        Date date = new Date();
        Instant instant3 = date.toInstant();

        System.out.println(instant);
        System.out.println(instant2);
        System.out.println(instant3);
    }

    void EST_IST(){
         DateTimeFormatter globalFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma z");
         DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma 'ET'");

         ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
         ZoneId etZoneId = ZoneId.of("America/New_York");
        LocalDateTime currentDateTime = LocalDateTime.now();

        ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(etZoneId);

        System.out.println(globalFormat.format(currentISTime));
        System.out.println(etFormat.format(currentETime));
    }

    void formattedDateTime() {
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");

        String formattedDateTime = LocalDateTime.now().format(format);

        System.out.println("Formatted(dd/MM/yyyy hh:mm:ss a) Date Time :- " +
                formattedDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
        String time = "08.20.45";
        LocalTime localTimeObj = LocalTime.parse(time, formatter);

        System.out.println("Formatted(HH.mm.ss.nnn) Time :- " +
                localTimeObj);
    }

    void dateToString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        LocalDate now = LocalDate.now();
        String dateString = now.format(formatter);
        System.out.println(dateString);

        formatter = DateTimeFormatter.ofPattern("HH.mm");
        LocalTime today = LocalTime.now();
        String timeString = today.format(formatter);
        System.out.println(timeString);
    }


    void dateTimeMethods() {
        LocalDateTime dateTime = LocalDateTime.now();

        int year = dateTime.getYear();
        Month month = dateTime.getMonth();
        int month_numeric = dateTime.getMonthValue();
        int month_day = dateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        int getDayOfYear = dateTime.getDayOfYear();
        int getHour = dateTime.getHour();
        int minute = dateTime.getMinute();
        int seconds = dateTime.getSecond();
        int getNano = dateTime.getNano();

        System.out.println("Year :- " + year);
        System.out.println("month :- " + month);
        System.out.println("month_numeric :- " + month_numeric);
        System.out.println("month_day :- " + month_day);
        System.out.println("dayOfWeek :- " + dayOfWeek);
        System.out.println("getDayOfYear :- " + getDayOfYear);
        System.out.println("getHour :- " + getHour);
        System.out.println("minute :- " + minute);
        System.out.println("seconds :- " + seconds);
        System.out.println("getNano :- " + getNano);

    }

    void dateTime_of() {
        LocalDate date = LocalDate.of(2000, 8, 4);
        System.out.println("Date :" + date);

        LocalTime time = LocalTime.of(13, 10, 50);
        System.out.println("Time :" + time);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("Date Time :" + dateTime);

        dateTime = LocalDateTime.of(2000, 8, 4, 13, 10, 50);
        System.out.println("Date Time 2 :" + dateTime);
    }

    void dateTime_with() {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime specificDate =
                dateTime.withMonth(8).withDayOfMonth(10).withYear(2019);

        System.out.println("specfic date with " +
                "current time : " + specificDate);

        LocalDateTime specificTime =
                dateTime.withHour(8).withMinute(10).withSecond(50);

        System.out.println("specfic time with " +
                "current date : " + specificTime);
    }

    void dateTime_operations_plus() {
        LocalDate date = LocalDate.now();
        System.out.println(
                "current date : " + date);
        date = LocalDate.now().plusDays(5);

        System.out.println(
                "date after 5 days : " + date);

        date = LocalDate.now().plusMonths(5);

        System.out.println(
                "date after 5 months : " + date);

        date = LocalDate.now().plusWeeks(5);

        System.out.println(
                "date after 5 weeks : " + date);

        date = LocalDate.now().plusYears(5);

        System.out.println(
                "date after 5 years : " + date);

        LocalTime time = LocalTime.now();
        System.out.println(
                "current time : " + time);

        time = LocalTime.now().plusHours(5);

        System.out.println(
                "date after 5 hours : " + time);

        time = LocalTime.now().plusMinutes(5);

        System.out.println(
                "date after 5 minutes : " + time);

        time = LocalTime.now().plusSeconds(5);

        System.out.println(
                "date after 5 seconds : " + time);

        time = LocalTime.now().plusNanos(5);

        System.out.println(
                "date after 5 nano seconds : " + time);

    }

    void dateTime_operations_minus() {
        LocalDate date = LocalDate.now();
        System.out.println(
                "current date : " + date);
        date = LocalDate.now().minusDays(5);

        System.out.println(
                "date 5 days ago : " + date);

        date = LocalDate.now().minusMonths(5);

        System.out.println(
                "date 5 months ago : " + date);

        date = LocalDate.now().minusWeeks(5);

        System.out.println(
                "date 5 weeks ago : " + date);

        date = LocalDate.now().minusYears(5);

        System.out.println(
                "date 5 years ago : " + date);

        LocalTime time = LocalTime.now();
        System.out.println(
                "current time : " + time);

        time = LocalTime.now().minusHours(5);

        System.out.println(
                "time 5 hours ago : " + time);

        time = LocalTime.now().minusMinutes(5);

        System.out.println(
                "time 5 minutes ago : " + time);

        time = LocalTime.now().minusSeconds(5);

        System.out.println(
                "time 5 seconds ago : " + time);

        time = LocalTime.now().minusNanos(5);

        System.out.println(
                "time 5 nano seconds ago : " + time);

    }

    void zoned_dateTime() {
        ZoneId currentZoneId = ZoneId.systemDefault();
        System.out.println("Current zone ID: " + currentZoneId);

        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("Current zone :- " +
                currentZone.getZone());

        System.out.println("Current zone date time :- " +
                currentZone);

        ZoneId kuwait = ZoneId.of("Asia/Kuwait");

        ZonedDateTime kuwaitZone =
                currentZone.withZoneSameInstant(kuwait);

        System.out.println("Kuwait time zone :- " +
                kuwaitZone);

        ZonedDateTime dateTime = ZonedDateTime.parse("2019-11-04T11:16:30+05:30[Asia/Kolkata]");

        System.out.println("parsed zoned date time: " + dateTime);
        System.out.println("parsed zoned date time after 5 days: " + dateTime.plusDays(5));
    }

    void period() {
        LocalDate current_date = LocalDate.now();

        LocalDate new_date =
                LocalDate.of(2019, Month.JANUARY, 1);

        Period gap = Period.between(new_date, current_date);
        System.out.println("Period :- " + gap);
        System.out.println("Period Months :- " + gap.getMonths());
        System.out.println("Period Days :- " + gap.getDays());

    }

    void duraion() {
        LocalTime current_time = LocalTime.now();
        System.out.println("current time :- " +
                current_time);

        Duration tenHours = Duration.ofHours(10);

        LocalTime new_time = current_time.plus(tenHours);

        System.out.println("Time after ten hours :- "+ new_time);

        Duration gap = Duration.between(new_time, current_time);
        System.out.println("Duraion :- "  + gap);
    }

    void compatibility(){
        Date date = new Date();
        Calendar calendar = new Calendar.Builder().build();

        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }

    void parse(){
        LocalDate parsedDate = LocalDate.parse("2019-12-11");
        System.out.println(parsedDate);

        LocalTime parsedTime = LocalTime.parse("12:56:30");
        System.out.println(parsedTime);


    }

    void beforeAfterCheck(){
        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        System.out.println(isbefore);
        boolean isAfter = LocalTime.parse("08:30").isAfter(LocalTime.parse("07:30"));
        System.out.println(isAfter);
    }

    void compareTo(){
        int i = LocalTime.parse("06:30").compareTo(LocalTime.parse("07:30"));
        System.out.println(i);

        i = LocalTime.parse("07:30").compareTo(LocalTime.parse("07:30"));
        System.out.println(i);

        i = LocalTime.parse("07:30").compareTo(LocalTime.parse("06:30"));
        System.out.println(i);

    }

    void isLeapYear(){
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println(leapYear);

        leapYear = LocalDate.parse("2016-10-01").isLeapYear();
        System.out.println(leapYear);
    }


    void elapsedTime(){
        Instant start = Instant.now();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed);


        long startTime = System.nanoTime();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();

        long durationInNano = (endTime - startTime);
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);

        System.out.println(durationInNano);
        System.out.println(durationInMillis);
    }

    void chronoUnitEnums(){
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);
    }

    void temporalAdjuster(){
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //get the next tuesday
        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);

        //get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
                DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
    }

}
