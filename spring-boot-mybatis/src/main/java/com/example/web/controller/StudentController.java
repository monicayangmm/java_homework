package com.example.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.web.bean.Address;
import com.example.web.bean.Grade;
import com.example.web.bean.Student;
import com.example.web.mapper.AddressMapper;
import com.example.web.mapper.StudentMapper;

@RestController
public class StudentController {
	
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	AddressMapper addressMapper;
	
	@RequestMapping(value="getStudent")
	public ModelAndView getStudent(int id,HttpServletRequest request,HttpServletResponse response){
		request.getParameter("id");
		Student student= studentMapper.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		mv.addObject("students", list);
		mv.setViewName("student");
		return mv;
	}
	@RequestMapping(value="getStudent2")
	public String getStudent2(int id,Model model){
		Student student= studentMapper.findById(id);
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		model.addAttribute("student", student);
		model.addAttribute("students", list);
		return "student";
	}
	@RequestMapping(value="getStudentAll")
	public ModelAndView getStudentAll(Model model){
		List<Student> list= studentMapper.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", list);
		modelAndView.setViewName("student");
		return modelAndView;
	}
	
	@RequestMapping(value="addStudent")
	public Address addStudent(Student student){
		studentMapper.add(student);
		return addressMapper.findById(student.getAddress().getid());
	}
	@RequestMapping(value="deleteStudent")
	public ModelAndView deleteStudent(HttpServletRequest request,HttpServletResponse response, Integer id){
		request.getParameter("id");
		Student student=studentMapper.findById(id);
		studentMapper.delete(id);
		addressMapper.delete(student.getAddress().getid());
		List<Student> list= studentMapper.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", list);
		modelAndView.setViewName("student");
		return modelAndView;
	}
	@RequestMapping(value="updateStudent")
	public ModelAndView updateStudent(HttpServletRequest request,HttpServletResponse response,Integer id){
		request.getParameter("id");
		Student student= new Student(id,"Lucy", 19, 3);
		studentMapper.update(student);
		List<Student> list= studentMapper.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", list);
		modelAndView.setViewName("student");
		return modelAndView;
	}

}
