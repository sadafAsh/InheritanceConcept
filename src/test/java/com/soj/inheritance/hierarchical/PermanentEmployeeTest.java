package com.soj.inheritance.hierarchical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermanentEmployeeTest {

    @Test
    void testForPermanentEmployeeSalaryShouldIncreaseBy10000() {
        PermanentEmployee permanent=new PermanentEmployee(40000,10000);
        int actual= permanent.incrementSalary();
        Assertions.assertEquals(50000,actual);
    }
    @Test
    void testForPermanentEmployeeSalaryIsFailed(){
        PermanentEmployee permanent=new PermanentEmployee(30000,10000);
        int actual= permanent.incrementSalary();
        Assertions.assertNotEquals(60000,actual);

    }
}