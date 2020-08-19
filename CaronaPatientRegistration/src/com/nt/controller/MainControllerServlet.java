package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.PatientDTO;
import com.nt.service.PatientService;
import com.nt.service.PatientServiceImpl;
import com.nt.vo.PatientVO;
public class MainControllerServlet extends HttpServlet {
	private PatientService service;
	
	public void init() throws ServletException {
		System.out.println("MainControllerServlet.init()");
		service=new PatientServiceImpl();
	}
	@Override
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		System.out.println("MainControllerServlet.doGet()");
		 PatientVO vo=null;
		 PrintWriter pw=null;
		 PatientDTO dto=null;
		 String result=null;
		 ServletContext sc=null;
		
		 //read form data and store in VO class object
		 vo=new PatientVO();
		 
		 vo.setPname(req.getParameter("fname"));
		 vo.setAdharNum(req.getParameter("an"));
		 vo.setPhno(req.getParameter("pno"));
		 vo.setHosName(req.getParameter("hn"));
		 vo.setAdmittedDate(req.getParameter("ad"));
		 vo.setMedicineCost(req.getParameter("mc"));
		 vo.setBedCost(req.getParameter("bc"));
		 vo.setFoodCost(req.getParameter("fc"));
		 //create PrintWriter 
		 pw=res.getWriter();
		 //set response content type
		 res.setContentType("text/html");
		 //convert VO class object DTO class object
		 dto=new PatientDTO();
		 dto.setPname(vo.getPname());
		 dto.setAdharNum(Long.parseLong(vo.getAdharNum()));
		 dto.setPhno(Long.parseLong(vo.getPhno()));
		 dto.setHosName(vo.getHosName());
		 dto.setAdmittedDate(java.sql.Date.valueOf(vo.getAdmittedDate()));
		 dto.setMedicineCost(Double.parseDouble(vo.getMedicineCost()));
		 dto.setBedCost(Double.parseDouble(vo.getBedCost()));
		 dto.setFoodCost(Double.parseDouble(vo.getFoodCost()));
			
		//use service class
		 try {
			 result=service.registerPatient(dto);
			 pw.println("<h1 style='color:red;text-align:center'>Result :: "+result+"</h1>");
		 }//try
		 catch(Exception e) {
			 pw.println("<h1>Internal Problem ---- Try Again</h1>");
			 e.printStackTrace();
		 }
		//add hyperlink
		 pw.println("<br><br> <a href='info.html'>home</a>");
		
		 //close stream
		 pw.close();
		
	}

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("MainControllerServlet.doPost()");
		doPost(req,res);
	}
	
	public void destroy() {
		System.out.println("MainControllerServlet.destroy()");
	service=null;
	}
	

}
