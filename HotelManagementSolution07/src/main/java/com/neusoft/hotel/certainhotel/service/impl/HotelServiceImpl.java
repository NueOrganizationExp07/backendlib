package com.neusoft.hotel.certainhotel.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.certainhotel.mapper.IHotelMapper;
import com.neusoft.hotel.certainhotel.model.HotelModel;
import com.neusoft.hotel.certainhotel.service.IHotelService;


@Service
@Transactional  //环绕事务Advice的切入点
public class HotelServiceImpl implements IHotelService{
	@Autowired
	private IHotelMapper hotelMapper=null;

	public int add(HotelModel dm) throws Exception {
		hotelMapper.insert(dm);
		return dm.getHotelId();
	}

	
	public void modify(HotelModel dm) throws Exception {
		hotelMapper.update(dm);
	}

	
	public void delete(HotelModel dm) throws Exception {
		hotelMapper.delete(dm);
	}

	
	public List<HotelModel> getListByAll() throws Exception {
		
		return hotelMapper.selectByAll();
	}


	public List<HotelModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return hotelMapper.selectByAllWithPage(rows*(page-1), rows);
	}


	public int getCountByAll() throws Exception {
		
		return hotelMapper.selectCountByAll();
	}

	
	public int getPageCountByAll(int rows) throws Exception {
		
		int count=this.getCountByAll();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}


	public HotelModel getByNo(int no) throws Exception {
		
		return hotelMapper.selectByNo(no);
	}

}
