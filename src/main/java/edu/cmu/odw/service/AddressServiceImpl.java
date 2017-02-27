package edu.cmu.odw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cmu.odw.model.Address;

public class AddressServiceImpl implements AddressServiceCustom{

	@Autowired
	AddressService addressService;
	
	@Override
	public Iterable<Address> findByBusinessId(long businessId) {

		ArrayList<Address> result = new ArrayList<Address>();
		
	    Iterable<Address> addresses = addressService.findAll();	
		
		for(Address a: addresses){
			if(a.getBusinessId() == businessId){
				result.add(a);
			}
		}
		return result;
	}

	@Override
	public String getGoogleMapByBusinssId(long businessId) {
		
		String url = "https://www.google.com/maps/embed/v1/place?key=AIzaSyCRbgB_gAIeZKN-Wc_soTa6n_xCijGayTY&center=";
		//String key = "AIzaSyCRbgB_gAIeZKN-Wc_soTa6n_xCijGayTY";
		
		ArrayList<Address> result = new ArrayList<Address>();
		
	    Iterable<Address> addresses = addressService.findAll();	
		
		for(Address a: addresses){
			if(a.getBusinessId() == businessId){
				result.add(a);
			}
		}
		
		if(result.size() > 0){
			Address a = result.get(0);
			url = url + a.getLatitude() + "," + a.getLongitude();
			return url;
		}else{
			url = url + "40.4312839,-80.1205826";
			return url;
		}		
	}
	
}