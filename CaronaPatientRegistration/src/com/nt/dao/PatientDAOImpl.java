package com.nt.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.nt.bo.PatientBO;

public class PatientDAOImpl implements PatientDAO {
private static final String  INSERT_PATIENT_QUERY="INSERT INTO PATIENT2(regno,pname,adharnum,phno,hosname,admitteddate,billAmt) VALUES(regno,?,?,?,?,?,?)";
	//helper methods
	private Connection  getPooledJdbcConnection()throws Exception{
		InitialContext ic=null;
		DataSource ds=null;
		Connection con=null;
		
		//create InitialContext object
		ic=new InitialContext();
		//get DataSource object
		ds=(DataSource)ic.lookup("java:/comp/env/DsJndi");
		//get Pooled JDBC con object
		con=ds.getConnection();
		return con;
	}//method
	@Override
	public int insert(PatientBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
	    //get Pooled jdbc con object
		con=getPooledJdbcConnection();
		//create PreparedStatement object
		ps=con.prepareStatement(INSERT_PATIENT_QUERY);
		//set values to query params
		ps.setString(1,bo.getPname());
		ps.setLong(2, bo.getAdharNum());
		ps.setLong(3,bo.getPhno());
		ps.setString(4,bo.getHosName());
		ps.setDate(5,bo.getAdmittedDate());
		ps.setDouble(6,bo.getBillAmt());
		//execute the SQL Query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}
}
