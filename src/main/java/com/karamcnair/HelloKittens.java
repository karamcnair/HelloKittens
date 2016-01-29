package com.karamcnair;

import java.net.Inet4Address;
import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
import java.util.stream.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.io.StringReader;
import java.util.List;
import java.util.Optional;

/**
 * Created by mcnair on 2016-01-27.
 */
@SuppressWarnings("DefaultFileTemplate")
class HelloKittens {

    public static void main(String[] args)
    {
        //        System.out.println("howdy, fuzzballs!");
        //        System.out.println("holy cats! 'sout' is awesome!");

        // studying http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
        //        Stream.of("a1", "a2", "b3", "c4", "c")
        //                .filter(s -> {
        //                    System.out.println("filter: " + s);
        //                    return true;
        //                }).forEach(s-> System.out.println("forEach: " + s));
        //
        //
        //        Stream.of("A2", "a2", "b1", "b3", "c")
        //                .map(s -> {
        //                    System.out.println("map: " + s);
        //                    return s.toUpperCase();
        //                })
        //                .anyMatch(s -> {
        //                    System.out.println("anyMatch: " + s);
        //                    return s.startsWith("A");
        //                });


        Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
            System.out.println("filter: " + s);
            return s.toLowerCase().startsWith("a");
        }).map(s -> {
            System.out.println("map: " + s);
            return s.toUpperCase();
        }).forEach(s -> System.out.println("forEach: " + s));

        String theString = "this is a test string";
        char cs[] = theString.toCharArray();

        ArrayList<Character> chars = new ArrayList<Character>();

        for (char c : cs) {
            chars.add(c);
        }
        showMostPopular(chars);

    }
        private static <T> void showMostPopular(List<T> list) {
            Optional<T> o = list.stream()
                    .collect(new MostPopular<>());

            System.out.println("Most popular element in [" + list + "]");
            o.ifPresent(System.out::println);
        }

    }


    // finally a clearer example :) http://blog.radoszewski.pl/programming/java/2015/07/31/custom-java-8-collectors.html
