package com.ratipatil.corejava.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * ==========================================================
 * StreamAPIExample.java
 * ==========================================================
 * This program demonstrates the most commonly used
 * Stream API methods in Java 8+.
 *
 * Methods Covered:
 * 1. filter()
 * 2. map()
 * 3. sorted()
 * 4. distinct()
 * 5. limit()
 * 6. skip()
 * 7. count()
 * 8. min()
 * 9. max()
 * 10. reduce()
 * 11. collect()
 * 12. forEach()
 * 13. anyMatch()
 * 14. allMatch()
 * 15. noneMatch()
 * 16. findFirst()
 * 17. findAny()
 * ==========================================================
 */

public class StreamAPIExample {

    public static void main(String[] args) {

        // Sample data
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50, 20, 30);

        System.out.println("Original List:");
        System.out.println(numbers);

        /*
         * ==================================================
         * filter()
         * Returns elements matching a condition
         * ==================================================
         */
        System.out.println("\nfilter() - Numbers Greater Than 20");

        numbers.stream()
                .filter(num -> num > 20)
                .forEach(System.out::println);

        /*
         * ==================================================
         * map()
         * Transforms each element
         * ==================================================
         */
        System.out.println("\nmap() - Multiply By 2");

        numbers.stream()
                .map(num -> num * 2)
                .forEach(System.out::println);

        /*
         * ==================================================
         * distinct()
         * Removes duplicate elements
         * ==================================================
         */
        System.out.println("\ndistinct() - Remove Duplicates");

        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        /*
         * ==================================================
         * sorted()
         * Sorts elements
         * ==================================================
         */
        System.out.println("\nsorted() - Ascending Order");

        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        /*
         * ==================================================
         * limit()
         * Returns first N elements
         * ==================================================
         */
        System.out.println("\nlimit() - First 3 Elements");

        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        /*
         * ==================================================
         * skip()
         * Skips first N elements
         * ==================================================
         */
        System.out.println("\nskip() - Skip First 3 Elements");

        numbers.stream()
                .skip(3)
                .forEach(System.out::println);

        /*
         * ==================================================
         * count()
         * Counts total elements
         * ==================================================
         */
        long count = numbers.stream().count();

        System.out.println("\ncount()");
        System.out.println("Total Elements = " + count);

        /*
         * ==================================================
         * min()
         * Finds smallest element
         * ==================================================
         */
        Optional<Integer> min =
                numbers.stream()
                        .min(Integer::compareTo);

        System.out.println("\nmin()");
        System.out.println("Minimum = " + min.get());

        /*
         * ==================================================
         * max()
         * Finds largest element
         * ==================================================
         */
        Optional<Integer> max =
                numbers.stream()
                        .max(Integer::compareTo);

        System.out.println("\nmax()");
        System.out.println("Maximum = " + max.get());

        /*
         * ==================================================
         * reduce()
         * Combines elements into one result
         * Here we calculate total sum
         * ==================================================
         */
        int sum =
                numbers.stream()
                        .reduce(0, Integer::sum);

        System.out.println("\nreduce()");
        System.out.println("Sum = " + sum);

        /*
         * ==================================================
         * collect()
         * Converts Stream into List
         * ==================================================
         */
        List<Integer> newList =
                numbers.stream()
                        .filter(num -> num > 20)
                        .collect(Collectors.toList());

        System.out.println("\ncollect()");
        System.out.println(newList);

        /*
         * ==================================================
         * anyMatch()
         * Checks if any element matches condition
         * ==================================================
         */
        boolean anyMatch =
                numbers.stream()
                        .anyMatch(num -> num > 45);

        System.out.println("\nanyMatch()");
        System.out.println(anyMatch);

        /*
         * ==================================================
         * allMatch()
         * Checks if all elements match condition
         * ==================================================
         */
        boolean allMatch =
                numbers.stream()
                        .allMatch(num -> num > 5);

        System.out.println("\nallMatch()");
        System.out.println(allMatch);

        /*
         * ==================================================
         * noneMatch()
         * Checks if no element matches condition
         * ==================================================
         */
        boolean noneMatch =
                numbers.stream()
                        .noneMatch(num -> num < 0);

        System.out.println("\nnoneMatch()");
        System.out.println(noneMatch);

        /*
         * ==================================================
         * findFirst()
         * Returns first element
         * ==================================================
         */
        Optional<Integer> first =
                numbers.stream()
                        .findFirst();

        System.out.println("\nfindFirst()");
        System.out.println(first.get());

        /*
         * ==================================================
         * findAny()
         * Returns any element
         * ==================================================
         */
        Optional<Integer> any =
                numbers.stream()
                        .findAny();

        System.out.println("\nfindAny()");
        System.out.println(any.get());
    }
}