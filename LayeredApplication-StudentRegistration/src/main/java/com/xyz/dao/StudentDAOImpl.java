package com.xyz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.xyz.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {

	private static final String STUDENT_QUERY="insert into student1(sname,tot,avg,result) values(?,?,?,?)";

	private DataSource ds;
	//for constructor injection
	public StudentDAOImpl(DataSource ds) {
       this.ds = ds;
	}
	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get pooled jdbc connection
		con=ds.getConnection();
		//create ps obj
		ps=con.prepareStatement(STUDENT_QUERY);
		//set values to query param
		ps.setString(1,bo.getSname());
		ps.setString(4,bo.getResult());
		ps.setInt(2, bo.getTot());
		ps.setFloat(3, bo.getAvg());
		count = ps.executeUpdate();
		//close connection
		ps.close();
		con.close();

		return count;
	}

}
