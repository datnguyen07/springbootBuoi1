package com.example.webPhimhay.service;

import java.util.List;

import com.example.webPhimhay.model.Employee;

public interface IEmployeeService {
	// Hàm thêm nhân viên
	public Employee addEmployee(Employee employee);
	
	//Hàm chỉnh sửa thông tin nhân viên
	public Employee updateEmployee(long id, Employee employee);
	
	//hàm xóa nhân viên
	public boolean deleteEmployee(long id);
	
	//hàm lấy ra danh sách nhan viên
	public List<Employee> getAllEmployee();
	
	//hàm lấy ra một nhân viên
	public Employee getOneEmployee(long id);

}
