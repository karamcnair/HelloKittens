package com.karamcnair;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by mcnair on 1/28/16 as 'physiotherapy' for java coding.
 */
// http://blog.radoszewski.pl/programming/java/2015/07/31/custom-java-8-collectors.html
//This means that you can collect Stream<T> to value of type R using some helper variables of type A while collecting.

    // for me, in the first collector, I want to collect a stream of Chars (T) to a value of a StringBuilder (R), using
    // helper variables of a character and a successive count (a class?)
    //
public class MostPopular<T> implements Collector<T, Map<T, Integer>, Optional<T>>
{

    @Override
    public Supplier<Map<T, Integer>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<T, Integer>, T> accumulator() {
        return (acc, elem) -> acc.merge(elem, 1, (old, v) -> old + v);
    }

    @Override
    public BinaryOperator<Map<T, Integer>> combiner() {
        return (acc1, acc2) -> {
            throw new UnsupportedOperationException();
        };
    }

    @Override
    public Function<Map<T, Integer>, Optional<T>> finisher() {
        return (acc) -> acc.entrySet().stream()
                .reduce((a,b) -> a.getValue() > b.getValue () ? a : b)
                .map(Map.Entry::getKey);
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }

}

