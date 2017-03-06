package edu.cmu.odw.service;

import edu.cmu.odw.model.Address;

public interface AddressServiceCustom{
	public Iterable<Address> findByBusinessId(long businessId);
	public String setGoogleMapUrl(Address a);
}