package com.neusoft.hotelmanagement.room.model;
import java.io.Serializable;
import org.apache.ibatis.type.Alias;
import java.util.List;

@Alias("Room")
public class RoomModel {
	private int RoomId=0;
	private String RoomType=null;
	private int RoomPrice=0;
	private String HotelInfo=null;
	public int getRoomId() {
		return RoomId;
	}
	public void setRoomId(int roomId) {
		RoomId = roomId;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	public int getRoomPrice() {
		return RoomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		RoomPrice = roomPrice;
	}
	public String getHotelInfo() {
		return HotelInfo;
	}
	public void setHotelInfo(String hotelInfo) {
		HotelInfo = hotelInfo;
	}
	
	
}
