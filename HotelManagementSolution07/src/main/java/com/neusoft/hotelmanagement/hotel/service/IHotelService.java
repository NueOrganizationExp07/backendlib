package com.neusoft.hotelmanagement.hotel.service;
import java.util.List;

import com.neusoft.hotelmanagement.hotel.model.HotelModel;


public interface IHotelService {
	//增加酒店
	public String addHotel(HotelModel dm) throws Exception;
	//修改酒店
	public void modifyHotel(HotelModel dm) throws Exception;
	//删除酒店
	public void deleteHotel(HotelModel dm) throws Exception;
	//取得所有酒店列表
	public List<HotelModel> getListByAllHotel() throws Exception;
	//取得所有酒店列表,分页模式
	public List<HotelModel> getListByAllWithPageHotel(int rows, int page) throws Exception;
	//取得酒店的个数
	public int getCountByAllHotel() throws Exception;
	//取得酒店的显示页数
	public int getPageCountByAllHotel(int rows) throws Exception;
	//根据酒店的no（PK）取得指定的部门对象
	public HotelModel getByNoHotel(String no) throws Exception;
	
}
