package com.neusoft.hotelmanagement.customer.service;
import java.util.List;

import com.neusoft.hotelmanagement.customer.model.CustomerModel;

public interface ICustomerService {
	//增加入住人员
	public String addCustomer(CustomerModel dm) throws Exception;
	//修改入住人员
	public void modifyCustomer(CustomerModel dm) throws Exception;
	//删除入住人员
	public void deleteCustomer(CustomerModel dm) throws Exception;
	//取得所有入住人员列表
	public List<CustomerModel> getListByAllCustomer() throws Exception;
	//取得所有入住人员列表,分页模式
	public List<CustomerModel> getListByAllWithPageCustomer(int rows, int page) throws Exception;
	
	
	//取得入住人员的个数
	public int getCountByAllCustomer() throws Exception;
	//取得入住人员的显示页数
	public int getPageCountByAllCustomer(int rows) throws Exception;
	//根据入住人员的no（PK）取得指定的部门对象
	public CustomerModel getByNoCustomer(String no) throws Exception;
}
