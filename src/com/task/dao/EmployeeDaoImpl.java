package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao{
	public static PreparedStatement pst=null;
	

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {		
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("insert into emp values(?,?,?)");
		 pst.setInt(1, empId);
		 pst.setString(2, empName);
		 pst.setString(3, empAddress);
		  pst.executeUpdate();
		  System.out.println("insert one record successfully");
		  
	}


	@Override
	public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("update emp set emp_id = ? where emp_name = ?");
		 pst.setInt(1, empId);
		 pst.setString(2, empName);
		 
		  pst.executeUpdate();
		  System.out.println("updated record successfully");
	}


	@Override
	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("select * from emp");
		 ResultSet rs=pst.executeQuery();
			System.out.println("All the Employee Details\n");
			while(rs.next()) {
			System.out.println("Employee ID: "+rs.getString(1));
			System.out.println("Employee Name: "+rs.getString(2));
			System.out.println("Employee Address: "+rs.getString(3));
			}
		 
		 
		  System.out.println("Fetched record successfully");
	
	}


	@Override
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("delete from emp where emp_name = ?");
		
		 pst.setString(1, empName);
		 
		  pst.executeUpdate();
		  System.out.println("deleted record successfully");
	}

}
