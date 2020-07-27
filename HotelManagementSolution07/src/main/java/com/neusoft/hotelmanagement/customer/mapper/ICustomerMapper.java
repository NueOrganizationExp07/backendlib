package com.neusoft.hotelmanagement.customer.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotelmanagement.customer.model.CustomerModel;


@Mapper
public interface ICustomerMapper {
	//增加部门
	public void insert(CustomerModel dm) throws Exception;
	//修改部门
	public void update(CustomerModel dm) throws Exception;
	//删除部门
	public void delete(CustomerModel dm) throws Exception;
	//取得所有部门列表
	public List<CustomerModel> selectByAll() throws Exception;
	//取得所有部门列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
	public List<CustomerModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得部门的个数
	public int selectCountByAll() throws Exception;
	//根据部门的no（PK）取得指定的部门对象
	public CustomerModel selectByNo(String no) throws Exception;
}
