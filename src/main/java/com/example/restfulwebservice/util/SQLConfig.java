package com.example.restfulwebservice.util;

public class SQLConfig {

    public static final String DATABASE_Employee_INSERT = "insert into employees ( name, wage ) values (?,?)";
    public static final String DATABASE_Employee_SELECT = "select * from employees";
    public static final String DATABASE_Employee_UPDATE = "update employees set name = ?, wage = ? where id = ?";
}
