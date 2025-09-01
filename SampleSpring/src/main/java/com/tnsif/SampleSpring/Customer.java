package com.tnsif.SampleSpring;

public class Customer {
	private int id;
	private String name;
	private String city;
	
	private Shopping s1;    //Shopping interface reference

	public void order() {
		s1.order();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Shopping getS1() {
		return s1;
	}

	public void setS1(Shopping s1) {
		this.s1 = s1;
	}
	
}
