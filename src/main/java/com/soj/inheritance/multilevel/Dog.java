package com.soj.inheritance.multilevel;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog extends Animal {
    static final Logger logger = LogManager.getLogger(Dog.class.getName());

    String bark;

    public Dog(String eat, String bark) {
        super(eat);
        this.bark = bark;
    }

    public String bark(){
        return bark;
    }
}
