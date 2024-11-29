package com.github.git_leon.utils.collections.maps;

import com.github.git_leon.utils.string.StringAssembler;
import com.github.git_leon.utils.collections.arrays.ArrayUtils;

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
                .append("\nKey: " + ArrayUtils.toString(entry.getKey()))
                .append("Value: " + ArrayUtils.toString(entry.getValue())));
        return sa.toString();
    }
}