package com.java.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.java.model.Employee;
import com.java.repository.IEmployeeRepository;
import com.java.utils.ConnectionUtils;

public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeRepository repository;
	public EmployeeServiceImpl(IEmployeeRepository repository) {
		this.repository=repository;
	}
	

	public void save(Employee emp) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			con=ConnectionUtils.getConnection(); // create connection
			repository.save(emp, con); // save
			con.commit();// commit
			System.out.println("**** saved employee: "+emp.id);
		} catch (Exception e) {
			// TODO: handle exception
			try {
				con.rollback(); // rollback
				System.out.println("**** failed to save employee: "+emp.id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
			try {
				ConnectionUtils.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateNameAndSalary(String name, String salary, int id) {
		// TODO Auto-generated method stub

	}

	public void updateCity(String city, int id) {
		// TODO Auto-generated method stub

	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
