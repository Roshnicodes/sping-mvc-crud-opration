package com.pp.service.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.Employee;
import com.pp.model.UserDto;
import com.pp.repository.ws.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> get(int parseLong) {
		System.out.println("inside submit login service");
		List<Employee> emp = employeeRepo.getEmpid(parseLong);
		
		return emp;
	}

	public void saveEmployee(Employee emp1) {
		System.out.println("inside save service method");
		employeeRepo.saveEmployee(emp1);
		
	}

	public void putEmployee(Employee emp2) {
		System.out.println("inside put service method");
		employeeRepo.putEmpolyee(emp2);
		
	}

	public void deleteEmployee(int id) {
	System.out.println("inside delete service method");
	employeeRepo.deleteEmployee(id);
		
	}
}