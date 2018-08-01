package com.github.git_leon.collectionutils.maps;

import com.github.git_leon.StringAssembler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DescriptiveMap<KeyType, ValueType> extends MapDecorator<KeyType, ValueType> {
    public DescriptiveMap() {
        this(new ConcurrentHashMap<>());
    }

    public DescriptiveMap(Map<KeyType, ValueType> map) {
        super(map);
    }

    @Override
    public String toString() {
        StringAssembler sa = new StringAssembler("\n");
        entrySet().forEach(entry -> sa
                .append("\nKey: " + entry.getKey())
                .append("Value: " + entry.getValue()));
        return sa.toString();
    }
}