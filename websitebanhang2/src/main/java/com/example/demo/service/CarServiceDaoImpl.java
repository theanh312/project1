package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@Service
public class CarServiceDaoImpl implements CarServiceDao {
	@Autowired
	private CarRepository carRepository;
	
	@Override
	public List<Car> getAllCar() {
		return this.carRepository.findAll();
	}
	
}
