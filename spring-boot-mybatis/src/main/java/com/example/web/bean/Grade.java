package com.example.web.bean;

import java.util.List;

public class Grade {
	private int id;
	private String name;
	private List<Student> student;
	

	public Grade() {
		super();
	}
	

	

	public Grade(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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


	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Grade [id=" + id + ", name=" + name + ", student=" + student + "]";
	}
	

	

}
