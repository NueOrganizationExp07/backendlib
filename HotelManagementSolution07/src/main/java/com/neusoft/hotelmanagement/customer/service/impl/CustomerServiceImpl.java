package com.neusoft.hotelmanagement.customer.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotelmanagement.customer.mapper.ICustomerMapper;
import com.neusoft.hotelmanagement.customer.model.CustomerModel;
import com.neusoft.hotelmanagement.customer.service.ICustomerService;




@Service
@Transactional  //环绕事务Advice的切入点
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerMapper customerMapper=null;

	public String addCustomer(CustomerModel dm) throws Exception {
		customerMapper.insert(dm);
		return dm.getCustomerId();
	}


	public void modifyCustomer(CustomerModel dm) throws Exception {
		customerMapper.update(dm);
	}


	public void deleteCustomer(CustomerModel dm) throws Exception {
		customerMapper.delete(dm);
	}


	public List<CustomerModel> getListByAllCustomer() throws Exception {
		
		return customerMapper.selectByAll();
	}


	public List<CustomerModel> getListByAllWithPageCustomer(int rows, int page) throws Exception {
		
		return customerMapper.selectByAllWithPage(rows*(page-1), rows);
	}


	public int getCountByAllCustomer() throws Exception {
		
		return customerMapper.selectCountByAll();
	}


	public int getPageCountByAllCustomer(int rows) throws Exception {
		
		int count=this.getCountByAllCustomer();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}


	public CustomerModel getByNoCustomer(String no) throws Exception {
		
		return customerMapper.selectByNo(no);
	}

}
