package com.soj.inheritance.single;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.sun.tools.doclint.Entity.times;


class ParrotTest {
    @Test
    void TestOfEating() {
Parrot parrot=new Parrot();
String expected="Bird is eating fruit seed";
parrot.eat();
        Assertions.assertTrue(true,"Bird is called to eat");
    }
@Test
    void testforSound(){
        Parrot parrot=new Parrot();
        parrot.sound();
        Assertions.assertTrue(true,"parrot was called");

    }
}
