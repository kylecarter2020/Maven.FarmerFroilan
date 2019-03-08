package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Produce.EarCorn;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    Chicken chickObj = new Chicken();
    EdibleEgg egg = new EdibleEgg();

    @Test
    public void makeNoiseTest() {
        String expectedNoise = "Cock-a-doodle-do!!";
        String actualNoise = chickObj.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void fertilizeTest() {
        Boolean expectedBool = true;
        chickObj.fertilize();
        Boolean actualBool = chickObj.getHasBeenFertilized();
        Assert.assertEquals(expectedBool, actualBool);
    }

    @Test
    public void yieldTest1() {
        //Given
        chickObj.fertilize();
        //When
        Object actualObj = chickObj.yield();
        //Then
        Assert.assertTrue(actualObj instanceof EdibleEgg);
    }

    @Test
    public void yieldTest2() {
        //Given
        Object actualObj = chickObj.yield();
        //When

        //Then
        Assert.assertNull(actualObj);
    }


    @Test
    public void eatTest() {
        //Given
        Edible food = new EarCorn();
        Boolean beforeIsFed = false;
        //When
        chickObj.eat(food);
        Boolean afterIsFed = chickObj.getChicFed();
        Assert.assertNotEquals(beforeIsFed, afterIsFed);
    }
}