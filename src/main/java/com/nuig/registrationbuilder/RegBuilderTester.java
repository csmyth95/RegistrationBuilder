/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuig.registrationbuilder;
import com.nuig.registrationbuilder.Student;
import org.joda.time.LocalDate;

/**
 *
 * @author conor
 */
public class RegBuilderTester {
    public static void main(String[] args){
        System.out.println("Classes to create Student, Module & Course Objects");
        Student conor = new Student("Conor Smyth", 20, new LocalDate(1995,10,27));
        System.out.println("Name of 1st student is: " + conor.getName());
    }
}
