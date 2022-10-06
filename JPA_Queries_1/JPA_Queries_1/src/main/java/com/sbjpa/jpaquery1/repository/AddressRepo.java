package com.sbjpa.jpaquery1.repository;

import com.sbjpa.jpaquery1.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query("SELECT a FROM Address a " +
            "WHERE (:city IS NULL OR a.city=:city) " +
            "AND (:state IS NULL OR a.state=:state) " +
            "AND (:zip IS NULL OR a.zip=:zip)")
    List<Address> findByAnyOfOneOrAll(@Param("city") String city, @Param("state") String state,
                                      @Param("zip") String zip);

}
