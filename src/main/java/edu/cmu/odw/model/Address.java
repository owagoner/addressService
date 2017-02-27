package edu.cmu.odw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long businessId;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String country;
	private double latitude;
	private double longitude;

	public Address() {
	}

	public Address(Long businessId, String address, String city, String state, String zip, String country, double latitude, double longitude) {
		super();
		this.setBusinessId(businessId);
		this.address = address;
		this.city = city;
		this.state = state;
		this.setZip(zip);
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Address[id=" + this.id + ", businessId = " + this.businessId + ", address=" + this.address 
				+ ", city=" + this.city + ", state= " + this.state
				+ ", country " + this.country + ", lat= " + this.latitude + ", long= " + this.longitude + "]";
	}

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
