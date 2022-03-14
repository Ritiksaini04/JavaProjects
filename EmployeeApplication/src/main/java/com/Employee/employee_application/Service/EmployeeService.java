package com.Employee.employee_application.Service;

import com.Employee.employee_application.Entity.Employee;
import com.Employee.employee_application.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    //Returns the list of employees in the Repository
    public List<Employee> listAll(){
        return empRepo.findAll();
    }

    //This will save the Employee Information in Repository
    public void saveEmployeeInformation(Employee emp){
        empRepo.save(emp);
    }

    //This will return the EmployeeInformation by searching through empid;
    public Employee get(int id){
        return empRepo.getById(id);
    }

    //This will delete the Employee from the database using the EmployeeID user wants to delete.
    public void delete(int id){

        empRepo.deleteById(id);
    }
}
