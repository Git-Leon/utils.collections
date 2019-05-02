package com.github.git_leon.collectionutils;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    @SuppressWarnings("unchecked")
    public static <T> Stream<T> reverse(Stream<T> input) {
        Object[] temp = input.toArray();
        return (Stream<T>) IntStream.range(0, temp.length)
                .mapToObj(i -> temp[temp.length - i - 1]);
    }
}
