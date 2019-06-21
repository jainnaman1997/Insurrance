package com.cg.eis.service;
import java.util.*;
import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee e);
	public Employee calculateScheme(Employee e);
	public Employee findEmployee(int eid);
	public Map<Integer, Employee> getAllEmployee();

}
