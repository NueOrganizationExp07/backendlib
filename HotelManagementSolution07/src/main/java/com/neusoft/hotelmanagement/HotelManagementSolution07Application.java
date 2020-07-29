package com.neusoft.hotelmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.neusoft.hotelmanagement.hotel.mapper","com.neusoft.hotelmanagement.manager.mapper","com.neusoft.hotelmanagement.room.mapper","com.neusoft.hotelmanagement.customer.mapper","com.neusoft.hotelmanagement.employee.mapper"})
public class HotelManagementSolution07Application {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementSolution07Application.class, args);
	}

}
//注解