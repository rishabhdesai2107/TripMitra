package com.acts.tripmitra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acts.tripmitra.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
