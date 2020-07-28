package com.xyz.service;

import com.xyz.bo.StudentBO;
import com.xyz.dao.StudentDAO;
import com.xyz.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}
	@Override
	public String calculateResult(StudentDTO dto) throws Exception {
		float avg=0.0f;
		int tot=0;
		int count=0;
		String result=null;
		StudentBO bo=null;
		tot=dto.getM1()+dto.getM2()+dto.getM3();
		avg=tot/3.0f;
		if(dto.getM1()>=35&&dto.getM2()>=35&&dto.getM3()>=35) {
			if(avg>=90) {
				result="Grade A+";
			}
			else if(avg>=70&&avg<=90) {
				result="Grade A";	
			}
			else if(avg>=60&&avg<=70) {
				result="Grade B";	
			}
			else if(avg>=50&&avg<=60) {
				result="Grade C";	
			}
			else if(avg>=35&&avg<=50) {
				result="Grade D";	
			}

		}
		else {
			result="Failed";
		}
		//prepare studentBO obj having persistable data
		bo=new StudentBO();
		bo.setSname(dto.getSname());
		bo.setTot(tot);
		bo.setAvg(avg);
		bo.setResult(result);
		//use dao
		count=dao.insert(bo);
		if(count==0)
			return "registration failed..."+"TotalMarks::"+tot+".....Avg::"+avg;
		else 
			return "registration Success...."+"TotalMarks::"+tot+".....Avg::"+avg;



	}

}
