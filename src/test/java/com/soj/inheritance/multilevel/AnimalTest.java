package com.soj.inheritance.multilevel;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {
    @Test
     void TestOfEating(){
        Animal animal=new Animal("animal is eating");
        String expected="animal is eating";
        String actual=animal.eat();
        Assertions.assertEquals("animal is eating",actual);
        Assertions.assertTrue(true,animal.eat());
    }
    @Test
 void TestOfEatingFalse(){
        Animal animal=new Animal("animal is eating");
        String expected="dog is eating";
        String actual=animal.eat();
        Assertions.assertNotEquals(expected,actual);

    }
}