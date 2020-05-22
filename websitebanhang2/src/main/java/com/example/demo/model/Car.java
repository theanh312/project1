package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcar")
	private int idCar;
	
	@Column(name = "namecar")
	private String nameCar;
	
	@Column(name = "yearcar")
	private int yearCar;
	
	@Column(name = "colorcar")
	private String colorCar;
	
//	@Column(name = "idbrand")
//	private int idBrand;
	@ManyToOne
	@JoinColumn(name= "idbrand")
	private Brand brand;
	
	@Column(name = "enginecar")
	private String engineCar;
	
	@Column(name = "sizecar")
	private String sizeCar;
	
	@Column(name = "price")
	private long price;
	
	public Car() {
		super();
	}
	public int getIdCar() {
		return idCar;
	}
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	public String getNameCar() {
		return nameCar;
	}
	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}
	public int getYearCar() {
		return yearCar;
	}
	public void setYearCar(int yearCar) {
		this.yearCar = yearCar;
	}
	public String getColorCar() {
		return colorCar;
	}
	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}
//	public int getIdBrand() {
//		return idBrand;
//	}
//	public void setIdBrand(int idBrand) {
//		this.idBrand = idBrand;
//	}
	
	public String getEngineCar() {
		return engineCar;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public void setEngineCar(String engineCar) {
		this.engineCar = engineCar;
	}
	public String getSizeCar() {
		return sizeCar;
	}
	public void setSizeCar(String sizeCar) {
		this.sizeCar = sizeCar;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [idCar=" + idCar + ", nameCar=" + nameCar + ", yearCar=" + yearCar + ", colorCar=" + colorCar
				+ ", idBrand=" + brand + ", engineCar=" + engineCar + ", sizeCar=" + sizeCar + ", price=" + price
				+ "]";
	}
	
	
}

