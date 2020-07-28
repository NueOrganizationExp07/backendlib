package com.neusoft.hotelmanagement.room.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotelmanagement.hotel.mapper.IHotelMapper;
import com.neusoft.hotelmanagement.hotel.model.HotelModel;
import com.neusoft.hotelmanagement.hotel.service.IHotelService;
import com.neusoft.hotelmanagement.room.mapper.IRoomMapper;
import com.neusoft.hotelmanagement.room.model.RoomModel;
import com.neusoft.hotelmanagement.room.service.IRoomService;


@Service
@Transactional  //环绕事务Advice的切入点
public class RoomServiceImpl implements IRoomService{
	@Autowired
	private IRoomMapper roomMapper=null;

	public String addRoom(RoomModel dm) throws Exception {
		roomMapper.insert(dm);
		return dm.getRoomId();
	}

	
	public void modifyRoom(RoomModel dm) throws Exception {
		roomMapper.update(dm);
	}

	
	public void deleteRoom(RoomModel dm) throws Exception {
		roomMapper.delete(dm);
	}

	
	public List<RoomModel> getListByAllRoom() throws Exception {
		
		return roomMapper.selectByAll();
	}


	public List<RoomModel> getListByAllWithPageRoom(int rows, int page) throws Exception {
		
		return roomMapper.selectByAllWithPage(rows*(page-1), rows);
	}


	public int getCountByAllRoom() throws Exception {
		
		return roomMapper.selectCountByAll();
	}

	
	public int getPageCountByAllRoom(int rows) throws Exception {
		
		int count=this.getCountByAllRoom();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}


	public RoomModel getByNoRoom(String no) throws Exception {
		
		return roomMapper.selectByNo(no);
	}

}
