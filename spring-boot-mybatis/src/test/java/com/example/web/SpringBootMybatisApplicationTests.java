package com.example.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.web.bean.Address;
import com.example.web.bean.Grade;
import com.example.web.bean.Student;
import com.example.web.mapper.AddressMapper;
import com.example.web.mapper.GradeMapper;
import com.example.web.mapper.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
//@Rollback(false)
public class SpringBootMybatisApplicationTests {
	
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	GradeMapper gradeMapper;
	@Autowired
	AddressMapper addressMapper;
	
	@Test
	public void test(){
//		this.getStudent();
//		this.getGrade();
//		this.getAddress();
//		this.addGrade();
//		this.updateGrade();
//		this.deleteGrade();
//		this.addAddress();
//		this.updateAddress();
//		this.deleteAddress();
//		this.addStudent();
//		this.updateStudent();
//		this.deleteStudent();
		this.selectMap();
//		this.deleteMoreAddr();
	}

    void addGrade() {
		Grade grade = new Grade();
		grade.setId(5);
		grade.setName("xxxx");
		gradeMapper.add(grade);	
	}
    void updateGrade(){
    	Grade grade= new Grade();
    	grade.setId(3);
    	grade.setName("1111");
    	gradeMapper.update(grade);
    }
    void deleteGrade(){
    	gradeMapper.delete(4);
    }
    
    void addAddress() {
		Address addr = new Address();
		addr.setid(4);
		addr.setAddress("nanjing");
		addressMapper.add(addr);	
	}
    void updateAddress(){
    	Address addr= new Address();
    	addr.setid(2);
    	addr.setAddress("1111");
    	addressMapper.update(addr);
    }
    void deleteAddress(){
    	addressMapper.delete(4);
    }
    void addStudent() {
    	Student stu = new Student();
		stu.setId(5);
		stu.setName("lili");
		stu.setAge(23);
		studentMapper.add(stu);	
	}
    void updateStudent(){
    	Student stu= new Student();
    	stu.setId(2);
    	stu.setName("Mike");
    	studentMapper.update(stu);
    }
    void deleteStudent(){
    	studentMapper.delete(4);
    }
    
    void getStudent() {
    	Student student = studentMapper.findById(1);
    	System.out.println(student.toString());
    }
    void getGrade(){
    	Grade grade = gradeMapper.findById(1);
    	System.out.println(grade.toString());
    }
    void getAddress() {
    	Address addr = addressMapper.findById(1);
    	System.out.println(addr.toString());
    }
    void selectMap(){
    	Map<String, Object> map=new HashMap<>();
    	map.put("name", "张三");
    	map.put("age", 20);
    	Student s=(Student) studentMapper.selectByNameAge(map);
    	System.out.println(s.test());
    	System.out.println("班级名称："+s.getGrade().getName());
    	System.out.println("地址："+s.getAddress().getAddress());
    }
    void deleteMoreAddr(){
    	List<Integer> list = new ArrayList<>();
    	list.add(4);
    	list.add(5);
    	addressMapper.deleteMoreById(list);
    	
    }

//	@Test
//	public void contextLoads() {
//	}

}
