/*
 * Author : Pragati Dabade
 */
package com.ecommerce.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class Provider {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;

	private String providerCode;

	private String providerName;

	private String peoples;

	private String phones;

	private String address;

	private String faxs;

	private String describes;

	private Date createDate;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
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

	public String getPeoples() {
		return peoples;
	}

	public void setPeoples(String peoples) {
		this.peoples = peoples;
	}

	public String getPhones() {
		return phones;
	}

	public void setPhones(String phones) {
		this.phones = phones;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFaxs() {
		return faxs;
	}

	public void setFaxs(String faxs) {
		this.faxs = faxs;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
	
	
}
