package com.neusoft.hotelmanagement.hotel.model;
import java.io.Serializable;
import org.apache.ibatis.type.Alias;
import java.util.List;
@Alias("Hotel")
public class HotelModel {
	private String hotelId=null;
	private String hotelName=null;
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
}
