package com.neusoft.hotelmanagement.hotel.model;
import java.io.Serializable;
import org.apache.ibatis.type.Alias;
import java.util.List;
@Alias("Hotel")
public class HotelModel {
	private String hotelId=null;
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	private String hotelName=null;
	private String managerId=null;

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
