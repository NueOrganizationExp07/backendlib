package com.neusoft.hotelmanagement.employee.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotelmanagement.employee.mapper.IEmployeeMapper;
import com.neusoft.hotelmanagement.employee.model.EmployeeModel;
import com.neusoft.hotelmanagement.employee.service.IEmployeeService;




@Service
@Transactional  //环绕事务Advice的切入点
public class EmployServiceImpl implements IEmployeeService{
	@Autowired
	private IEmployeeMapper employeeMapper=null;

	public String addEmployee(EmployeeModel dm) throws Exception {
		employeeMapper.insert(dm);
		return dm.getEmployeeId();
	}

	
	public void modifyEmployee(EmployeeModel dm) throws Exception {
		employeeMapper.update(dm);
	}

	
	public void deleteEmployee(EmployeeModel dm) throws Exception {
		employeeMapper.delete(dm);
	}

	
	public List<EmployeeModel> getListByAllEmployee() throws Exception {
		
		return employeeMapper.selectByAll();
	}


	public List<EmployeeModel> getListByAllWithPageEmployee(int rows, int page) throws Exception {
		
		return employeeMapper.selectByAllWithPage(rows*(page-1), rows);
	}


	public int getCountByAllEmployee() throws Exception {
		
		return employeeMapper.selectCountByAll();
	}

	
	public int getPageCountByAllEmployee(int rows) throws Exception {
		
		int count=this.getCountByAllEmployee();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}


	public EmployeeModel getByNoEmployee(String no) throws Exception {
		
		return employeeMapper.selectByNo(no);
	}

}
