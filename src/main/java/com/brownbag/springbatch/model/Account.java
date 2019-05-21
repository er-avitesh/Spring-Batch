package com.brownbag.springbatch.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private Integer AccountNbr;
	private String name;
	private String city;
	private String type;

	public Account() {
		super();
	}

	public Account(Integer accountNbr, String name, String city, String type) {
		super();
		AccountNbr = accountNbr;
		this.name = name;
		this.city = city;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Account [AccountNbr=" + AccountNbr + ", name=" + name + ", city=" + city + ", type=" + type + "]";
	}

	public Integer getAccountNbr() {
		return AccountNbr;
	}

	public void setAccountNbr(Integer accountNbr) {
		AccountNbr = accountNbr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
