package com.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.beans.Employee;
import com.beans.String;



@Entity

public class City implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int cityId;
	private String cityName;
	@JoinColumn(name="uid" ,  referencedColumnName = "uid" )
	@ManyToOne
	private Employee emp;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
}
