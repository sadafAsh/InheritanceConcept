package com.soj.inheritance.multilevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DogTest extends Animal {
    @Test
    public void TestOfBarking(){
        Dog dog=new Dog();
        String expected ="Dog is barking";
        String actual=dog.bark();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void TestOfEating() {
        Dog dog = new Dog();
        String expected = "animal is eating";
        String actual = dog.eat();
        Assertions.assertEquals(expected, actual);
    }


}