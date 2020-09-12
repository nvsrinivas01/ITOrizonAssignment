package com.orizon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	

// Mandatory Fields
// Primary Key Auto Generation Annotation
	@Id
	@Column
	private int id;
	
	@Column
	private String company;

	@Column
	private String model;

	@Column
	private String color;

	@Column
	private String date_of_purchase;

	@Column
	private double price;

	@Column
	private double engine_capacity;

	@Column
	private String licence_plate_number;

	@Column
	private int seating_capacity;
	
	
	
//	Setters and Getters to set and get the values of the fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDate_of_purchase() {
		return date_of_purchase;
	}

	public void setDate_of_purchase(String date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(double engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	public String getLicence_plate_number() {
		return licence_plate_number;
	}

	public void setLicence_plate_number(String licence_plate_number) {
		this.licence_plate_number = licence_plate_number;
	}

	public int getSeating_capacity() {
		return seating_capacity;
	}

	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}

	//toString() for Debugging purpose
	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + ", model=" + model + ", color=" + color
				+ ", date_of_purchase=" + date_of_purchase + ", price=" + price + ", engine_capacity=" + engine_capacity
				+ ", licence_plate_number=" + licence_plate_number + ", seating_capacity=" + seating_capacity + "]";
	}

	
	



}
