package com.soj.inheritance.hierarchical;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class TigerTest extends AnimalTest {

    @Test
    public void TestOfRoar(){
        Tiger tiger=new Tiger();
        String expected="Tiger is making the sound of roar";
        String actual=tiger.roar();
        assertEquals(expected,actual);

    }
    @Test
    public void TestOfEating(){
        Tiger tiger=new Tiger();
        String expected="animal is eating";
        String actual=tiger.eat();
        assertEquals(expected,actual);
    }
    @Test
    public void TestOfRoarNotSame(){
        Tiger tiger=new Tiger();
        String unexpected="Cat is making the sound of meow";
        String actual=tiger.roar();
        assertNotSame(unexpected,actual);
    }

}