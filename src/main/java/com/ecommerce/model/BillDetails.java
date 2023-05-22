package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "billDetails")
public class BillDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String billCode;
	private String billName;
	private String billCom;
	private Integer billNum;
	private String money;
	private String provider;

	// Generate Getter and setter method

	public Integer getBid() {
		return id;
	}

	public void setBid(Integer bid) {
		this.id = bid;
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	public String getBillCom() {
		return billCom;
	}

	public void setBillCom(String billCom) {
		this.billCom = billCom;
	}

	public Integer getBillNum() {
		return billNum;
	}

	public void setBillNum(Integer billNum) {
		this.billNum = billNum;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

}
