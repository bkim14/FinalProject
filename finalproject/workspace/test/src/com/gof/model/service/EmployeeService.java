package com.gof.model.service;

import com.gof.model.vo.Employee;

public interface EmployeeService {
	Employee findEmployee(String rfid);
	Employee login(String rfid, String password);
}
