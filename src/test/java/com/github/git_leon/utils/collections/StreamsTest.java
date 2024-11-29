package com.github.git_leon.utils.collections;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {
    @Test
    public void test1() {
        System.out.println(Streams.reverse(Stream.of("The quick brown fox jumps over the lazy dog".split(" ")))
                .collect(Collectors.toList()));
    }
}
