package com.github.git_leon.collectionutils;

import com.github.git_leon.collectionutils.lists.GapList;

import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 8/9/18.
 */
public class ListFacade<ObjectType> implements Iterable<ObjectType> {
    public List<ObjectType> list;

    public ListFacade(List<ObjectType> list) {
        this.list = list;
    }

    public ListFacade(Iterable<ObjectType> iterable) {
        this(new GapList<>());
        iterable.forEach(o -> list.add(o));
    }

    public void add(ObjectType objectType) {
        list.add(objectType);
    }

    public void remove(ObjectType objectType) {
        list.remove(objectType);
    }

    public ObjectType get(int index) {
        return list.get(index);
    }

    @Override
    public Iterator<ObjectType> iterator() {
        return list.iterator();
    }
}
