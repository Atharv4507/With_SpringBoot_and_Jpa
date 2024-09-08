package com.example.withspringbootjpa.service;

import java.util.List;

import com.example.withspringbootjpa.model.Employee;

public interface EmployeeService{
    Employee save(Employee e);
    int deleteByEid(int eid);
    int deleteByEname(String name);
    Employee findById(int eid);
    Employee findByEidAndEname(int eid,String ename);
    List<Employee> findByEidOrEname(int eid,String ename);
    List<Employee> findByEidLessThan(int eid);
    List<Employee> findByEidBetween(int low,int high);
    List<Employee> findByEidIsNotBeatween(int low, int high);
}
