package com.soj.inheritance.multilevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BabyDogTest  {
    @Test
    void TestOfWeeping(){
        BabyDog babyDog=new BabyDog("eating","barking","weeping");
        String expected="weeping";
        String actual=babyDog.weep();
        Assertions.assertEquals(expected,actual);
    }
    @Test
     void TestOfBarking(){
        BabyDog babyDog=new BabyDog("eating","barking","weeping");
        String expected ="barking";
        String actual=babyDog.bark();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void TestOfEating() {
        BabyDog babyDog = new BabyDog("eating","barking","weeping");
        String expected = "eating";
        String actual = babyDog.eat();
        Assertions.assertEquals(expected, actual);
    }




}