package com.te.springmvc.employee.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springmvc.employee.Employee;

@Repository
public class employeeRepo {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	public void saveEmployee(Employee employee) {
		manager.persist(employee);
		transaction.begin();
		transaction.commit();
	}

	public Employee search(int id) {
		Employee find = manager.find(Employee.class, id);
		return find;
	}

	public boolean deleted(int id) {
		Employee find = manager.find(Employee.class, id);
	    if (find != null) {
	    	manager.remove(find);
	    	transaction.begin();
	    	transaction.commit();
            return true;			
		}
	   return false;    
	    
	}

	public void empdataupdated(int id, String newName) {
		Employee find = manager.find(Employee.class, id);
		find.setName(newName);
		transaction.begin();
    	transaction.commit();
    	System.out.println("update Done");
    	
	}

}
