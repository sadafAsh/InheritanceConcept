package com.soj.inheritance;

import com.soj.inheritance.hierarchical.PermanentEmployee;
import com.soj.inheritance.hierarchical.TemporaryEmployee;
import com.soj.inheritance.multilevel.BabyDog;
import com.soj.inheritance.single.Parrot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("single inheritance.....");
        Parrot parrot = new Parrot();
        String parrotEat=parrot.eat();
        logger.debug(parrotEat);
        parrot.sound();



        logger.info("......................................");

        logger.info("multilevel inheritance.............");
        BabyDog babyDog = new BabyDog("animal is eating","dog is barking","babyDog is weeping");
        String babyDogEat = babyDog.eat();
        logger.debug(babyDogEat);
        String babyDogBark = babyDog.bark();
        logger.debug(babyDogBark);
        String babyDogWeep = babyDog.weep();
        logger.debug(babyDogWeep);
        logger.info("......................................");

        logger.info("hierarchical inheritance.............");


        PermanentEmployee permanent=new PermanentEmployee(40000,10000);
        permanent.displaySalary();
        permanent.incrementSalary();


        TemporaryEmployee temporary=new TemporaryEmployee(40000,5000);
        temporary.displaySalary();
        temporary.incrementSalary();



    }
}


