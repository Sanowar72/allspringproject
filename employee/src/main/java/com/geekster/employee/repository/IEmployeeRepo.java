package com.geekster.employee.repository;

import com.geekster.employee.model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
    @Modifying
    @Query(value = "update employee set first_name = :firstName where employee_id = :id" , nativeQuery = true)
    void updatefirstnamebyid(Long id,String firstName);
}
