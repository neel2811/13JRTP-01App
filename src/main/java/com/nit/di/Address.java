package com.nit.di;

public class Address {

	private String street;
	private String block;
	public String city;
	public String  State;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", block=" + block + ", city=" + city + ", State=" + State + "]";
	}
	
	
	
}
