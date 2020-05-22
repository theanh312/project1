package com.example.demo.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="namebrand")
	private String nameBrand;
	
	@Column(name="nationalbrand")
	private String nationalBrand;
	
	@OneToMany(mappedBy = "brand")
	private List<Car> listcar;
	
	public Brand() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameBrand() {
		return nameBrand;
	}
	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}
	public String getNationalBrand() {
		return nationalBrand;
	}
	public void setNationalBrand(String nationalBrand) {
		this.nationalBrand = nationalBrand;
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", nameBrand=" + nameBrand + ", nationalBrand=" + nationalBrand + "]";
	}
	
}