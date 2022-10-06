package com.sbjpa.jpaquery1.repository;

import com.sbjpa.jpaquery1.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query("SELECT a FROM Address a WHERE (a.city IS NULL OR a.city=:city) " +
            "AND (a.state IS NULL OR a.state=:state) " +
            "AND (a.zip IS NULL OR a.zip=:zip)")
    List<Address> findByAnyOfOneOrAll(String city, String state, String zip);

}
