package com.example.webPhimhay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.webPhimhay.model.Employee;
import com.example.webPhimhay.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService iEmployeeService;
	
	//test
	@GetMapping("/")
	public String test() {
		return "hello";
	}
	
	// API add employee
		@PostMapping("//add")
		public Employee addEmployee(@RequestBody Employee employee) {
			return iEmployeeService.addEmployee(employee);
		}
	
	// API update employee
	@PutMapping("/update")
	public Employee updateEmployee(@RequestParam("id") long id, @RequestBody Employee employee) {
		return iEmployeeService.updateEmployee(id, employee);
	}
	
	//API delete employee
	@DeleteMapping("/delete/{id}")
	public boolean deleteEmployee(@PathVariable("id") long id) {
		return iEmployeeService.deleteEmployee(id);
	}
	
	//API lay danh sach'
	@GetMapping("/List")
	public List<Employee> getAllEmployee(){
		return iEmployeeService.getAllEmployee();
	}
}


		