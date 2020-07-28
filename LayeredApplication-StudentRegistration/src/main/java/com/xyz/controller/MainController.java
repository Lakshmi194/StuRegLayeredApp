package com.xyz.controller;

import com.xyz.dto.StudentDTO;
import com.xyz.service.StudentService;

import com.xyz.vo.StudentVO;

public final class MainController {
	private StudentService service;

	public MainController(StudentService service) {
		this.service = service;
	}
	public String processStudent(StudentVO vo)throws Exception{
		//convert VO class object to DTO class object
		StudentDTO dto=null;
		String result=null;
		dto=new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use service
		result=service.calculateResult(dto);
		return result;
		
	}
	

}
