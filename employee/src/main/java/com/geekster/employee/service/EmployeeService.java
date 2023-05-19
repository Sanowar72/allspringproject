package com.geekster.employee.service;

import com.geekster.employee.model.Address;
import com.geekster.employee.model.Employee;
import com.geekster.employee.repository.IEmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public Iterable<Employee> getall() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getbyid(Long id) {
        return employeeRepo.findById(id);
    }


    public String deletebyid(Long id) {
        employeeRepo.deleteById(id);
        return "Successfully deleted";
    }

    @Transactional
    public void updatebyid(Long id, String firstName) {
        employeeRepo.updatefirstnamebyid(id,firstName);
    }

    public void addemployee(Employee employee) {
         Address employeeList = employee.getAddress();
         employeeList.setEmployee(employee);

        /*for(Address address :  addressList)
        {
            //List.of(user);//creating a list of Users : right now just contains one user: passed from postman
            //List<User> list = new ArrayList<>();
            //list.add(user);
            address.setUser(List.of(user));
        }*/
        employeeRepo.save(employee);
    }
}
