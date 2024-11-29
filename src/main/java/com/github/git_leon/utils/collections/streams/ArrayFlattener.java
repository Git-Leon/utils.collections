package com.github.git_leon.utils.collections.streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author leon on 8/7/18.
 */
public class ArrayFlattener {
    public static <ObjectType> Stream<ObjectType> flatten(ObjectType[] array) {
        return Arrays.stream(array).flatMap(
                o -> o instanceof Object[] ? flatten((ObjectType[]) o) : Stream.of(o));
    }

    public static void main(String[] args) {
        Integer[][][] array = {
                new Integer[][]{
                        new Integer[]{1}},
                new Integer[][]{
                        new Integer[]{2}},
                new Integer[][]{
                        new Integer[]{3},
                        new Integer[]{4},
                        new Integer[]{5},
                        new Integer[]{6},
                        new Integer[]{7}},
                new Integer[][]{
                        new Integer[]{8},
                        new Integer[]{9},
                        new Integer[]{10}}};

        System.out.println("original: " + Arrays.deepToString(array));

        Object[] flat = flatten(array).toArray();
        System.out.println("flat:     " + Arrays.toString(flat));
    }
}