package com.soj.inheritance;

import com.soj.inheritance.hierarchical.Cat;
import com.soj.inheritance.hierarchical.Tiger;
import com.soj.inheritance.multilevel.BabyDog;
import com.soj.inheritance.single.Dog;

public class Main {
    public static void main(String[] args){
        System.out.println("multiple inheritance.....");
        Dog dog = new Dog();
        System.out.println( dog.eat());
        System.out.println(dog.bark());

        System.out.println("......................................");

        System.out.println("multilevel inheritance.............");
        BabyDog babyDog = new BabyDog();

        System.out.println(babyDog.eat());
        System.out.println( babyDog.bark());
        System.out.println( babyDog.weep());
        System.out.println("......................................");

        System.out.println("hierarchial inheritance.............");
        Cat cat= new Cat();
        String eat=cat.eat();
        System.out.println(eat);

        String sound=cat.meow();
        System.out.println(sound);

        Tiger tiger=new Tiger();
        String eat1=tiger.eat();
        System.out.println(eat1);

        String sound1=tiger.roar();
        System.out.println(sound1);

    }
}


