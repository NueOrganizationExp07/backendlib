package com.neusoft.hotelmanagement.customer.model;
import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;


@Alias("Customer")
public class CustomerModel {
	private String customerId=null;
	private String customerName=null;
	private String roomId=null;
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	private String CheckInDate=null;
	private String CheckOutDate=null;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckInDate(String checkInDate) {
		CheckInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return CheckOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		CheckOutDate = checkOutDate;
	}
	
}
