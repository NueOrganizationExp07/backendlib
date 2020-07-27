package com.neusoft.hotelmanagement.manager.service;
import java.util.List;


import com.neusoft.hotelmanagement.manager.model.ManagerModel;
public interface IManagerService {
		//增加负责人
		public int add(ManagerModel dm) throws Exception;
		//修改负责人
		public void modify(ManagerModel dm) throws Exception;
		//删除负责人
		public void delete(ManagerModel dm) throws Exception;
		//取得所有负责人列表
		public List<ManagerModel> getListByAll() throws Exception;
		//取得所有负责人列表,分页模式
		public List<ManagerModel> getListByAllWithPage(int rows, int page) throws Exception;
		//取得负责人的个数
		public int getCountByAll() throws Exception;
		//取得负责人的显示页数
		public int getPageCountByAll(int rows) throws Exception;
		//根据负责人的no（PK）取得指定的负责人对象
		public ManagerModel getByNo(int no) throws Exception;
}
