package com.hibernate.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	@Id
	@Column(name = "role_id")
	private int roleId;
	@Column(name = "role_name")
	private String roleName;
	@ManyToMany(mappedBy = "roles")
	private List<Employee> employees;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<Employee> getEmployee() {
		return employees;
	}
	public void setEmployee(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
