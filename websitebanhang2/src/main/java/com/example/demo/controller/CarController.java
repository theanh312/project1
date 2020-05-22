package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.CarServiceDaoImpl;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CarController {
	@Autowired
	private CarServiceDaoImpl carServiceDao;
	
	@GetMapping("/cars")
	public List<Car> getAllCar(){
		List<Car> list= carServiceDao.getAllCar();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		return list;
	}
}
