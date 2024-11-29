package com.github.git_leon.utils.collections;

import com.github.git_leon.utils.collections.arrays.ArrayUtils;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class Streams {
    public static <T> Stream<T> reverse(Stream<T> input) {
        Object[] temp = input.toArray();
        return (Stream<T>) IntStream.range(0, temp.length)
                .mapToObj(i -> temp[temp.length - i - 1]);
    }

    public static <T> Stream<T> flatten(T[] array) {
        return Arrays.stream(array).flatMap(o -> {
            if (ArrayUtils.isArray(o)) {
                return flatten((T[]) ArrayUtils.toNonPrimitiveArray(o));
            } else {
                return Stream.of(o);
            }
        });
    }

}
