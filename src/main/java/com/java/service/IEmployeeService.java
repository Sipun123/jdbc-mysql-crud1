package com.java.service;

import java.util.List;

import com.java.model.Employee;

public interface IEmployeeService {

	public void save(Employee emp);
	public void updateNameAndSalary(String name,String salary,int id);
	public void updateCity(String city,int id);
	public List<Employee> findAll();
	public Employee findById(int id);
	public void deleteById(int id);
	public void deleteAll();
}
