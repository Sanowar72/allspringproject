package com.mapping.mapping.practice.repository;

import com.mapping.mapping.practice.model.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends CrudRepository<Address,Long> {

    @Modifying
    @Query(value = "update address set state = :name where address_id = :id" , nativeQuery = true)
    void updatefirstnamebyid(Long id,String name);
}
