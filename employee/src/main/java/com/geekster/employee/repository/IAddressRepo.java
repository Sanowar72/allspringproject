package com.geekster.employee.repository;

import com.geekster.employee.model.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {
    @Modifying
    @Query(value = "update address set street = :street where address_id = :id" , nativeQuery = true)
    void updatestreetbyid(Long id,String street);


}
