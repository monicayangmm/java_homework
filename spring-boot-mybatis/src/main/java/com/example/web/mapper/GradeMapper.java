package com.example.web.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.web.bean.Grade;

@Mapper
public interface GradeMapper {
	
	public void add(Grade grade);
	public Grade findById(int id);
	public void update(Grade grade);
	public void delete(int id);

}
