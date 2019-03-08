package com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Producer;

public abstract class Crop<T extends Edible> implements Producer {
    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public abstract T yield();

    public void fertilize(){
        this.hasBeenFertilized = true;
    }

    public void harvest(){
        this.hasBeenHarvested = true;
    }
}
