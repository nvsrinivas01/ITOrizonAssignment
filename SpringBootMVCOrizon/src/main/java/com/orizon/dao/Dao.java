package com.orizon.dao;

import java.util.List;

import com.orizon.model.Car;

public interface Dao {

	public List<Car> getCars();	

	public void save(Car car);

	public Car findCar(int carId);

	public void deleteCar(int carId);

	public List<Car> findCarByColor(String color);

	public List<Car> findCarByModel(String model1);

	public List<Car> findCarByYearOfPurchase(String yop);

	public List<Car> findCarByPriceRange(double price);
}
