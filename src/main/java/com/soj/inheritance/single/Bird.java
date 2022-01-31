package com.soj.inheritance.single;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bird {
    static final Logger logger = LogManager.getLogger(Bird.class.getName());
    public void eat(){
        logger.trace("Bird is eating fruit seed");
    }
}
