package com.neusoft.hotelmanagement.employee.service;
import java.util.List;

import com.neusoft.hotelmanagement.employee.model.EmployeeModel;

public interface IEmployeeService {
	//增加员工
	public String addEmployee(EmployeeModel dm) throws Exception;
	//修改员工
	public void modifyEmployee(EmployeeModel dm) throws Exception;
	//删除员工
	public void deleteEmployee(EmployeeModel dm) throws Exception;
	//取得所有员工列表
	public List<EmployeeModel> getListByAllEmployee() throws Exception;
	//取得所有员工列表,分页模式
	public List<EmployeeModel> getListByAllWithPageEmployee(int rows, int page) throws Exception;
	//取得员工的个数
	public int getCountByAllEmployee() throws Exception;
	//取得员工的显示页数
	public int getPageCountByAllEmployee(int rows) throws Exception;
	//根据员工的编号取得指定的员工对象
	public EmployeeModel getByNoEmployee(String no) throws Exception;
}
