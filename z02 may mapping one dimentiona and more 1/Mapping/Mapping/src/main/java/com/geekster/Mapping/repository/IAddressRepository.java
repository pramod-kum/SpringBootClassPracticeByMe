package com.geekster.Mapping.repository;

import com.geekster.Mapping.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends CrudRepository<Address , Long> {

}
