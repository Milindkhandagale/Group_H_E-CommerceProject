package com.ecommerce.model;
/*Author Pragati Dabade*/
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "product")
public class Product {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String catagories;
	@OneToOne(targetEntity = Bike.class, cascade = CascadeType.ALL)
	private Bike bike;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatagories() {
		return catagories;
	}
	public void setCatagories(String catagories) {
		this.catagories = catagories;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
	

}
