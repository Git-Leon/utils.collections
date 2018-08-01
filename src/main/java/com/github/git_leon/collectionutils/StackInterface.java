package com.github.git_leon.collectionutils;

import java.util.Iterator;

public interface StackInterface<E> extends Iterable<E> {
    void push(E... e);

    E pop();

    E peek();

    boolean isEmpty();

    int size();

    @Override
    Iterator<E> iterator();
}
