package edu.cmu.odw.service;

import org.springframework.data.repository.CrudRepository;
import edu.cmu.odw.model.Address;


public interface AddressService extends CrudRepository<Address, Long>, AddressServiceCustom {
		
}