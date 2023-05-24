package com.ecommerce.model;
/*Author Pragati Dabade*/
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "bike")
public class Bike {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String bikenum;
	private String bikename;
	private String bikevar;
	private int modelyear;
	private String status;
	private LocalDate createdon;
	private int price;


	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_bike_id", referencedColumnName = "bike_id")
	private List<Booking> booking;


}
