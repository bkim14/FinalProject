package com.gof.model.service;

import com.gof.model.dao.EmployeeDAO;
import com.gof.model.vo.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDao;	
	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee findEmployee(String rfid) {
		return employeeDao.selectEmployee(rfid);
	}

	@Override
	public Employee login(String rfid, String password) {
		Employee emp = employeeDao.selectEmployee(rfid);
		if(emp!=null&&emp.getPassword().equals(password)) {
			return emp;
		}else {
			return null;
		}
	}

}
