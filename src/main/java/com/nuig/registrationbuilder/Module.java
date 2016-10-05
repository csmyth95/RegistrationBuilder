/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuig.registrationbuilder;
import java.util.ArrayList;

/**
 *
 * @author conor
 */
public class Module {
    private String name;
    private String moduleID;
    private ArrayList<Student> students;
    
    public Module(String name, String id){
        this.name = name;
        this.moduleID = id;
        this.students = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    public void addStudent(Student s){
        this.students.add(s);
    }
    
    public void removeStudent(Student s){
        this.students.remove(s);
    }
    
}
