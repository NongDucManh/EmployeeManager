package com.example.employeemanager.Service;

import com.example.employeemanager.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employeeList;

    public EmployeeService() {
        this.employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"nam",18,"bac ninh"));
        employeeList.add(new Employee(2,"thang",15,"bac giang"));
        employeeList.add(new Employee(3,"hoang",20,"thanh hoa"));

    }
    public List<Employee> findAll(){
        return  employeeList;
    }
    public Employee findEmployeeById(int id){
        for(Employee e: employeeList ){
            if (e.getId()==id){
                return e;
            }
        }
        return null;
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void update(Employee employee){
        int index = employeeList.indexOf(findEmployeeById(employee.getId()));
        employeeList.set(index,employee);
    }

}
