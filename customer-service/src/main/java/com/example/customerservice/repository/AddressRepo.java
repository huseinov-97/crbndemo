package com.example.customerservice.repository;


import com.example.customerservice.entity.Adresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Adresses, Long> {
}
