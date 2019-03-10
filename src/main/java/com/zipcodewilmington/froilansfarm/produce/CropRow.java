package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Producer;

import java.util.ArrayList;
import java.util.List;

public class CropRow <T extends Crop> implements Producer {
    private List<Crop> crops = new ArrayList<>();

    public CropRow() {
    }

    public CropRow(List<Crop> crop) {
        this.crops = crop;
    }

    public Crop yield() {
        return null;
    }

    public void addCrop(List<Crop> crops) {
        this.crops = crops;
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public Crop harvestCrops(){
        this.crops = null;
        return null;
    }
}
