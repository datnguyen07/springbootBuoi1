package com.example.webPhimhay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webPhimhay.model.Employee;
import com.example.webPhimhay.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee != null) {
			return employeeRepository.save(employee);
		}
		return null;
	}

	@Override
	public Employee updateEmployee(long id, Employee employee) {
		// TODO Auto-generated method stub
		if(employee !=null) {
			Employee employee1=employeeRepository.getById(id);
			if(employee != null) {
				employee.setName(employee.getName());
				employee.setAddress(employee.getAddress());
				
				return employeeRepository.save(employee1);
			}
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(long id) {
		// TODO Auto-generated method stub
		if(id>=1) {
			Employee employee = employeeRepository.getById(id);
			if(employee!=null) {
				employeeRepository.delete(employee);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getOneEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.getById(id);
	}

}
