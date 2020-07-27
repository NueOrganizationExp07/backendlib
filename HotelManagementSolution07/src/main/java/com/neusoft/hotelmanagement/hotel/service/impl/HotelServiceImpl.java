package com.neusoft.hotelmanagement.hotel.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotelmanagement.hotel.mapper.IHotelMapper;
import com.neusoft.hotelmanagement.hotel.model.HotelModel;
import com.neusoft.hotelmanagement.hotel.service.IHotelService;


@Service
@Transactional  //环绕事务Advice的切入点
public class HotelServiceImpl implements IHotelService{
	@Autowired
	private IHotelMapper hotelMapper=null;

	public String addHotel(HotelModel dm) throws Exception {
		hotelMapper.insert(dm);
		return dm.getHotelId();
	}

	
	public void modifyHotel(HotelModel dm) throws Exception {
		hotelMapper.update(dm);
	}

	
	public void deleteHotel(HotelModel dm) throws Exception {
		hotelMapper.delete(dm);
	}

	
	public List<HotelModel> getListByAllHotel() throws Exception {
		
		return hotelMapper.selectByAll();
	}


	public List<HotelModel> getListByAllWithPageHotel(int rows, int page) throws Exception {
		
		return hotelMapper.selectByAllWithPage(rows*(page-1), rows);
	}


	public int getCountByAllHotel() throws Exception {
		
		return hotelMapper.selectCountByAll();
	}

	
	public int getPageCountByAllHotel(int rows) throws Exception {
		
		int count=this.getCountByAllHotel();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}


	public HotelModel getByNoHotel(String no) throws Exception {
		
		return hotelMapper.selectByNo(no);
	}

}
