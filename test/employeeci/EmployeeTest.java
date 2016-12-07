/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeci;

import Agile.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TARUC
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of equals method, of class Employee.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Employee instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpNameWithHighestSalary method, of class Employee.
     */
    @Test
    public void testGetEmpNameWithHighestSalary() {
        System.out.println("getEmpNameWithHighestSalary");
        String expResult = "James";
        String result = Employee.getEmpNameWithHighestSalary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHighestPaidEmployee method, of class Employee.
     */
    @Test
    public void testGetHighestPaidEmployee() {
        System.out.println("getHighestPaidEmployee");
        Employee expResult = new Employee(1,"Sin",2000);
        Employee result = Employee.getHighestPaidEmployee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
