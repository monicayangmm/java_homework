package com.example.web.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Student{
	private int id;
	private String name;
	private int age;
	private int gradeId;
	

	@JsonIgnore
	private Grade grade;

	private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Student(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Student(int id,String name, int age,int gradeId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gradeId = gradeId;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public int getGradeId() {
		return gradeId;
	}



	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}



	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
//	public String test(){
//		return "Student [id=" + id + ", name=" + name + ", age=" + age +",grade="+grade.getName()+ ", address="
//				+ address.getAddress() + "]";
//	}

//	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age +
//				",grade="+grade.getName()+ 
//				", address="+ address.getAddress() + 
				"]";
	}
	
}
