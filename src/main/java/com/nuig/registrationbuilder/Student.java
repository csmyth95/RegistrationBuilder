package com.nuig.registrationbuilder;

import org.joda.time.LocalDate;

/**
 *
 * @author conor
 */
public class Student {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private long studentID;
    private static long idAllocator = 0;
    
    public Student(String name, int age, LocalDate dob){
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

    public LocalDate getDateOfBirth() {
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

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
