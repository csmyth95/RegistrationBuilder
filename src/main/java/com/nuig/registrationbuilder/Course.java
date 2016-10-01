/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuig.registrationbuilder;
import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 *
 * @author conor
 */
public class Course {
    //Course Name (CS & IT or ECE, etc), List of modules, Academic Start date and End dates
    private String name;
    private ArrayList<Module> modules;
    private LocalDate startDate;
    private LocalDate endDate;
    
    public Course(String n, LocalDate sD, LocalDate eD){
        this.name = n;
        this.startDate = sD;
        this.endDate = eD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
