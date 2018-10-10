package com.example.web.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.web.bean.Address;
@Mapper
public interface AddressMapper {
	public void add(Address addr);
	public Address findById(int id);
	public void update(Address addr);
	public void delete(int id); 

}
