package com.neusoft.hotelmanagement.room.service;
import java.util.List;

import com.neusoft.hotelmanagement.hotel.model.HotelModel;
import com.neusoft.hotelmanagement.room.model.RoomModel;
public interface IRoomService {
	//增加房间
	public int addRoom(RoomModel dm) throws Exception;
	//修改房间
	public void modifyRoom(RoomModel dm) throws Exception;
	//删除房间
	public void deleteRoom(RoomModel dm) throws Exception;
	//取得所有房间列表
	public List<RoomModel> getListByAllRoom() throws Exception;
	//取得所有房间列表,分页模式
	public List<RoomModel> getListByAllWithPageRoom(int rows, int page) throws Exception;
	//取得房间的个数
	public int getCountByAllRoom() throws Exception;
	//取得房间的显示页数
	public int getPageCountByAllRoom(int rows) throws Exception;
	//根据房间的no（PK）取得指定的房间对象
	public RoomModel getByNoRoom(int no) throws Exception;
}
