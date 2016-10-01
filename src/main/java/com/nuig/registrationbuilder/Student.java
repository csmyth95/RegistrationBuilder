package com.nuig.registrationbuilder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conor
 */
public class Student {
    private String name;
    private int age;
    private String dateOfBirth;
    private long studentID;
    private static long idAllocator = 0;
    
    public Student(String name, int age, String dob){
        this.name = name;
        this.age = age;
        this.dateOfBirth = dob;
        this.studentID = idAllocator;
        
        idAllocator += 1;
    }
    
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getStudentID() {
        return studentID;
    }

    public String getUsername() {
        return this.name + this.age;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
