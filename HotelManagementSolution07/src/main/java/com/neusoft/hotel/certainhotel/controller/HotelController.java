package com.neusoft.hotel.certainhotel.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.certainhotel.model.HotelModel;
import com.neusoft.hotel.certainhotel.service.IHotelService;
import com.neusoft.hotel.restresult.Result;


@RestController
@RequestMapping(value="/hotel")
public class HotelController {
	
	@Autowired
	private IHotelService ds=null;
		
	@PostMapping(value="/add")
	public Result<String> add(HotelModel dm) throws Exception{
		ds.add(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加酒店成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(HotelModel dm) throws Exception{
		ds.modify(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改酒店成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(HotelModel dm) throws Exception{
		ds.delete(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除酒店成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<HotelModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<HotelModel> result=new Result<HotelModel>();
		result.setCount(ds.getCountByAll());
		result.setPageCount(ds.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ds.getListByAllWithPage(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得酒店列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<HotelModel> getByNo(@RequestParam(required=true) int no) throws Exception{
		Result<HotelModel> result=new Result<HotelModel>();
		result.setResult(ds.getByNo(no));
		
		result.setStatus("OK");
		result.setMessage("取得指定酒店对象成功!");
		return result;
	}
	

}