package com.cg.eis.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.*;
import com.cg.eis.service.*;


public class EmployeeInsurance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		while(true) {
		System.out.println("Menu");
		System.out.println("------");
		System.out.println("1. Enter details of new Employee");
		System.out.println("2. Find your Insurance Scheme");
		System.out.println("3. Print all employees details");
		System.out.println("4. Exit");
		System.out.println("Enter your choice");
		choice=br.readLine();
		switch(choice) {
			case "1":	int eid=0;
						String ename="";
						Double salary=0.0;
						String desig="";
						// Accepting and validating input for employee id
						System.out.println("Enter Employee ID ");
						while(true) {
							String s_id=br.readLine();
							boolean ch1=Validator.validatedata(s_id, Validator.aidpattern);
							if(ch1==true) {
								try {
									eid=Integer.parseInt(s_id);
									break;
								}catch(NumberFormatException e) {
									System.out.println("Employee ID must be numeric.\nRe-Enter");
								}
							}
							else {
								System.out.println("Re-Enter Employee ID in 3 digits");
							}
						}	// End of employee id while
						
						// Accepting and validating input for employee name
						System.out.println("Enter Employee name ");
						while(true) {
							ename=br.readLine();
							boolean ch1=Validator.validatedata(ename, Validator.namepattern);
							if(ch1==true) {
								
									break;
							}
							else {
								System.out.println("Re-Enter Employee name");
							}
						}	// End of employee name while
						
						// Accepting and validating input for salary
						System.out.println("Enter Employee salary ");
						while(true) {
							String s_sal=br.readLine();
							boolean ch1=Validator.validatedata(s_sal, Validator.salarypattern);
							if(ch1==true) {
								try {
									salary=Double.parseDouble(s_sal);
									break;
								}catch(NumberFormatException e) {
									System.out.println("Salary must be of double type.\nRe-Enter");
								}
							}
							else {
								System.out.println("Re-Enter Salary");
							}
						}	// End of salary while

						// Accepting and validating input for designation
						System.out.println("Enter designation of employee ");
						while(true) {
							desig=br.readLine();
							boolean ch1=Validator.validateDesignation(desig);
							if(ch1==true) {
								break;
							}
							else {
								System.out.println("Re-Enter Designation");
							}
						}

						Employee ob=new Employee(eid, ename, salary, desig);
						ob=service.calculateScheme(ob);
						boolean b=service.addEmployee(ob);
						System.out.println("Successfully added "+b+"\n"+ob);
						
						break;
			case "2":	System.out.println("Enter Employee ID");
						String s_eid=br.readLine();
						int id=Integer.parseInt(s_eid);
						Employee emp=null;
						emp=service.findEmployee(id);
						if(emp!=null) {
							System.out.println("Employee service scheme is "+emp.getIscheme());
						}
						else {
							System.out.println("Employee doesnot exist");
						}
						break;
			case "3":	Map<Integer, Employee> empmap=service.getAllEmployee();
						Collection<Employee> vc=empmap.values();
						List<Employee> emplist=new ArrayList<Employee> (vc);
						for(Employee o:emplist) {
							System.out.println("------------------------------------------");
							System.out.println("Employee ID "+o.getId());
							System.out.println("Employee Name "+o.getName());
							System.out.println("Salary is =>"+o.getSalary());
							System.out.println("Designation is =>"+o.getDesignation());
							System.out.println("------------------------------------------");
						}
						break;
			case "4":	System.out.println("Exiting Program");
						System.exit(0);
						break;
			default :	System.out.println("Invalid choice");
		}
	
	}
}
}
