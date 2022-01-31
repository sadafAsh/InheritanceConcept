package com.soj.inheritance.multilevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DogTest  {
    @Test
     void TestOfBarking(){
        Dog dog=new Dog("eating","barking");
        String expected ="barking";
        String actual=dog.bark();
        Assertions.assertEquals(expected,actual);
    }
    @Test
     void TestOfEating() {
        Dog dog = new Dog("eating","barking");
        String expected = "eating";
        String actual = dog.eat();
        Assertions.assertEquals(expected, actual);
    }


}