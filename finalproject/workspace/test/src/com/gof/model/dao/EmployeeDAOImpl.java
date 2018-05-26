package com.gof.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.gof.model.vo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	SqlSession sqlSession;	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Employee selectEmployee(String rfid) {
		return sqlSession.selectOne("employee.selectEmployee", rfid);
	}

}
