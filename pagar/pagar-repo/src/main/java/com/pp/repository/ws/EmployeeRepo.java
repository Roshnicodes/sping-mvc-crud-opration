package com.pp.repository.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.Employee;


@Repository 
public class EmployeeRepo {
	  
	  @Autowired 
	  private HibernateTemplate hibernatetemplate; 
	  public List<Employee> getEmpid(int parseLong){
	  System.out.println("inside repository method");
	  List<Employee> emp = hibernatetemplate.find("from Employee a1 where a1.id=? ",parseLong);
	  System.out.println("emp- " + emp.get(0));
	  return emp;
	  
	  }
	public void saveEmployee(Employee emp1) {
		System.out.println("inside save repos method");
		
		hibernatetemplate.save(emp1);
		
	}
	public void putEmpolyee(Employee emp2) {
		System.out.println("inside put repository");
		hibernatetemplate.saveOrUpdate(emp2);
		
	}
	public void deleteEmployee(int id) {
		System.out.println("inside delete repo");
		Employee emp = this.hibernatetemplate.load(Employee.class,id);
	this.hibernatetemplate.delete(emp);
		
	}
	
	  
	  
	  
	  }