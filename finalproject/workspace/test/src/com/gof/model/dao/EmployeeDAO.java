package com.gof.model.dao;

import com.gof.model.vo.Employee;

public interface EmployeeDAO {
	
	Employee selectEmployee(String rfid);
}
