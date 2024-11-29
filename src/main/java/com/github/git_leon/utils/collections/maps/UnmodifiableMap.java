package com.github.git_leon.utils.collections.maps;

import java.util.Map;

public abstract class UnmodifiableMap<KeyType, ValueType> extends MapDecorator<KeyType, ValueType> {
    private static final UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("UnmodifiableMap is immutable");
    public UnmodifiableMap(Map<KeyType, ValueType> map) {
        super(Maps.copy(map));
    }

    @Override
    public ValueType put(KeyType key, ValueType value) {
        throw unsupportedOperationException;
    }

    @Override
    public void putAll(Map map) {
        throw unsupportedOperationException;    }

    @Override
    public void clear() {
        throw unsupportedOperationException;
    }

    @Override
    public ValueType remove(Object key) {
        throw unsupportedOperationException;
    }
}
