package com.geekster.employee.service;

import com.geekster.employee.model.Address;
import com.geekster.employee.repository.IAddressRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServices {
    @Autowired
    IAddressRepo addressRepo;

    public void addaddress(Address address) {
        addressRepo.save(address);
    }

    public Iterable<Address> getall() {
        return addressRepo.findAll();
    }

    public Optional<Address> getbyid(Long id) {
        return addressRepo.findById(id);
    }

    public String deletebyid(Long id) {
        addressRepo.deleteById(id);
        return "Successfully deleted";
    }
    @Transactional
    public void updatebyid(Long id, String street) {
      addressRepo.updatestreetbyid(id,street);
    }
}
