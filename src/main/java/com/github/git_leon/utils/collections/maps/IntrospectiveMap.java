package com.github.git_leon.utils.collections.maps;

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
                String fieldName = field.getName();
                Object fieldValue = field.get(objectToIntrospect);
                super.map.put(fieldName, fieldValue);
                field.setAccessible(defaultAccess);
            } catch (Throwable npe){
            }
        }
    }
}
