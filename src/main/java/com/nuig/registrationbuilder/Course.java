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
    private String name;
    private ArrayList<Module> modules;
    private LocalDate startDate;
    private LocalDate endDate;
    
    public Course(String n, LocalDate sD, LocalDate eD){
        this.name = n;
        this.startDate = sD;
        this.endDate = eD;
        this.modules = new ArrayList<>();
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
    
    public void addModule(Module m){
        this.modules.add(m);
    }
    
    public void removeModule(Module m){
        this.modules.remove(m);
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
