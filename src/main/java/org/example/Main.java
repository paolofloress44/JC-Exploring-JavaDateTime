package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
    }

    public static void exercise1(){
        LocalDate today = LocalDate.of(2025, Month.AUGUST, 21);


        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);
        System.out.println("Exercise 1: ");
        System.out.println(today.format(date1));
        System.out.println(today.format(date2));
    }
    public static void exercise2(){
        LocalTime now = LocalTime.of(16, 45, 30);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("\nExercise 2: ");
        System.out.println("Default format: " + now);
        System.out.println("24-hour format: " + now.format(dtf1));
        System.out.println("12-hour format with AM/PM: " + now.format(dtf2));
    }
    public static void exercise3(){
        System.out.println("\nExercise 3: ");
        LocalDateTime event = LocalDateTime.of(2025, 11, 27, 19, 0, 0);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        System.out.println("Default format: " + event);
        System.out.println("Custom format: " + event.format(dtf));
    }
    public static void exercise4(){
        System.out.println("\nExercise 4: ");
        LocalDate startDate = LocalDate.of(2025, 9, 1);

        // Attempt to add 10 days, but don't assign the result
        startDate.plusDays(10);

        System.out.println("Start date after trying to modify it: " + startDate);

        // Now, correctly add 10 days by assigning the result to a new variable
        LocalDate endDate = startDate.plusDays(10);

        System.out.println("The original start date is still: " + startDate);
        System.out.println("The new end date is: " + endDate);
    }
    public static void exercise5(){
        System.out.println("\nExercise 5: ");
        LocalDateTime baseTime = LocalDateTime.of(2025, 10, 15, 10, 30, 0);

        LocalDateTime futureTime = baseTime.plusYears(1).plusMonths(2).plusHours(5);
        LocalDateTime pastTime = baseTime.minusWeeks(3).minusDays(3);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Base time:   " + baseTime.format(dtf));
        System.out.println("Future time: " + futureTime.format(dtf));
        System.out.println("Past time:   " + pastTime.format(dtf));
    }
    public static void exercise6(){
        System.out.println("\nExercise 6:");
        LocalDate date1 = LocalDate.of(2024, 3, 15);
        LocalDate date2 = LocalDate.of(2026, 7, 20);

        Period period = Period.between(date1, date2);

        System.out.print("The period between the two dates is: ");
        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, and ");
        System.out.println(period.getDays() + " days.");
    }
}