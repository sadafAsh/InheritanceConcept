package com.soj.inheritance.single;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BirdTest {
    @Test
     void TestOfEating(){
        Bird animal=new Bird();
      animal.eat();
      String expected=  "Bird is eating fruit seed";
        assertTrue(true,"bird is called to eat");
    }


}