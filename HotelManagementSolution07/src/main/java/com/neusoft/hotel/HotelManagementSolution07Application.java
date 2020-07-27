package com.neusoft.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.neusoft.hotel.certainhotel.mapper"})
public class HotelManagementSolution07Application {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementSolution07Application.class, args);
	}

}
//注解