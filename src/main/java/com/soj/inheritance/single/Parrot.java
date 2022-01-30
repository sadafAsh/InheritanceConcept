package com.soj.inheritance.single;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Parrot extends Bird {

    static final Logger logger = LogManager.getLogger(Parrot.class.getName());
    public void sound() {
        logger.trace("Parrot is making the sound of chirping");
    }
    }
