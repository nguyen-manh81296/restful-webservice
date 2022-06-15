package com.example.restfulwebservice.model;

import com.example.restfulwebservice.entity.Employee;

import java.util.List;

public interface EmployeeModel {

    List<Employee> getEmployees();
    boolean addEmployees(Employee e);
    boolean updateEmployee(Employee e, int id);
}
