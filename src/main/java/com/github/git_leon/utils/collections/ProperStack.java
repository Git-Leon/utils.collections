package com.github.git_leon.utils.collections;


import java.util.*;


/**
 * Created by leon on 3/13/18.
 */
public class ProperStack<E> implements StackInterface<E> {
    private Stack<E> stack;

    public ProperStack(Iterable<E> iterable) {
        stack = new Stack<>();
        if (iterable != null)
            iterable.forEach((stackElement) -> stack.add(stackElement));
    }

    public ProperStack() {
        this(null);
    }

    @Override
    public void push(E... e) {
        stack.addAll(Arrays.asList(e));
    }

    @Override
    public E pop() {
        return stack.pop();
    }

    @Override
    public E peek() {
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public Iterator<E> iterator() {
        return stack.iterator();
    }
}
