package com.example.web.bean;

public class Address {
	private int id;
	private String address;
	public Address() {
		super();
	}
	public Address(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + "]";
	}
	
	

}
