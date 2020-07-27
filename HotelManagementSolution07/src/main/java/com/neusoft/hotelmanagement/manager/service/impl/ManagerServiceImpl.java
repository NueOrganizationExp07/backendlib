package com.neusoft.hotelmanagement.manager.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.neusoft.hotelmanagement.manager.mapper.IManagerMapper;
import com.neusoft.hotelmanagement.manager.model.ManagerModel;
import com.neusoft.hotelmanagement.manager.service.IManagerService;


@Service
@Transactional  //环绕事务Advice的切入点
public class ManagerServiceImpl implements IManagerService {
	@Autowired
	private IManagerMapper managerMapper=null;

	public int addManager(ManagerModel dm) throws Exception {
		managerMapper.insert(dm);
		return dm.getManagerId();
	}

	
	public void modifyManager(ManagerModel dm) throws Exception {
		managerMapper.update(dm);
	}

	
	public void deleteManager(ManagerModel dm) throws Exception {
		managerMapper.delete(dm);
	}

	
	public List<ManagerModel> getListByAllManager() throws Exception {
		
		return managerMapper.selectByAll();
	}


	public List<ManagerModel> getListByAllWithPageManager(int rows, int page) throws Exception {
		
		return managerMapper.selectByAllWithPage(rows*(page-1), rows);
	}


	public int getCountByAllManager() throws Exception {
		
		return managerMapper.selectCountByAll();
	}

	
	public int getPageCountByAllManager(int rows) throws Exception {
		
		int count=this.getCountByAllManager();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}


	public ManagerModel getByNoManager(int no) throws Exception {
		
		return managerMapper.selectByNo(no);
	}
}
