package com.soj.inheritance.single;

import com.soj.inheritance.single.Animal;
import com.soj.inheritance.single.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DogTest extends Animal {
@Test
     void TestOfBarking(){
    Dog dog=new Dog();
   String actual= dog.bark();
   String expected="dog is barking";
    Assertions.assertEquals(expected,actual);

}
@Test
     void TestOfEating(){
    Dog dog=new Dog();
    String expected="animal is eating";
    String actual=dog.eat();
    Assertions.assertEquals(expected,actual);
}
}