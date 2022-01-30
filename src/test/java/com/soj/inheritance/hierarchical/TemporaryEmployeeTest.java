package com.soj.inheritance.hierarchical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemporaryEmployeeTest {


@Test
    void testForTemporaryEmployeeSalaryShouldIncreaseBy5000() {
            TemporaryEmployee temporary=new TemporaryEmployee(40000,5000);
            int actual= temporary.incrementSalary();
            Assertions.assertEquals(45000,actual);
            }
@Test
    void testForTermanentEmployeeSalaryIsFailed(){
            TemporaryEmployee temporary=new TemporaryEmployee(30000,10000);
            int actual= temporary.incrementSalary();
            Assertions.assertNotEquals(60000,actual);

            }
            }
