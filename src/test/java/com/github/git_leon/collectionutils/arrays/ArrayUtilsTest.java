package com.github.git_leon.collectionutils.arrays;

import com.github.git_leon.collectionutils.maps.DescriptiveMap;
import org.junit.Test;

import java.util.Map;

public class ArrayUtilsTest {
    @Test
    public void test1() {
        System.out.println(ArrayUtils.toString("The quick brown fox jumps over the lazy dog".split(" ")));
    }
    @Test
    public void test2() {
        Map<Object, String[]> map = new DescriptiveMap<>();
        map.put(new Object(), "The quick brown fox jumps over the lazy dog".split(" "));
        System.out.println(map);
    }
}
