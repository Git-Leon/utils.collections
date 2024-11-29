package com.github.git_leon.utils.collections.maps;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum Maps {
    ;

    public static <KeyType, ValueType> Map<KeyType, ValueType> copy(Map<KeyType, ValueType> source) {
        final Map newMap;
        try {
            newMap = source.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new Error(e);
        }
        newMap.putAll(source);
        return newMap;
    }

    public static <KeyType, ValueType> List<Pair<KeyType, ValueType>> toPairList(Map<KeyType, ValueType> map) {
        List<Pair<KeyType, ValueType>> pairList = new ArrayList<>();
        map.forEach((key, value) -> pairList.add(new Pair(key, value)));
        return pairList;
    }
}
