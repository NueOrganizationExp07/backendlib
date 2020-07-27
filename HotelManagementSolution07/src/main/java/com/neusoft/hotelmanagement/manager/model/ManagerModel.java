package com.neusoft.hotelmanagement.manager.model;
import java.io.Serializable;
import org.apache.ibatis.type.Alias;
import java.util.List;
@Alias("Manager")
public class ManagerModel {
	private int managerId=0;
	private String managerName=null;
	private String phoneNumber=null;
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
