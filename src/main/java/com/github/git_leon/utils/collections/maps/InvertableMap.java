package com.github.git_leon.utils.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class InvertableMap<KeyType, ValueType> extends MapDecorator<KeyType, ValueType> {
    public InvertableMap() {
        this(new DescriptiveMap<>());
    }

    public InvertableMap(Map<KeyType, ValueType> map) {
        super(map);
    }

    public KeyType getKey(ValueType value) {
        return invertMap().get(value);
    }

    public Map<ValueType, KeyType> invertMap() {
        Map<ValueType, KeyType> result = new HashMap<>();
        for (KeyType key : map.keySet()) {
            result.put(map.get(key), key);
        }
        return result;
    }

    @Override
    public String toString() {
        return map.toString();
    }

}
