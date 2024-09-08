package com.example.withspringbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.withspringbootjpa.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
    
    @SuppressWarnings("unchecked")
    Employee save(Employee e);
    int deleteByEid(int eid);
    int deleteByEname(String name);
    Employee findById(int eid);
    Employee findByEidAndEname(int eid,String ename);
    List<Employee> findByEidOrEname(int eid,String ename);
    List<Employee> findByEidLessThan(int eid);
    List<Employee> findByEidBetween(int low,int high);
    /*if JPQL is not worked means 'findByEidIsNotBeatween' this method doesn't worked 
     * you can always go with following options
     * 1) HQL (Hibernate Query language)
     *      - Syntax:
     *              from employee where eid not between :a and :b
     *      - Example:
     *              @Query(value = "from employee where eid not between :a and :b")
     *              List<Employee> findByEidIsNotBeatween(@Param("a") int low, @Param("b") int high);
     * 
     * 2) SQL (Structured Query language)
     *      -syntax:
     *              select * from Employee where eid not between ?1 and ?2
     *      -Example:
     *              @Query(value = "select * from Employee where eid not between ?1 and ?2",nativeQuery = true)
     *              List<Employee> findByEidIsNotBeatween(int low, int high);
     */
    @Query(value = "from employee where eid not between :a and :b")
    List<Employee> findByEidIsNotBeatween(@Param("a") int low, @Param("b") int high);
}
