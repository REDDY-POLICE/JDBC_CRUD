package com.task.ui;
import com.task.bean.EmployeeBean;
import com.task.service.*;

import java.sql.SQLException;
import java.util.Scanner;


public class Demo_CRUD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("select your option");
		System.out.println("1. insert employee data");//create
		System.out.println("2. update employee data");//update
		System.out.println("3  select employee data");//read
		System.out.println("4  delete employee data");//delete
		int option=sc.nextInt();
		switch(option) {
		case 1:
		{
			insertEmployee();
			break;
		}
		case 2:
		{
			updateEmployee();
			break;
		}
		case 3:
		{
			selectEmployee();
			break;
		}
		case 4:
		{
			deleteEmployee();
			break;
		}
		default:
		{
		System.out.println("your entered option is not match");	
		}
		}
		
	}

	private static void insertEmployee() throws ClassNotFoundException, SQLException {	
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpid(1001);
		bean.setEmpname("ajay");
		bean.setEmpaddress("hyderabad");
		service.insertEmployee(bean);
		
	}
	private static void updateEmployee() throws ClassNotFoundException, SQLException {	
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpid(1003);
		bean.setEmpname("ajay");
		
		service.updateEmployee(bean);
	}
	private static void selectEmployee() throws ClassNotFoundException, SQLException{
		EmployeeServiceImpl service =new EmployeeServiceImpl();
		EmployeeBean bean = new EmployeeBean();
		service.selectEmployee(bean);
		
	}
	
	private static void deleteEmployee() throws ClassNotFoundException, SQLException{
		EmployeeServiceImpl service =new EmployeeServiceImpl();
		EmployeeBean bean = new EmployeeBean();
		service.deleteEmployee(bean);
		bean.setEmpname("ajay");
	}
}
