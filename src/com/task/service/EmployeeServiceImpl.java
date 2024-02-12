package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		//EmployeeBean bean1=new EmployeeBean();
		dao.insertEmployee(bean);
		
	
		 	
}
	@Override
	public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		//EmployeeBean bean1=new EmployeeBean();
		dao.updateEmployee(bean);
	}
	@Override
	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		//EmployeeBean bean1=new EmployeeBean();
		dao.selectEmployee(bean);
	}
	@Override
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		dao.deleteEmployee(bean);
	}
}
