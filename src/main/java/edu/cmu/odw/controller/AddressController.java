package edu.cmu.odw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.cmu.odw.model.Address;
import edu.cmu.odw.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;

	@RequestMapping(value = "/api/address/{id}")
	public Address address(@PathVariable("id") long id) {
		return addressService.findOne(id);
	}
	
	@RequestMapping(value = "/api/address/businessId/{id}")
	public Iterable<Address> addressBusinessId(@PathVariable("id") long id) {
		return addressService.findByBusinessId(id);
	}
	
	@RequestMapping(value = "/api/address/map/businessId/{id}")
	public String addressMapBusinessId(@PathVariable("id") long id) {
		return addressService.getGoogleMapByBusinssId(id);
	}
	
	@RequestMapping(value = "/api/address", method = RequestMethod.POST)
	public Address saveAddress(@RequestBody Address address) {
		System.out.println(address);		
		
		return addressService.save(address);
	}
	
	
}