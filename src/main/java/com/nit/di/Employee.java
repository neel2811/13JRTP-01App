package com.nit.di;

public class Employee {

	private String	name;
	public int id;
	public Address addres;
	
	public Employee(String name, int id, Address addres) {
		super();
		this.name = name;
		this.id = id;
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", addres=" + addres + "]";
	}
	
	
	
	
}
