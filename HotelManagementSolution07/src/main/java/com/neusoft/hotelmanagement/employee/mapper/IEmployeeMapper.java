package com.neusoft.hotelmanagement.employee.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotelmanagement.employee.model.EmployeeModel;



@Mapper
public interface IEmployeeMapper {
	//增加员工
	public void insert(EmployeeModel dm) throws Exception;
	//修改员工
	public void update(EmployeeModel dm) throws Exception;
	//删除员工
	public void delete(EmployeeModel dm) throws Exception;
	//取得所有员工列表
	public List<EmployeeModel> selectByAll() throws Exception;
	//取得所有员工列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
	public List<EmployeeModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得员工的个数
	public int selectCountByAll() throws Exception;
	//根据员工的no（PK）取得指定的员工对象
	public EmployeeModel selectByNo(String no) throws Exception;
}
