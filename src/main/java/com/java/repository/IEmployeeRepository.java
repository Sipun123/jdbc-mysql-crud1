package com.java.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.java.model.Employee;

public interface IEmployeeRepository {
	public void save(Employee emp,Connection con) throws SQLException;
	public void updateNameAndSalary(String name,String salary,int id,Connection con);
	public void updateCity(String city,int id,Connection con);
	public List<Employee> findAll(Connection con);
	public Employee findById(int id,Connection con);
	public void deleteById(int id,Connection con);
	public void deleteAll(Connection con);
}
