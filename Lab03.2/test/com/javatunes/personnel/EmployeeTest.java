package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee emp1;
    private Employee emp2;

    @Before
    public void setUp() {
        emp1 = new SalariedEmployee("Lynn", Date.valueOf("1999-09-09"));
        emp2 = new SalariedEmployee("Lynn", Date.valueOf("1999-09-09"));
    }

    @Test
    public void equals_shouldReturnFalse_differentNamesameHireDate() {
        emp2.setName("James");
        assertNotEquals(emp1, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_SameNamedifferentHireDate() {
        emp2.setHireDate(Date.valueOf("2000-02-02"));
        assertNotEquals(emp1, emp2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(emp1, emp2);
    }
}