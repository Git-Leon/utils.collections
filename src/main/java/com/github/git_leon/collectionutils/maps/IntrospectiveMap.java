package com.github.git_leon.collectionutils.maps;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IntrospectiveMap extends UnmodifiableMap<String, Object> {
    public IntrospectiveMap(Object objectToIntrospect) {
        this(objectToIntrospect, new ConcurrentHashMap<>());
    }

    public IntrospectiveMap(Object objectToIntrospect, Map<String, Object> map) {
        super(new DescriptiveMap<>(map));
        Field[] fields = objectToIntrospect.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                boolean defaultAccess = field.isAccessible();
                field.setAccessible(true);
                super.map.put(field.getName(), field.get(objectToIntrospect));
                field.setAccessible(defaultAccess);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                throw new Error(e);
            }
        }
    }
}