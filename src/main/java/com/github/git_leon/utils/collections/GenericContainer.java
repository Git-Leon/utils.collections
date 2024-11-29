package com.github.git_leon.utils.collections;

public class GenericContainer<SomeObjectType> {
    private SomeObjectType value;

    public GenericContainer() {
        this(null);
    }

    public GenericContainer(SomeObjectType value) {
        this.value = value;
    }

    public void setValue(SomeObjectType value) {
        this.value = value;
    }

    public SomeObjectType getValue() {
        return this.value;
    }
}
