package com.neusoft.hotelmanagement.hotel.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotelmanagement.hotel.model.HotelModel;

@Mapper
public interface IHotelMapper {
		//增加酒店
		public void insert(HotelModel dm) throws Exception;
		//修改酒店
		public void update(HotelModel dm) throws Exception;
		//删除酒店
		public void delete(HotelModel dm) throws Exception;
		//取得所有酒店列表
		public List<HotelModel> selectByAll() throws Exception;
		//取得所有酒店列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
		public List<HotelModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
		//取得酒店的个数
		public int selectCountByAll() throws Exception;
		//根据酒店的no（PK）取得指定的部门对象
		public HotelModel selectByNo(String no) throws Exception;
		//取得指定的酒店，并取得其关联的房间集合
		//public HotelModel selectByNoWithEmployees(String no) throws Exception;
		
}
