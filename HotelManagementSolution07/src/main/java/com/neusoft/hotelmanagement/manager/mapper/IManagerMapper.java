package com.neusoft.hotelmanagement.manager.mapper;
import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.neusoft.hotelmanagement.manager.model.ManagerModel;

public interface IManagerMapper {
	//增加负责人
	public void insert(ManagerModel dm) throws Exception;
	//修改负责人
	public void update(ManagerModel dm) throws Exception;
	//删除负责人
	public void delete(ManagerModel dm) throws Exception;
	//取得所有负责人列表
	public List<ManagerModel> selectByAll() throws Exception;
	//取得所有负责人列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
	public List<ManagerModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得负责人的个数
	public int selectCountByAll() throws Exception;
	//根据负责人的no（PK）取得指定的部门对象
	public ManagerModel selectByNo(int no) throws Exception;
	//取得指定的负责人，并取得其关联的酒店集合
	public ManagerModel selectByNoWithEmployees(int no) throws Exception;
}
