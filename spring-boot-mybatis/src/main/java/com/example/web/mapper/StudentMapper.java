package com.example.web.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.web.bean.Student;

@Mapper
public interface StudentMapper {
	public Student findById(int id);
	public Student findByGradeId(int id);
//	public Student fingByAddrId(int id);
	public void add(Student stu);
	public void update(Student stu);
	public void delete(int id); 


}
