package com.soj.inheritance.hierarchical;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatTest extends AnimalTest {


    @Test
     void TestOfEating() {
        Cat cat=new Cat();
        String expected = "animal is eating";
        String actual = cat.eat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void TestOfMeow() {
Cat cat=new Cat();
String expected="Cat is making the sound of meow";
String actual=cat.meow();
Assertions.assertTrue(true,"Cat is making the sound of meow");
Assertions.assertEquals(expected,actual);
    }
}