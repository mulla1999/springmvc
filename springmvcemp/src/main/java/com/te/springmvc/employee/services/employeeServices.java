package com.te.springmvc.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springmvc.employee.Employee;
import com.te.springmvc.employee.repository.employeeRepo;

@Service
public class employeeServices {

	@Autowired
	employeeRepo repo;

	public void save(Employee employee) {
		repo.saveEmployee(employee);
	}

	public Employee listEmployee(int id) {
		Employee search = repo.search(id);
		return search;
	}

	public void delete(int id) {
		 repo.deleted(id);
			}

	public void update(int id, String newName) {
		repo.empdataupdated(id, newName);
		
	}

}
