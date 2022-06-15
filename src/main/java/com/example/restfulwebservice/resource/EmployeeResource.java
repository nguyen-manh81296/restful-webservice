package com.example.restfulwebservice.resource;

import com.example.restfulwebservice.entity.Employee;
import com.example.restfulwebservice.model.EmployeeModel;

import com.example.restfulwebservice.model.MysqlEmployeeModel;

import javax.ws.rs.*;
import java.util.List;

@Path("/employees")
@Produces("application/json")
@Consumes("application/json")
public class EmployeeResource {

    EmployeeModel employeeModel;

    public EmployeeResource() {
        employeeModel = new MysqlEmployeeModel();
    }

    @GET
    public List<Employee> fillAll(){
        return employeeModel.getEmployees();
    }

    @POST
    public boolean addEmployees(Employee employee){
        return employeeModel.addEmployees(employee);
    }

    @PUT
    @Path("{id}")
    public boolean updateEmployee(@PathParam("id") int id, Employee updateEmployee){
        return employeeModel.updateEmployee(updateEmployee, id);
    }
}
