package com.orizon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.orizon.dao.Dao;
import com.orizon.model.Car;

@Service
public class ServiceImplementation implements AppService {

	@Autowired
	private Dao dao;
	
	@Override
	@Transactional
	public List<Car> getCars() {
		
		return dao.getCars();
	}

	@Override
	@Transactional
	public Car findCar(int carId) {
		
		return dao.findCar(carId);
		
	}

	@Override
	@Transactional
	public void save(Car car) {
		
		dao.save(car);
	}

	
	@Override
	@Transactional
	public void deleteCar(int carId) {
	
		dao.deleteCar(carId);
		
	}

	@Override
	@Transactional
	public List<Car> findCarByColor(String color) {
		
		return dao.findCarByColor(color);
	}

	@Override
	@Transactional
	public List<Car> findCarByModel(String model1) {
		
		return dao.findCarByModel(model1);
	}

	@Override
	@Transactional
	public List<Car> findCarByYearOfPurchase(String yop) {
		
		return dao.findCarByYearOfPurchase(yop);
	}

	@Override
	@Transactional
	public List<Car> findCarByPriceRange(double price) {
		
		return dao.findCarByPriceRange(price);
	}
	



}
