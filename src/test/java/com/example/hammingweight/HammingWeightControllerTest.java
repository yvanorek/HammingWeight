package com.example.hammingweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingWeightControllerTest {

    private HammingWeightController hammingWeight=new HammingWeightController();

    @Test
    public void hammingWeightTest1(){
        String input="101010";
        int expectedOutput=3;
        int output=hammingWeight.getHammingWeight(input);
        assertEquals(expectedOutput,output);
    }

    @Test
    public void hammingWeightTest2(){
        String input="12304560789";
        int expectedOutput=9;
        int output=hammingWeight.getHammingWeight(input);
        assertEquals(expectedOutput,output);
    }

    @Test
    public void previosTest(){
        String input="12304560789";
        hammingWeight.getHammingWeight(input);
        assertEquals(input,hammingWeight.getPreviousHammingWeight());
    }



}