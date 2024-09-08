package com.example.withspringbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.withspringbootjpa.dao.EmployeeDao;
import com.example.withspringbootjpa.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeDao ed;

    @Override
    public Employee save(Employee e) {
        return ed.save(e);
    }

    @Override
    public int deleteByEid(int eid) {
        return ed.deleteByEid(eid);
    }

    @Override
    public Employee findById(int eid) {
        return ed.findById(eid);
    }

    @Override
    public int deleteByEname(String name) {
        return ed.deleteByEname(name);
    }

    

    @Override
    public List<Employee> findByEidOrEname(int eid, String ename) {
        return ed.findByEidOrEname(eid, ename);
    }

    @Override
    public Employee findByEidAndEname(int eid, String ename) {
        return ed.findByEidAndEname(eid, ename);
    }

    @Override
    public List<Employee> findByEidLessThan(int eid) {
        return ed.findByEidLessThan(eid);
    }

    @Override
    public List<Employee> findByEidBetween(int low, int high) {
        return ed.findByEidBetween(low, high);
    }

    @Override
    public List<Employee> findByEidIsNotBeatween(int low, int high) {
        return ed.findByEidIsNotBeatween(low,high);
    }

    
}
