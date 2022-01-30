package com.soj.inheritance.hierarchical;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Animal {

    static final Logger logger = LogManager.getLogger(Animal.class.getName());

    public String eat() {
        logger.trace("Eat method is been called");

        logger.debug("Hello");
        return "animal is eating";

    }
    public void add(int x, int y) {
        try {
            logger.info("Addition method called");
            logger.trace("First number is " + x);
            logger.trace("Second number is " + y);
            logger.debug("Addition method is called " + y);
            if (x == 0) {
                logger.error("x is 0");

            }

            Integer z = x + y;
            logger.trace("Result is  " + z);
            logger.debug("Addition method completed  with retrun value " + z);
            logger.trace("@Saying good by");
        } catch (Exception ex) {
            logger.error(ex);
        }
    }
}

