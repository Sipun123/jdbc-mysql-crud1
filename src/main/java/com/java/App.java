package com.java;

import com.java.model.Employee;
import com.java.repository.EmployeeRepositoryImpl;
import com.java.repository.IEmployeeRepository;
import com.java.service.EmployeeServiceImpl;
import com.java.service.IEmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IEmployeeRepository repository=new EmployeeRepositoryImpl();
    	IEmployeeService service=new EmployeeServiceImpl(repository);
    	// CREATE EMPLOYEE
    	Employee emp1=new Employee();
    	emp1.id=1;
    	emp1.name="john";
    	emp1.city="tx";
    	emp1.salary=1456.7;
    	
    	service.save(emp1); // calling save
    	
    	Employee emp2=new Employee();
    	emp2.id=2;
    	emp2.name="matthew";
    	emp2.city="ny";
    	emp2.salary=2456.7;
    	
    	service.save(emp2);// calling save
    	
    	Employee emp3=new Employee();
    	emp3.id=3;
    	emp3.name="alex";
    	emp3.city="nj";
    	emp3.salary=3456.7;
    	
    	service.save(emp3);// calling save
    }
}
