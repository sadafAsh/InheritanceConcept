package com.soj.inheritance.hierarchical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {
    @Test
     void TestOfEating(){
        Animal animal=new Animal();
        String expected="animal is eating";
        String actual=animal.eat();
        Assertions.assertEquals(expected,actual);
        Assertions.assertTrue(true,animal.eat());
    }
    @Test
     void TestOfEatingFalse(){
        Animal animal=new Animal();
        String expected="eating .....";
        String actual=animal.eat();
        Assertions.assertNotEquals(expected,actual);

    }
}