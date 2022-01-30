package com.soj.inheritance.hierarchical;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Employee {

    static final Logger logger = LogManager.getLogger(Employee.class.getName());

    private int salary;




    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void displaySalary() {
        logger.log(Level.DEBUG," The employee of the salary is : {}",salary);

    }




}





