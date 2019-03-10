package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Producer;

public abstract class Crop<T extends Edible> implements Producer {
    protected Boolean hasBeenFertilized;
    protected Boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public abstract T yield();

    public boolean fertilize(){
       return this.hasBeenFertilized = true;
    }

    public boolean getHasBeenFertilized(){
        return fertilize();
    }

    public boolean harvest(){
       return this.hasBeenHarvested = true;

    }
}
