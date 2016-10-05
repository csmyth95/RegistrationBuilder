/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuig.registrationbuilder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.LocalDate;

/**
 *
 * @author conor
 */
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getName method, of class Student.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("David", 18, new LocalDate(1995,10,27));
        String expResult = "David";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Student.
     */
    @org.junit.Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student("David", 18, new LocalDate(1995,10,27));
        int expResult = 18;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateOfBirth method, of class Student.
     */
    @org.junit.Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Student instance = new Student("David", 18, new LocalDate(1995,10,27));
        LocalDate expResult = new LocalDate(1995,10,27);
        LocalDate result = instance.getDateOfBirth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @org.junit.Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = new Student("David", 18, new LocalDate(1995,10,27));
        long expResult = 0L;
        long result = instance.getStudentID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @org.junit.Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Student instance = new Student("David", 18, new LocalDate(1995,10,27));
        String expResult = "David18";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setName method, of class Student.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Conor";
        LocalDate dob = new LocalDate();
        Student instance = new Student("David", 18, new LocalDate(1995,10,27));
        instance.setName(name);
    }

    /**
     * Test of setAge method, of class Student.
     */
    @org.junit.Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 24;
        Student instance = new Student("David", 18, new LocalDate(1995,10,27));
        instance.setAge(age);
    }

    /**
     * Test of setDateOfBirth method, of class Student.
     */
    @org.junit.Test
    public void testSetDateOfBirth() {
        System.out.println("setDateOfBirth");
        LocalDate dateOfBirth = new LocalDate(1995,10,27);
        Student instance = new Student("David", 18, new LocalDate(1995,10,27));
        instance.setDateOfBirth(dateOfBirth);
    }
    
}
