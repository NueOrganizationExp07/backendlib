package com.neusoft.hotelmanagement.manager.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotelmanagement.manager.model.ManagerModel;
import com.neusoft.hotelmanagement.manager.service.IManagerService;
import com.neusoft.hotelmanagement.restresult.Result;


@RestController
@RequestMapping(value="/manager")
public class ManagerController {
	
	@Autowired
	private IManagerService ds=null;
		
	@PostMapping(value="/add")
	public Result<String> add(ManagerModel dm) throws Exception{
		ds.add(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加负责人成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(ManagerModel dm) throws Exception{
		ds.modify(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改负责人成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(ManagerModel dm) throws Exception{
		ds.delete(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除负责人成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<ManagerModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<ManagerModel> result=new Result<ManagerModel>();
		result.setCount(ds.getCountByAll());
		result.setPageCount(ds.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ds.getListByAllWithPage(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得负责人列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<ManagerModel> getByNo(@RequestParam(required=true) int no) throws Exception{
		Result<ManagerModel> result=new Result<ManagerModel>();
		result.setResult(ds.getByNo(no));
		
		result.setStatus("OK");
		result.setMessage("取得指定负责人对象成功!");
		return result;
	}
}
