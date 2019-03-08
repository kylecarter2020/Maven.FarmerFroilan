package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Produce.Crop;

import java.util.ArrayList;
import java.util.List;

public abstract class Storage<T> {

    List<T> objectsToBeStored;

    public Storage() {
        this.objectsToBeStored = new ArrayList<T>();
    }

    public void add(T toBeStored){
        this.objectsToBeStored.add(toBeStored);
    }

    public void remove(T toBeRemoved){
        this.objectsToBeStored.remove(toBeRemoved);
    }
}
