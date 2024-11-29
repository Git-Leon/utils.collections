package com.github.git_leon.utils.collections;

import com.github.git_leon.utils.collections.lists.GapList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author leon on 8/9/18.
 */
public class ListFacade<ObjectType> implements Iterable<ObjectType> {
    private List<ObjectType> list;

    public ListFacade(List<ObjectType> list) {
        this.list = list;
    }

    public ListFacade(Iterable<ObjectType> iterable) {
        this(new GapList<>());
        iterable.forEach(o -> list.add(o));
    }

    public void add(ObjectType obj) {
        list.add(obj);
    }

    public void addAll(Collection<? extends ObjectType> objCollection) {
        list.addAll(objCollection);
    }

    public void remove(ObjectType obj) {
        list.remove(obj);
    }
 
    public ObjectType get(int index) {
        return list.get(index);
    }
    
    public Boolean contains(ObjectType obj) {
        return list.contains(obj);
    }

    public Integer size() {
        return list.size();
    }

    public ListFacade<ObjectType> filter(Predicate<ObjectType> predicate) {
        return new ListFacade<>(list.stream().filter(predicate).collect(Collectors.toList()));
    }

    public Collection<?> collect(Collector<? super ObjectType, ?, Collection<? extends ObjectType>> collector) {
        return list.stream().collect(collector);
    }

    public List<ObjectType> toList() {
        return list;
    }

    @Override
    public Iterator<ObjectType> iterator() {
        return list.iterator();
    }
}
