package com.neusoft.hotelmanagement.customer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotelmanagement.customer.model.CustomerModel;
import com.neusoft.hotelmanagement.customer.service.ICustomerService;
import com.neusoft.hotelmanagement.restresult.Result;





@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	private ICustomerService ds=null;
		
	@PostMapping(value="/add")
	public Result<String> add(CustomerModel dm) throws Exception{
		ds.addCustomer(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加入住人员成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(CustomerModel dm) throws Exception{
		ds.modifyCustomer(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改入住人员成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(CustomerModel dm) throws Exception{
		ds.deleteCustomer(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除入住人员成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<CustomerModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<CustomerModel> result=new Result<CustomerModel>();
		result.setCount(ds.getCountByAllCustomer());
		result.setPageCount(ds.getPageCountByAllCustomer(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ds.getListByAllWithPageCustomer(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得入住人员列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<CustomerModel> getByNo(@RequestParam(required=true) String no) throws Exception{
		Result<CustomerModel> result=new Result<CustomerModel>();
		result.setResult(ds.getByNoCustomer(no));
		result.setStatus("OK");
		result.setMessage("取得指定入住人员对象成功!");
		return result;
	}
}
