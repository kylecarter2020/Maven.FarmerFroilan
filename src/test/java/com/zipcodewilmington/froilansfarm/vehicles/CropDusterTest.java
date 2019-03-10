package com.zipcodewilmington.froilansfarm.vehicles;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.people.FarmWorker;
import com.zipcodewilmington.froilansfarm.produce.*;
import com.zipcodewilmington.froilansfarm.storage.Field;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CropDusterTest {
    private Farm farm;

    CropDuster cropDusterObj = new CropDuster();



    @Test
    public void makeNoiseTest() {
        String expectedNoise = "Zoom!";
        String actualNoise = cropDusterObj.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void fertilizeTest() {
       //Given
        Boolean isCropRowFertilized = false;
        CropRow cropRow = new CropRow();
        cropRow.getCrops().get(0);


    }

    @Test
    public void operateTest() {
    }

    @Test
    public void rideTest() {
        //Given
        Boolean beforeFlown = false;
        //When
        cropDusterObj.ride();
        Boolean afterFlown = cropDusterObj.getCropDusterFlown();
        //Then
        Assert.assertNotEquals(beforeFlown, afterFlown);




    }
}