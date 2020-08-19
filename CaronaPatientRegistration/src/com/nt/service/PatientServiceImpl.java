package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.PatientDAO;
import com.nt.dao.PatientDAOImpl;
import com.nt.dto.PatientDTO;

public class PatientServiceImpl implements PatientService {
	private PatientDAO dao;
	 public   PatientServiceImpl() {
			dao=new PatientDAOImpl();
		}
		
	
	@Override
	public String registerPatient(PatientDTO dto) throws Exception {
		String Status=null;
		PatientBO bo=null;
		int count=0;
		double billAmt=0.0f;
		billAmt=dto.getMedicineCost()+dto.getBedCost()+dto.getFoodCost();
		
		//create BO class object having persistable data
	     bo=new PatientBO();
	     bo.setPname(dto.getPname());
	     bo.setAdharNum(dto.getAdharNum());
	     bo.setPhno(dto.getPhno());
	     bo.setHosName(dto.getHosName());
	     bo.setAdmittedDate(dto.getAdmittedDate());
	     bo.setBillAmt(billAmt);
	     //use dAO
	     count=dao.insert(bo);
	     //process the result
	     if(count==0)
	    	 return "Registration failed";
	     else
	    	 return "Registration succeded";
	    
		
	}

}
