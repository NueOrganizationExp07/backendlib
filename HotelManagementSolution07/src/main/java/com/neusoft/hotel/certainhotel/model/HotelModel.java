package com.neusoft.hotel.certainhotel.model;
import java.io.Serializable;
import org.apache.ibatis.type.Alias;
import java.util.List;
@Alias("Hotel")
public class HotelModel {
	private int hotelId=0;
	private String hotelName=null;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
}
