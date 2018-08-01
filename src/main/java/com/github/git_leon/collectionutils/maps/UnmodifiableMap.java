package com.github.git_leon.collectionutils.maps;

import java.util.Map;

public abstract class UnmodifiableMap<KeyType, ValueType> extends MapDecorator<KeyType, ValueType> {
    private static final Error illegalAccessError = new Error(new IllegalAccessException("UnmodifiableMap is immutable"));
    public UnmodifiableMap(Map<KeyType, ValueType> map) {
        super(map);
    }

    @Override
    public ValueType put(KeyType key, ValueType value) {
        throw illegalAccessError;
    }

    @Override
    public void putAll(Map map) {
        throw illegalAccessError;    }

    @Override
    public void clear() {
        throw illegalAccessError;
    }

    @Override
    public ValueType remove(Object key) {
        throw illegalAccessError;
    }
}
