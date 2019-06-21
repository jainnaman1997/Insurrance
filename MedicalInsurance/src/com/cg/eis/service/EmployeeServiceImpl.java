package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	static Map<Integer, Employee> empmap=new HashMap<Integer, Employee>();
	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		empmap.put(e.getId(), e);
		return true;
	}

	@Override
	public Employee calculateScheme(Employee e) {
		// TODO Auto-generated method stub
		double sal=e.getSalary();
		String desig=e.getDesignation();
		if(sal<5000 && (desig.equals("Clerk") || desig.equals("clerk"))) {
			e.setIscheme("No Scheme");
		}
		else if(sal<20000 && (desig.equals("System Associate") || desig.equals("system associate"))) {
			e.setIscheme("Scheme C");
		}
		else if(sal<40000 && (desig.equals("Programmer") || desig.equals("programmer"))) {
			e.setIscheme("Scheme B");
		}
		else if(sal>40000 && (desig.equals("Manager") || desig.equals("manager"))) {
			e.setIscheme("Scheme A");
		}
		else {
			e.setIscheme("No Scheme");
		}
		return e;
	}

	@Override
	public Employee findEmployee(int eid) {
		// TODO Auto-generated method stub
		Employee e=empmap.get(eid);
		return e;
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empmap;
	}
	

}
