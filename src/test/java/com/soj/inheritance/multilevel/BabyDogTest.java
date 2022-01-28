package com.soj.inheritance.multilevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BabyDogTest extends DogTest {
    @Test
    public void TestOfWeeping(){
        BabyDog babyDog=new BabyDog();
        String expected="Baby dog is weeping";
        String actual=babyDog.weep();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void TestOfBarking(){
        BabyDog babyDog=new BabyDog();
        String expected ="Dog is barking";
        String actual=babyDog.bark();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void TestOfEating() {
        BabyDog babyDog = new BabyDog();
        String expected = "animal is eating";
        String actual = babyDog.eat();
        Assertions.assertEquals(expected, actual);
    }




}