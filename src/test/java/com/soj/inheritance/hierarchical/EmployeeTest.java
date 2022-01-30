package com.soj.inheritance.hierarchical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testToGetSalary() {
        Employee employee = new Employee(40000);
        int actual = employee.getSalary();
        int expected = 40000;
        Assertions.assertEquals(expected, actual);

    }




    @Test
    void testToDisplayTheSalary(){
        Employee employee=new Employee(40000);
        employee.displaySalary();
        Assertions.assertTrue(true,"employee get a salary");



    }

}