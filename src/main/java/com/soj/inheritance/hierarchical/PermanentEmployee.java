package com.soj.inheritance.hierarchical;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class PermanentEmployee extends Employee {
    static final Logger logger = LogManager.getLogger(PermanentEmployee.class.getName());
    private int hikeSalary;

    public PermanentEmployee(int salary, int hikeSalary) {
        super(salary);

        this.hikeSalary = hikeSalary;
    }

    public int incrementSalary(){

        logger.info("The increase salary of permanent employee");
     int increaseSalary= getSalary()+hikeSalary;

        logger.info("Permanent employee salary is {} ",increaseSalary);

return increaseSalary;


    }
}
