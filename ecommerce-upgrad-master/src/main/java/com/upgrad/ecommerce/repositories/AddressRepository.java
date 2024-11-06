package com.upgrad.ecommerce.repositories;

import com.upgrad.ecommerce.models.Address;
import com.upgrad.ecommerce.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.validation.constraints.NotNull;
import java.util.List;


public interface AddressRepository extends MongoRepository<Address, String> {

    boolean existsByContactNumberIgnoreCase(String contactNumber);

    List<Address> findAddressesByUserId(String user_id);

}
