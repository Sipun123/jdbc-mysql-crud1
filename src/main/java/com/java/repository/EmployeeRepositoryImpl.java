package com.java.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.java.model.Employee;
import com.java.utils.EmployeeQueries;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

	public void save(Employee emp, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement ps=con.prepareStatement(EmployeeQueries.INSERT);
		ps.setInt(1, emp.id);
		ps.setString(2, emp.name);
		ps.setString(3, emp.city);
		ps.setDouble(4, emp.salary);
		
		ps.executeUpdate();
		
	}

	public void updateNameAndSalary(String name, String salary, int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public void updateCity(String city, int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public List<Employee> findAll(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee findById(int id, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public void deleteAll(Connection con) {
		// TODO Auto-generated method stub

	}

}
