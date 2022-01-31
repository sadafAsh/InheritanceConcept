package com.soj.inheritance.hierarchical;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TemporaryEmployee extends Employee {
    static final Logger logger = LogManager.getLogger(TemporaryEmployee.class.getName());
    private int hikeSalary=5000;

    public TemporaryEmployee(int salary, int hikeSalary) {
        super(salary);
        this.hikeSalary = hikeSalary;
    }

    public int incrementSalary(){
        logger.info("The increase  salary of temporary employee");
        int increaseSalary=  getSalary()+hikeSalary;

        logger.info("Temporary employee salary is {} ",increaseSalary);

        return increaseSalary;
    }
}
