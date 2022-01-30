package com.soj.inheritance.single;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirdTest {
    @Test
    public void TestOfEating(){
        Bird animal=new Bird();
      String actual=animal.eat();
      String expected=  "Bird is eating fruit seed";
        assertEquals(expected,
                actual);
    }


}