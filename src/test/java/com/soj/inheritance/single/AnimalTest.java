package com.soj.inheritance.single;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest  {
    @Test
    public void TestOfEating(){
        Animal animal=new Animal();
      String actual=animal.eat();
      String expected=  "animal is eating";
        assertEquals(expected,
                actual);
    }


}