package com.neusoft.hotelmanagement.room.model;
import java.io.Serializable;
import org.apache.ibatis.type.Alias;
import java.util.List;

@Alias("Room")
public class RoomModel {
	private String RoomId=null;
	private String RoomType=null;
	private int RoomPrice=0;
	private String HotelId=null;
	public String getRoomId() {
		return RoomId;
	}
	public void setRoomId(String roomId) {
		RoomId = roomId;
	}

	public String getHotelId() {
		return HotelId;
	}
	public void setHotelId(String hotelId) {
		HotelId = hotelId;
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
	
	
	
}
