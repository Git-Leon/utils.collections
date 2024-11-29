package com.github.git_leon.utils.collections.maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapDecorator<KeyType, ValueType> implements Map<KeyType, ValueType> {
    protected Map<KeyType, ValueType> map;

    public MapDecorator(Map<KeyType, ValueType> map) {
        this.map = map;
    }

    @Override
    public int size() {
        return map.entrySet().size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public ValueType get(Object key) {
        return map.get(key);
    }

    @Override
    public ValueType put(KeyType key, ValueType value) {
        return map.put(key, value);
    }

    @Override
    public ValueType remove(Object key) {
        return map.remove(key);
    }

    @Override
    public void putAll(Map<? extends KeyType, ? extends ValueType> m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<KeyType> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<ValueType> values() {
        return map.values();
    }

    @Override
    public Set<Entry<KeyType, ValueType>> entrySet() {
        return map.entrySet();
    }

    @Override
    public String toString() {
        return map.toString();
    }

}
