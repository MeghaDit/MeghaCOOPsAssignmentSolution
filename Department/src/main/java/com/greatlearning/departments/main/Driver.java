package com.greatlearning.departments.main;

import com.greatlearning.departments.model.AdminDepartment;
import com.greatlearning.departments.model.HrDepartment;
import com.greatlearning.departments.model.TechDepartment;

public class Driver {
	/* create objects of classes */
	static AdminDepartment admin = new AdminDepartment();
	static HrDepartment Hr = new HrDepartment(); 
	static TechDepartment tech = new TechDepartment();
	
	public static void main(String[] args) {
		 		
		displayFuncs(admin, Hr, tech); //function to display functionalities of all depts

	}
	
	public static void displayFuncs(AdminDepartment admin,HrDepartment Hr,TechDepartment tech ) {
		
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday() + "\n");
		
		System.out.println("Welcome to " + Hr.departmentName());
		System.out.println(Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());
		System.out.println(Hr.isTodayAHoliday() + "\n");
		
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday() + "\n");
	}

}
