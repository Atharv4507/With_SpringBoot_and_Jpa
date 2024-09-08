package com.example.withspringbootjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String ename;
    private String edesignation;
    private String ecompany;
    @Column(columnDefinition = "double(10,2)")
    private double esalary;
    public void setEid(int eid) {
        this.eid = eid;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setEdesignation(String edesignation) {
        this.edesignation = edesignation;
    }
    public void setEcompany(String ecompany) {
        this.ecompany = ecompany;
    }
    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }
    public int getEid() {
        return eid;
    }
    public String getEname() {
        return ename;
    }
    public String getEdesignation() {
        return edesignation;
    }
    public String getEcompany() {
        return ecompany;
    }
    public double getEsalary() {
        return esalary;
    }
    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", edesignation=" + edesignation + ", ecompany=" + ecompany
                + ", esalary=" + esalary + "]";
    }
    
    
}

