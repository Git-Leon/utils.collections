package com.github.git_leon.collectionutils.maps;

import com.github.git_leon.StringAssembler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class InvertableMap<KeyType, ValueType> implements Map<KeyType, ValueType> {
    private Map<KeyType, ValueType> map = new ConcurrentHashMap<KeyType, ValueType>();

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

    public KeyType getKey(ValueType value){
        return invertMap().get(value);
    }

    public Map<ValueType, KeyType> invertMap() {
        Map<ValueType, KeyType> result = new HashMap<>();
        for(KeyType key: map.keySet()){
            result.put(map.get(key), key);
        }
        return result;
    }

    @Override
    public String toString() {
        StringAssembler sa = new StringAssembler("\n");
        entrySet().forEach(entry -> sa
                .append("Key: " + entry.getKey())
                .append("Value: " + entry.getValue()));
        return sa.toString();
    }
}
