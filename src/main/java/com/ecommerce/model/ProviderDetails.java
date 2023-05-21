package com.ecommerce.model;
/*
 * Product Backlog Item 53: Design the Restful web services to get the provider details.
 * By Snehal Jagtap
 */



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class ProviderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String providerCode;
	private String providerName;
	private String peoples;
	private String phones;
	private String address;
	private String faxs;
	private String describes;
	private String createDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProviderCode() {
		return providerCode;
	}

	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getPeople() {
		return peoples;
	}

	public void setPeople(String people) {
		this.peoples = people;
	}

	public String getPhone() {
		return phones;
	}

	public void setPhone(String phone) {
		this.phones = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFax() {
		return faxs;
	}

	public void setFax(String fax) {
		this.faxs = fax;
	}

	public String getDescribe() {
		return describes;
	}

	public void setDescribe(String describe) {
		this.describes = describe;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
