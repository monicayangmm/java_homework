package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.bean.Grade;
import com.example.web.mapper.AddressMapper;
import com.example.web.mapper.GradeMapper;
import com.example.web.mapper.StudentMapper;

@RestController
public class GradeController {
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	AddressMapper addressMapper;
	@Autowired
	GradeMapper gradeMapper;
	
	@RequestMapping(value="getGrade")
	public void getGrade(Grade grade){
		System.out.println(grade.getId());
	}

}
