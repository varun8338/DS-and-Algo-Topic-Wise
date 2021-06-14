package com.employee.mangement.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.employee.mangement.entity.Employee;

public class EmployeeDAOImpl {
	private HibernateTemplate template;
	
	@Transactional
	public int insert(Employee e) {
		Integer result=(Integer)this.template.save(e);
		return result;
	}
	
	@Transactional
	public void delete(int id) {
		Employee e=this.template.get(Employee.class, id);
		this.template.delete(e);
		System.out.println("Successfully deleted Employee with id: "+id);	
	}
	
	@Transactional
	public void update(Employee e) {
		Employee emp=this.template.get(Employee.class, e.getEmpId());
		System.out.println("Before changes "+emp);
		this.template.update(e);
		System.out.println();
	}
	
	public List<Employee> getEmployees(){
		List<Employee> list=this.template.loadAll(Employee.class);
		return list;
	}
	
	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	

}
