package com.fouadev.exercice1;

import java.util.ArrayList;
import java.util.List;

public class StorageGenerique<T> {

    public List<T> list = new ArrayList<>();

    public void addElement(T o) {
        list.add(o);
    }

    public T getElement(int index) {
        return list.get(index);
    }

    public void removeElement(int index){
        System.out.println("removed: "+list.remove(index));
    }

    public int getSize() {
        return list.size();
    }
}
