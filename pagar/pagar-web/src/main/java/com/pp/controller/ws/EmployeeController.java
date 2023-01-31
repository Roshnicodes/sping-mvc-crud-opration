package com.pp.controller.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pp.model.Employee;
import com.pp.model.UserDto;
import com.pp.service.ws.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/getEmployee",method = RequestMethod.GET)
	@ResponseBody
	public List <Employee> showLogin(@RequestParam("id") int id) {
		System.out.println("Inside EmployeeController show login method" + id);
		List<Employee> emp = employeeService.get(id);
		System.out.println("it is controller class");
		
		return  emp;
	}
	@RequestMapping(value = "/postEmployee",method = RequestMethod.POST)
	@ResponseBody
	public Employee addEmployee(@RequestBody Employee emp1) {
		System.out.println("inside post controller");
		employeeService.saveEmployee(emp1);
	
	
		
		return  emp1;
	}
	@RequestMapping(value = "/putEmployee",method = RequestMethod.PUT)
	@ResponseBody
	public Employee updateEmployee(@RequestBody Employee emp2) {
		System.out.println("inside put controller");
		employeeService.putEmployee(emp2);
	
	
		
		return  emp2;
	}
	@RequestMapping(value = "/deleteEmployee",method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteEmployee(@RequestParam int id) {
		System.out.println("inside put controller");
		employeeService.deleteEmployee(id);
	
	
		
		
	}
	}
