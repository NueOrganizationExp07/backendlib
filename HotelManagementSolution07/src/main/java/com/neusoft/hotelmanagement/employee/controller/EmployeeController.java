package com.neusoft.hotelmanagement.employee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotelmanagement.employee.model.EmployeeModel;
import com.neusoft.hotelmanagement.employee.service.IEmployeeService;
import com.neusoft.hotelmanagement.restresult.Result;
import com.neusoft.hotelmanagement.room.model.RoomModel;
import com.neusoft.hotelmanagement.room.service.IRoomService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(value="/employee")
@CrossOrigin(origins= {"*","null"})
public class EmployeeController {
	
	@Autowired
	private IEmployeeService ds=null;
		
	@PostMapping(value="/add")
	public Result<String> add(@RequestBody EmployeeModel dm) throws Exception{
		ds.addEmployee(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加员工成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(@RequestBody EmployeeModel dm) throws Exception{
		ds.modifyEmployee(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改员工成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody EmployeeModel dm) throws Exception{
		ds.deleteEmployee(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除员工成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<EmployeeModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<EmployeeModel> result=new Result<EmployeeModel>();
		result.setCount(ds.getCountByAllEmployee());
		result.setPageCount(ds.getPageCountByAllEmployee(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ds.getListByAllWithPageEmployee(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得员工列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<EmployeeModel> getByNo(@RequestParam(required=true) String no) throws Exception{
		Result<EmployeeModel> result=new Result<EmployeeModel>();
		result.setResult(ds.getByNoEmployee(no));
		result.setStatus("OK");
		result.setMessage("取得指定员工对象成功!");
		return result;
	}
}
